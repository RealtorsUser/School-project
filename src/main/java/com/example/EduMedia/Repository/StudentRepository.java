package com.example.EduMedia.Repository;

import com.example.EduMedia.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}




