package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.Studentrepositary;
import com.example.demo.entity.Student;

public class StudentServiceImpl implements StudentService{

	@Autowired
	Studentrepositary repo;
	
	@Override
	public List<Student> getAllStudents() {

		return repo.findAll();
	}

}
