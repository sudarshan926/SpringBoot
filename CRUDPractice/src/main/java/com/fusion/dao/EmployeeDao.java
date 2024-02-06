package com.fusion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fusion.dto.Employee;

@Repository
public interface EmployeeDao  extends CrudRepository<Employee, Integer>{

}
