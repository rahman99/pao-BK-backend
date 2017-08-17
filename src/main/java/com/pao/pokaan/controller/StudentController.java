package com.pao.pokaan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pao.pokaan.dao.StudentDao;
import com.pao.pokaan.entity.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody @Valid Student s){
        studentDao.save(s);
    }
    
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Iterable<Student> semuaTransfer(){
        return studentDao.findAll();
    }
}
