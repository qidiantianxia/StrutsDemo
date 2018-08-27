package com.jike.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String execute() throws Exception {

		if (username.equals("admin") && password.equals("123456")) {
			ServletActionContext.getRequest().getSession().setAttribute("username", username);
			return "success";
		} else {
			return "error";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
