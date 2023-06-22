package com.StudentMgmtSystem.Service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.StudentMgmtSystem.entity.Student;
import com.StudentMgmtSystem.repos.StudentRepository;
import lombok.RequiredArgsConstructor;

	//@Service allows to add business functionalities in your application

@Service
@RequiredArgsConstructor
public class StudentService
  {
		
	private final StudentRepository studentRepository ;
		
	public Student save(Student student) 
	  {
		return studentRepository.save(student);
	  }
		
		public List<Student> getAllStudent() {
			return studentRepository.findAll();
		}
		
		public Student getStudentById(Long id)
		{
			return studentRepository.findById(id).orElseThrow(()
			-> new RuntimeException("Movie found for the id "+id));	
		}
		
		public Student updatestudent(Student student, Long id) 
		{
			Student existingStudent = studentRepository.findById(id).get();
			existingStudent.setCourse(student.getCourse());
			existingStudent.setStudentname(student.getStudentname());
			
		
			return studentRepository.save(existingStudent);
		}
		
		public void deleteStudent(Long id) {
			Student existingStudent = studentRepository.findById(id).get();
			studentRepository.delete(existingStudent);
			
		}

		
	}



