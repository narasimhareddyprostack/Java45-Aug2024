package com.pro.jpamongodb.document;

import com.pro.jpamongodb.model.Employee;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document
public interface EmpDocument extends MongoRepository<Employee,Integer> {
}
