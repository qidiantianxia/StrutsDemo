package com.jike.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7016796101531331454L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		System.out.println("start MethodInterceptor doIntercept");
		String url = arg0.invoke();
		System.out.println("end MethodInterceptor doIntercept");
		return url;
	}

}
