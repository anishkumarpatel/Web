package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Hello - 1");
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Hello - 2");
	}
// http://localhost:8080/students

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Anish", "Patel", "anishpa1996@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Abhinav", "Dongre", "abhinav@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Akash", "Anappalli", "akash@gmail.com");
		 * studentRepository.save(student3);
		 */
	}

}
