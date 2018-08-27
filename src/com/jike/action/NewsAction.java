package com.jike.action;

import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String add() throws Exception {
		System.out.println("News Add");
		return SUCCESS;
	}

	public String show() throws Exception {

		System.out.println("News Show");
		return SUCCESS;
	}
}