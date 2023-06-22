package com.StudentMgmtSystem.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.StudentMgmtSystem.entity.StudentDetail;
@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Long> {

}
