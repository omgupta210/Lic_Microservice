package com.posidex.lic.api.service;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpStatus;

import com.posidex.lic.exception.CustomException;
import com.posidex.lic.model.DetailsRequest;
import com.posidex.lic.model.ServiceRequest;
import com.posidex.lic.util.ResponseJson;

public interface SearchService {
	public ResponseJson<HttpStatus, ?> getDetails(ServiceRequest request) throws CustomException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException;

	public ResponseJson<HttpStatus, ?> getToken()
			throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException, CustomException;

}
