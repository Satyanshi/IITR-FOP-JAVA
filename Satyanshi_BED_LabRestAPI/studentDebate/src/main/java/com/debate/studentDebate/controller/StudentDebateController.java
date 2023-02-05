package com.debate.studentDebate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.debate.studentDebate.entity.Students;
import com.debate.studentDebate.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentDebateController {
	@Autowired
	private StudentService studentService;
	
	  @PostMapping
	  public ResponseEntity<Students> addStudent(@RequestBody Students students) {
	    Students newStudent = studentService.saveStudent(students);
	    return ResponseEntity.ok(newStudent);
	  }

	  @DeleteMapping("/{id}")
	  public ResponseEntity<String> deleteStudent(@PathVariable Long id) throws Exception {
		  Students gotStudent = studentService.findById(id);
	  
		  if(gotStudent.getRoles().getRolesname().equals("ROLE_ADMIN"))
			{
			    studentService.deleteStudent(id);
			    return ResponseEntity.ok("Deleted Successfully");
			}
		  else return new ResponseEntity<>("You are not authorized to delete", HttpStatus.BAD_REQUEST);
	  }
	  
	  @PutMapping("/{id}")
	  public ResponseEntity<String> updateStudent(@RequestBody Students students, @PathVariable Long id) {
	    
	    Students gotStudent = studentService.findById(id);
	    System.out.println(gotStudent.getRoles().getRolesname());
		if(gotStudent.getRoles().getRolesname().equals("ROLE_ADMIN"))
		{
			studentService.updateStudent(students, id);
			return new ResponseEntity<>("Student updated successfull !", HttpStatus.OK);
		}
			else return new ResponseEntity<>("You are not authorized to update entry", HttpStatus.BAD_REQUEST);
		
	  }

	  @GetMapping
	  public ResponseEntity<List<Students>>  getAllStudents() {
	    List<Students> studentsList = studentService.findAllStudents();
	    return ResponseEntity.ok(studentsList);
	  }
}
