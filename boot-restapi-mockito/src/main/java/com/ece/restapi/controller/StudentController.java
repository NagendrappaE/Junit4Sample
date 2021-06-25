package com.ece.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ece.restapi.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentServiceImpl;

	@GetMapping("save/{val}")
	public ResponseEntity savedetails(@PathVariable("val") String n) {

		System.out.println("the incoming name" + n);
		studentServiceImpl.saveData(n);

		return new ResponseEntity("success", HttpStatus.OK);
	}

}
