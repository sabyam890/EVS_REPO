package com.saby.evs.exception;

public class ServiceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String param) {
		super(param);
	}

	public ServiceException(Throwable throwable) {
		super(throwable);
	}

	public ServiceException(String param, Throwable throwable) {
		super(param, throwable);
	}
}
