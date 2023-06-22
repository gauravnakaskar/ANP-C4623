package com.StudentMgmtSystem.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.StudentMgmtSystem.Service.StudentDetailService;

import com.StudentMgmtSystem.entity.StudentDetail;


@RestController
@RequestMapping("/studentdetails")
public class StudentDetailController
{
	
	@Autowired
	private StudentDetailService studentdetailService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public StudentDetail create(@RequestBody StudentDetail studentdetail ) 
	{
		return studentdetailService.save(studentdetail);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDetail> read() {
		return studentdetailService.getAllStudentDetail();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDetail read(@PathVariable Long id) {
		return studentdetailService.getStudentDetailById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		studentdetailService.deleteStudentDetail(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public StudentDetail update(@PathVariable Long id, @RequestBody StudentDetail studentdetail) {
		return studentdetailService.updateStudentDetail(studentdetail, id);
	}
}
