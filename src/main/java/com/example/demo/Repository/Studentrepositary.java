package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface Studentrepositary extends JpaRepository<Student, Integer>{

}
