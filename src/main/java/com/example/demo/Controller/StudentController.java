package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.StudentService;

@Controller
@RequestMapping
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/Student-crud")
	String getAllStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		System.out.println("Hello WOrld : ");
		return "view-students";
		
	}

}
