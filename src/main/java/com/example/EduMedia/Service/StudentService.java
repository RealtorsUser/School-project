package com.example.EduMedia.Service;

import com.example.EduMedia.Model.Student;
import com.example.EduMedia.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Student findByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    public void save(Student student) {
        student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
        studentRepository.save(student);
    }
}



