/*
 * Copyright © 2008 Posidex Technologies Pvt Ltd. All rights reserved.
 * 
 * Created on Feb 02, 2008
 */

package com.posidex.lic.exception;

/**
 * <p>DAO should throw the custom <code>DAOException</code>.. </p>
 * 
 * @author <a href="mailto:madankm@posidex.com">Madan KM</a>
 * @version v1.0
 */
public class DAOException extends Exception 
{
	/** Serial version UID field for serializable class. */
	private static final long serialVersionUID = 1064634976016732967L;

	/**
	 * <p>Default no argument constructor.</p>
	 */
	public DAOException() {
		super();
	}

	/**
	 * <p>Constructor taking an exception message.</p>
	 * 
	 * @param message an Exception message.
	 */
	public DAOException(String message) {
		super(message);
	}

	/**
	 * <p>Constructor taking an Exception cause.</p>
	 * 
	 * @param cause an Exception cause.
	 */
	public DAOException(Throwable cause) {
		super(cause);
	}

	/**
	 * <p>Constructor taking an exception message and an exception cause.</p>
	 * 
	 * @param message an Exception message.
	 * @param cause an Exception cause.
	 */
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}
}

