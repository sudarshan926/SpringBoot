package com.fusion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fusion.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

}