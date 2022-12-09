package com.posidex.lic.impl.service;

import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import com.posidex.lic.api.service.MessageService;

/**
 * The Class MessageByLocaleService.
 */
@Service
public class MessageByLocaleService implements MessageService {

	/** The message source. */
	@Autowired
	private MessageSource messageSource;

	/** The accessor. */
	private MessageSourceAccessor accessor;

	@PostConstruct
	private void init() {
		Locale locale = LocaleContextHolder.getLocale();
		accessor = new MessageSourceAccessor(messageSource, locale);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.posidex.stsgtapp.api.service.MessageService#getMessage(java.lang.String)
	 */
	@Override
	public String getMessage(String key) {

		return accessor.getMessage(key);
	}

}
