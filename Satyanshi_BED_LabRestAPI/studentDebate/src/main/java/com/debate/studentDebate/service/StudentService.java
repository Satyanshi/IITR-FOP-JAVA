package com.debate.studentDebate.service;


import java.util.List;
import com.debate.studentDebate.entity.Students;

public interface StudentService {
	Students findById(Long id);
	Students updateStudent(Students students, Long id);
	Students saveStudent(Students students);

	void deleteStudent(Long id) throws Exception;
	List<Students> findAllStudents();
}
