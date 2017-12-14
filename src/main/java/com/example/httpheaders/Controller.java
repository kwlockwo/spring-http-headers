package com.example.httpheaders;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/fixtures", method = RequestMethod.GET)
	public Map<String, String> headers(@RequestHeader Map<String, String> headers) {
		return headers;
	}
}
