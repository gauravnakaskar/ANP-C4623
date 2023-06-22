package com.StudentMgmtSystem.entity;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_studentdetail")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetail
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "Address")
	private String address;

    @Column(name = "PhoneNo.")
	private Long PhoneNo;
    
    
    
   
	//@JoinColumn(name = "student_detail_id")

  
    
   
   
		
        

}

