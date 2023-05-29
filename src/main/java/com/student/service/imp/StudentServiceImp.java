package com.student.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.servic.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
