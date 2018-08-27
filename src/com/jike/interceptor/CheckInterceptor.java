package com.jike.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sun.net.httpserver.Authenticator.Success;

public class CheckInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5836201303675971816L;

	@Override
	public void init() {
		System.out.println("Interceptor init");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		String url = "";
		System.out.println("start Interceptor intercept");
		if (null != ServletActionContext.getRequest().getSession().getAttribute("username")) {
			/*url = arg0.invoke();*/
			url = "success";
		} else {
			url = "error";
		}
		return url;
	}

	@Override
	public void destroy() {
		System.out.println("Interceptor destroy");
	}

}
