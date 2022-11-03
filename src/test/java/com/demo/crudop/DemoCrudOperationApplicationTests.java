package com.demo.crudop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.crudop.entities.Student;

@SpringBootTest
class DemoCrudOperationApplicationTests {

	@Test
	void insertStudentRecords() {
		//Jpa will take data of the object and push that to the table 
		Student student = new Student();
	}

}
