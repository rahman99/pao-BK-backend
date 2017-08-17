package com.pao.pokaan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pao.pokaan.entity.Student;

public interface StudentDao extends PagingAndSortingRepository<Student, String>{

}
