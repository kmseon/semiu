package com.semiuniv.semiu.controller;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/semi")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public String list(Model model) {
        List<Student> students = studentService.findStudents();
        model.addAttribute("students", students);
        return "students/studentList";
    }


    //수강 신청 페이지 : username로 이동 (조건 : 로그인 후)
    @GetMapping("application")
    public String lectureApplicationView(Model model){
        return "students/lectureApplication";
    }
}
