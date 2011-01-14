package com.qualityobjects.hello.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.qualityobjects.com.LoginLocal;

@ManagedBean
public class LoginBean {

	private String name;
	private String password;
	@EJB LoginLocal helloEJB;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		return helloEJB.login(name, password.toCharArray());
	}
}
