package com.posidex.lic.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.posidex.lic.model.ServiceRequest;

public interface SearchController {

	public ResponseEntity<?> realTimeSearch(  ServiceRequest request) throws Exception;

	public ResponseEntity<?> getToken() throws Exception;
}
