package com.example.curdopratiom.dou;

import org.springframework.stereotype.Repository;

import com.example.curdopratiom.model.Student;

@Repository
public interface DouStudent extends JpaRepository<Student,Integer>{

	
 
}
