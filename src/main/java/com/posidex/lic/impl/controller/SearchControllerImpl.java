package com.posidex.lic.impl.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.posidex.lic.api.controller.SearchController;
import com.posidex.lic.api.service.MessageService;
import com.posidex.lic.api.service.SearchService;
import com.posidex.lic.exception.CustomException;
import com.posidex.lic.model.ServiceRequest;
import com.posidex.lic.util.ResponseJson;

@RestController
@RequestMapping("/psx/restservice/licms")
public class SearchControllerImpl implements SearchController {
	@Autowired
	private SearchService service;
	@Autowired
	Environment env;
	@Autowired
	private MessageService messageService;
	private final Logger logger = LoggerFactory.getLogger(SearchService.class);
	ResponseJson<HttpStatus, ?> responseJson = new ResponseJson<>();

	@PostMapping("getAllDetails")
	public ResponseEntity<?> realTimeSearch(@RequestBody ServiceRequest request) throws Exception {
		ResponseEntity<?> responseEntity = null;

		logger.info("request.getName()" + request.getName());
		if (request.getName() == null || request.getName().isEmpty()) {
			responseJson.setMessage(env.getProperty("INPUT_NAME_ERROR"));
			responseJson.setStatus(HttpStatus.BAD_REQUEST);
			responseJson.setData(null);
			return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
		}

		if (request.getName() != null || !(request.getName().isEmpty())) {
			if (request.getDob() == null || (request.getDob().isEmpty())) {
				responseJson.setMessage(env.getProperty("INPUT_DOB_ERROR"));
				responseJson.setStatus(HttpStatus.BAD_REQUEST);
				responseJson.setData(null);
				return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
			}
		}

		try {
			responseJson = service.getDetails(request);
			responseJson.setStatus(HttpStatus.OK);
			logger.info("reponse" + responseJson.getStatus());
			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.OK);
//		} 
//		catch (NullPointerException e) {
//			// e.printStackTrace();
//			logger.info(e.getMessage());
//			logger.info("Message from Service" + env.getProperty("REQUEST_ERROR"));
//			responseJson.setMessage(env.getProperty("REQUEST_ERROR"));
//
//			responseJson.setStatus(HttpStatus.BAD_REQUEST);
//
//			return new ResponseEntity<>(responseJson, HttpStatus.BAD_REQUEST);
		} catch (CustomException ce) {

			ResponseJson<HttpStatus, Map<String, String>> responseJson = new ResponseJson<>();

			responseJson.setMessage(env.getProperty("message.unsuccessful"));
			Map<String, String> data = new HashMap<>();
			data.put("message", ce.getMessage());
			responseJson.setData(data);
			responseJson.setStatus(HttpStatus.PRECONDITION_FAILED);

			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.PRECONDITION_FAILED);

		} catch (RuntimeException re) {
			re.printStackTrace();
			logger.error(re.getMessage(), re);

			ResponseJson<HttpStatus, Map<String, String>> responseJson = new ResponseJson<>();

			responseJson.setMessage(env.getProperty("message.unsuccessful"));
					//messageService.getMessage("message.unsuccessful"));
			Map<String, String> data = new HashMap<>();
			data.put("message", env.getProperty("message.unsuccessful"));
			responseJson.setData(data);
			responseJson.setStatus(HttpStatus.PRECONDITION_FAILED);

			responseEntity = new ResponseEntity<>(responseJson, HttpStatus.PRECONDITION_FAILED);

		}

		return responseEntity;

		
	}

	@Override
	@GetMapping("getToken")
	public ResponseEntity<?> getToken() throws Exception {
		ResponseEntity<?> responseEntity = null;
		ResponseJson<HttpStatus, ?> responseJson = service.getToken();
		logger.info("reponse" + responseJson.getStatus());
		responseEntity = new ResponseEntity<>(responseJson, HttpStatus.OK);
		return responseEntity;
	}

}
