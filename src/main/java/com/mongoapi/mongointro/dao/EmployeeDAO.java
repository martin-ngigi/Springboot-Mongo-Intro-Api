package com.mongoapi.mongointro.dao;

import com.mongoapi.mongointro.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends MongoRepository<Employee, Long> {

}
