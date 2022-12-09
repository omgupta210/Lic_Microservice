package com.posidex.lic.api.service;

import org.springframework.stereotype.Service;

/**
 * The Interface MessageService.
 */
@Service
public interface MessageService {

	/**
	 * Gets the message.
	 *
	 * @param key the key
	 * @return the message
	 */
	public String getMessage(String key);
}
