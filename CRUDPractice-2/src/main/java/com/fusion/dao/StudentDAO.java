package com.fusion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fusion.dto.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{

}
