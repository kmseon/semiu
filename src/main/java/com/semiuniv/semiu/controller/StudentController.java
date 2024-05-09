package com.semiuniv.semiu.controller;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.entity.Subject;
import com.semiuniv.semiu.service.StudentService;
import com.semiuniv.semiu.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/semi")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final SubjectService subjectService;

    @GetMapping("/students")
    public String list(Model model) {
        List<Student> students = studentService.findStudents();
        model.addAttribute("students", students);
        return "students/studentList";
    }


    //수강 신청 페이지 : username로 이동 (조건 : 로그인 후)
    @GetMapping("application/{id}")
    public String lectureApplicationView(@PathVariable("id") Integer id, Model model){
        //로그인한 학생 정보
        Optional<Student> studentInfo = studentService.findById(id);
        Student studentLogin = studentInfo.get();
        System.out.println(studentLogin.toString());
        model.addAttribute("studentLogin", studentLogin);
        //신청 과목
        List<Subject> subject = subjectService.showSubject();
        System.out.println(subject.toString());
        model.addAttribute("subject", subject);
        return "students/lectureApplication";
    }

}
