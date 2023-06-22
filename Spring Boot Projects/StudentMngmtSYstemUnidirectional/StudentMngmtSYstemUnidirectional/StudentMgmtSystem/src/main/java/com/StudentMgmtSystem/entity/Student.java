package com.StudentMgmtSystem.entity;



import javax.persistence.*;


import lombok.*;

@Entity
@Table(name="tbl_student")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="Studentname")
	private String studentname;
	
	@Column(name="Course")
	private String course;
	
	
	// @OneToOne(cascade = CascadeType.ALL)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_detail_id")
	private StudentDetail studentdetail;
	
	
	
//	public Student(StudentRequest request) 
//	{
//		this.studentname = request.getStudentname();
//		this.course = request.getCourse();
//	}



	 
	
	
}






