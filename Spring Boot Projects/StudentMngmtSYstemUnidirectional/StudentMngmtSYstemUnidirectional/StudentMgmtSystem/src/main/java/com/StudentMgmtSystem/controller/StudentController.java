package com.StudentMgmtSystem.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.StudentMgmtSystem.Service.StudentService;
import com.StudentMgmtSystem.entity.Student;



@RestController
@RequestMapping("/students")
public class StudentController
{
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student ) 
	{
		return studentService.save(student);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Student> read() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Student read(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updatestudent(student, id);
	}
}
