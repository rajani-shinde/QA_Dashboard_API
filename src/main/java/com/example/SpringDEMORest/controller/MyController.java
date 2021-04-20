package com.example.SpringDEMORest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDEMORest.entity.Credientials;
import com.example.SpringDEMORest.services.credentialServices;

@RestController
public class MyController {
	@Autowired
	private credentialServices credserv;
	@GetMapping("/getCrediantials")
	public List<Credientials> getCrediantials()
	{
		return this.credserv.getLoginData();
	}
	
}


//@GetMapping("/crediantials")
//public String crediantials()
//{
//		return "My name is rajani"; 
//}