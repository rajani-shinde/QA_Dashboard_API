package com.example.SpringDEMORest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringDEMORest.entity.Credientials;
@Service
public class credentialServicesImpl implements credentialServices {

	List<Credientials> list;
	public  credentialServicesImpl()
	{
		list=new ArrayList<>();
		list.add(new Credientials("rajani@gmail.com","Rajani"));
		list.add(new Credientials("rohan@gmail.com","rohan"));
		list.add(new Credientials("mayur@gmail.com","Mayur"));
		list.add(new Credientials("qwe@gmail.com","qwe"));
		list.add(new Credientials("bcz@gmail.com","bcz"));
		list.add(new Credientials("abc@gmail.com","abc"));

	}
	
 	
	@Override
	public List<Credientials> getLoginData() {
		// TODO Auto-generated method stub
		return list;
	}
 
	
}
