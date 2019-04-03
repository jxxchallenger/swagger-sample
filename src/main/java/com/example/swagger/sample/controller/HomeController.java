package com.example.swagger.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/home"}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {

	@GetMapping
	public ResponseEntity<Home> getHome() {
		Home home = new Home();
		home.setAddress("adfsd");
		home.setName("adfasdf");
		
		return new ResponseEntity<Home>(home, HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<Home> postHome() {
		Home home = new Home();
		home.setAddress("adfsd");
		home.setName("adfasdf");
		
		return new ResponseEntity<Home>(home, HttpStatus.OK); 
	}
	
	@PutMapping
	public ResponseEntity<Home> putHome() {
		Home home = new Home();
		home.setAddress("adfsd");
		home.setName("adfasdf");
		
		return new ResponseEntity<Home>(home, HttpStatus.OK); 
	}
	
	@PatchMapping
	public ResponseEntity<Home> putchHome() {
		Home home = new Home();
		home.setAddress("adfsd");
		home.setName("adfasdf");
		
		return new ResponseEntity<Home>(home, HttpStatus.OK); 
	}
	
	@DeleteMapping
	public ResponseEntity<Home> deleteHome() {
		Home home = new Home();
		home.setAddress("adfsd");
		home.setName("adfasdf");
		
		return new ResponseEntity<Home>(home, HttpStatus.OK); 
	}
}
