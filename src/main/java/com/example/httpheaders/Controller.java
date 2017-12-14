package com.example.httpheaders;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	public Map<String, String> headers(@RequestHeader Map<String, String> headers) {
		return headers;
	}
}
