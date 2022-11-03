package com.demo.crudop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.crudop.entities.Student;

//T - It will deal with which entity
//ID - which is primary key in table  and we need to give wrapper class name
//public interface StudentRepository extends CrudRepository<T, ID> {

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
