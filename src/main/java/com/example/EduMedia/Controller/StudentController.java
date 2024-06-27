package com.example.EduMedia.Controller;

import com.example.EduMedia.Model.Student;
import com.example.EduMedia.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String showRegistrationForm(Student student) {
        return "register";
    }

    @PostMapping("/register")
    public String registerstudent(Student student, BindingResult result) {
        Student existingstudent = studentService.findByUsername(student.getUsername());
        if (existingstudent != null) {
            result.rejectValue("studentname", "error.student", "An account already exists for this studentname.");
            return "register";
        }

        studentService.save(student);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}

