package com.posidex.lic.exception;

/**
 * The Class CustomException.
 */
public class CustomException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String code;

	/**
	 * Instantiates a new custom exception.
	 */
	public CustomException() {
		super();
	}

	/**
	 * Instantiates a new custom exception.
	 *
	 * @param message the message
	 */
	public CustomException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String message, String code) {
		super(message);
		this.code = code;
	}

	public String getCode() {
		if (code == null) {
			code = "RTE";
		}
		return code;
	}
}
