package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class MedicalController {
	@Autowired
	MedicalRepo servicerepository;
	@Autowired
	MedicalService service;
	
	@GetMapping("/get")
	public List<Medical> gett()
	{
		return service.getal();
	}
	@PostMapping("/post")
	public Medical post(@RequestBody Medical val) {
		return service.Posting(val);
	}
	@PutMapping("/put")
	public String put(@RequestBody Medical id)
	{
		return service.Putting(id);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id){
		return service.Deleteing(id);
	}

}
