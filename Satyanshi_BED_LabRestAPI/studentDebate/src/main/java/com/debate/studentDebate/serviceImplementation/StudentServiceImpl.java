package com.debate.studentDebate.serviceImplementation;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debate.studentDebate.entity.Students;
import com.debate.studentDebate.repository.studentRepo;
import com.debate.studentDebate.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private studentRepo studentRepository;

    @Override
    public Students saveStudent(Students students) {
    	
        return studentRepository.save(students);
    	
    }

    @Override
    public List<Students> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) throws Exception {
			studentRepository.deleteById(id);
    }

	@Override
	public Students findById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Students updateStudent(Students students, Long id) {
		Students gotStudent = studentRepository.findById(id).get();
			gotStudent.setFName(students.getFName());
			gotStudent.setLName(students.getLName());
			gotStudent.setCountry(students.getCountry());
			gotStudent.setCourses(students.getCourses());
			gotStudent.setRole(students.getRoles());
			return studentRepository.save(gotStudent);
	}
}