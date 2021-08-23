package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FrontController {
	
	@GetMapping(value = "/getData")
	public List<Parameters> getDummyData(){
		List<Parameters> list = new ArrayList<>();
		Parameters p1 = new Parameters();
		p1.parameterName = "Attribute 1 Number";
		p1.dataType = "number";
		
		Parameters p2 = new Parameters();
		p2.parameterName = "Attribute 2 Text";
		p2.dataType = "text";
		
		Parameters p3 = new Parameters();
		p3.parameterName = "Attribute 3 Checkbox";
		p3.dataType = "checkbox";
		
		Parameters p4 = new Parameters();
		p4.parameterName = "Attribute 4 Radio";
		p4.dataType = "radio";
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		return list;
	}
	
}
