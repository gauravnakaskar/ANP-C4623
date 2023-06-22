package com.StudentMgmtSystem.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.StudentMgmtSystem.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
