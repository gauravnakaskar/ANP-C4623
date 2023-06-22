package com.StudentMgmtSystem.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.StudentMgmtSystem.entity.StudentDetail;
import com.StudentMgmtSystem.repos.StudentDetailRepository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Service allows to add business functionalities in your application
@Getter
@Setter
@Service
@RequiredArgsConstructor
public class StudentDetailService
{
	
	private final StudentDetailRepository studentdetailRepository;
	
	public StudentDetail save(StudentDetail studentdetail) 
	{
		
		return studentdetailRepository.save(studentdetail);
	}
	
	public List<StudentDetail> getAllStudentDetail() {
		return studentdetailRepository.findAll();
	}
	
	public StudentDetail getStudentDetailById(Long id)
	{
		return studentdetailRepository.findById(id).orElseThrow(()
		-> new RuntimeException("student found for the id "+id));	
	}
	
	public StudentDetail updateStudentDetail(StudentDetail studentdetail, Long id) 
	{
		StudentDetail existingStudentDetail = studentdetailRepository.findById(id).get();
		existingStudentDetail.setAddress(studentdetail.getAddress());
		existingStudentDetail.setPhoneNo(studentdetail.getPhoneNo());
		
	
		return studentdetailRepository.save(existingStudentDetail);
	}
	public void deleteStudentDetail(Long id) {
		StudentDetail existingStudentDetail = studentdetailRepository.findById(id).get();
		studentdetailRepository.delete(existingStudentDetail);
		
	}


	
	
	
	
}


