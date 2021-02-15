package com.example.democicd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	@GetMapping(value = "/books")
	public ResponseEntity<?> getTestData(){
		Map<String, String> responseMap = new HashMap<>(4);
		responseMap.put("name", "two towers");
		return new ResponseEntity<>(responseMap, HttpStatus.OK);
	}
	

}
