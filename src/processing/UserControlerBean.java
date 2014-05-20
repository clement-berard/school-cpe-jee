package processing;

import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import model.LoginBean;
import model.UserModelBean;
import model.UserSubmissionModelBean;
import dao.DaoFabric;
import dao.UserDao;

@ManagedBean(name = "lecontrolleruser")
@ApplicationScoped
// Utilisation de application scope afin d'offrir un point d'entrée unique à
// l'ensemble des clients
public class UserControlerBean {
	private UserDao userDao;
	private UserModelBean userLogged = null;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserModelBean getUserLogged() {
		return userLogged;
	}

	public void setUserLogged(UserModelBean userLogged) {
		this.userLogged = userLogged;
	}

	public UserControlerBean() {
		this.userDao = DaoFabric.getInstance().createUserDao();
	}

	public String checkUser(LoginBean loginBean) {
		UserModelBean user = this.userDao.checkUser(loginBean.getLogin(),
				loginBean.getPwd());
		if (user != null) {
			// récupère l'espace de mémoire de JSF
			ExternalContext externalContext = FacesContext.getCurrentInstance()
					.getExternalContext();
			Map<String, Object> sessionMap = externalContext.getSessionMap();

			// place l'utilisateur dans l'espace de mémoire de JSF
			sessionMap.put("loggedUser", user);
			this.userLogged = user;
			// pour les tests
			//sessionMap.remove("loggedUser");

			// redirect the current page
			this.message = "ok bien connecté !";
			return "userdisplay.xhtml";
		} else {
			this.message = "Vous avez fait une erreur !";
			// redirect the current page
			return "userLogin.xhtml";
		}
	}

	public void checkAndAddUser(UserSubmissionModelBean userSubmitted) {

		UserModelBean user = this.userDao.checkUser(userSubmitted.getLogin(),
				userSubmitted.getPwd());
		if (user != null) {

		} else {
			this.userDao.addUser(userSubmitted);
		}
	}

}
