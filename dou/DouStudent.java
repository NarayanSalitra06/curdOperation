package com.example.curdopratiom.dou;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curdopratiom.model.Student;

@Repository
public interface DouStudent extends JpaRepository<Student,Integer>{

	
 
}
