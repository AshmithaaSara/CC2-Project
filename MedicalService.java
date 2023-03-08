package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MedicalService {
	@Autowired
	MedicalRepo repository;
	
	public List<Medical> getal()
	{
		return repository.findAll();
	}
	public Medical Posting(@RequestBody Medical val) 
	{
		return repository.save(val);
	}
	public String Putting(@RequestBody Medical id)
	{
		repository.save(id);
		return "Updated";
	}
	public String Deleteing(int id)
	{
		repository.deleteById(id);
		return "deleted";
	}

}



