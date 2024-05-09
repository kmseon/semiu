package com.semiuniv.semiu.controller;

import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Optional;

@Controller
@RequestMapping("/semi")
public class MainController {

    //로그인 정보 = 학생 정보
    private final StudentService studentService;

    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String main() {
        return "main";
    }

    // .defaultSuccessUrl : 로그인 성공 시 GetUrl > main.html
    // :로그인 후 다시 main:Index 페이지에 돌아왔을 때 로그인 정보와 같은 학생 정보 가져오기
    @GetMapping("login")
    public String login(Principal principal, Model model){
        Integer loginId = Integer.valueOf(principal.getName());
        Optional<Student> student = studentService.show_student(loginId);
        Student studentLogin = student.get();
        System.out.println(studentLogin.toString());
        model.addAttribute("principal", principal.getName());
        model.addAttribute("studentLogin", studentLogin);
        return "main";
    }
}
