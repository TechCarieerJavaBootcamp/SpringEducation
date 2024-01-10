package com.springEdu.techcareer.week4.Sunday.repository;

import com.springEdu.techcareer.week4.Sunday.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
