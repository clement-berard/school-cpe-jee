package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "leuser")
@SessionScoped
// contrainte BEAN implements Serializable
public class UserModelBean implements Serializable {
	protected String lastname;
	protected String firstname;
	protected String email;

	protected int age;
	protected String login;
	protected String pwd;

	// Contrainte BEAN constructeur sans paramètre
	public UserModelBean() {
	}

	public UserModelBean(String lastname, String surname, int age,
			String login, String pwd) {
		this.lastname = lastname;
		this.firstname = surname;
		this.age = age;
		this.login = login;
		this.pwd = pwd;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String fisrtname) {
		this.firstname = fisrtname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "[SURNAME]:" + this.getFirstname() + ",[LASTNAME]:"
				+ this.getLastname() + ",[AGE]:" + this.getAge() + ",[LOGIN]:"
				+ this.getLogin() + ",[PWD]:" + this.getPwd();
	}

}
