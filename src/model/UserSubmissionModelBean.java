package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "leuserenvoye")
@RequestScoped
// Dur�e de vue uniquement lors d'une requ�te
// m�me propri�t�s que UserModelBean mais port�e diff�rente
public class UserSubmissionModelBean extends UserModelBean {
	private String rpwd;

	public UserSubmissionModelBean() {
	}

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}

}
