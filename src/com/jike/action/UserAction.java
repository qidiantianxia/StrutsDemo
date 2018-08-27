package com.jike.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 2558343769361074535L;

	public String add() throws Exception {

		System.out.println("User Add");
		return SUCCESS;
	}

	public String show() throws Exception {

		System.out.println("User Show");
		return SUCCESS;
	}
}