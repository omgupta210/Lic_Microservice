package com.posidex.lic.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class ResponseJson.
 *
 * @param <S> the generic type
 * @param <T> the generic type
 */
public class ResponseJson<S, T> {
	
	/** The status. */
	private S status;
	
	/** The message. */
	private String message;
	
	/** The data. */
	private T data;

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public S getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(S status) {
		this.status = status;
	}
	
	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
		@Override
		public String toString(){
			String str="";
			try {
				str=new ObjectMapper().writeValueAsString(this);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return str;
		}

}
