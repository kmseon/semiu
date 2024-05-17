package com.semiuniv.semiu.service;

<<<<<<< HEAD
import com.semiuniv.semiu.config.PrincipalDetails;
import com.semiuniv.semiu.entity.Users;
import com.semiuniv.semiu.repository.StudentRepository;
import com.semiuniv.semiu.repository.UsersRepository;

=======

import com.semiuniv.semiu.config.PrincipalDetails;
import com.semiuniv.semiu.entity.Student;
import com.semiuniv.semiu.entity.Users;
import com.semiuniv.semiu.repository.StudentRepository;
import com.semiuniv.semiu.repository.UserRepository;
>>>>>>> origin/kmseon
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService implements UserDetailsService {
<<<<<<< HEAD
    private final UsersRepository userRepository;
=======
    private final UserRepository userRepository;
>>>>>>> origin/kmseon
    private final StudentRepository studentRepository;

    //비밀번호 암호화
    @Autowired
    PasswordEncoder passwordEncoder;

<<<<<<< HEAD
    public UserDetailService(UsersRepository userRepository, StudentRepository studentRepository) {
=======
    public UserDetailService(UserRepository userRepository, StudentRepository studentRepository) {
>>>>>>> origin/kmseon
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
<<<<<<< HEAD
=======
        Optional<Student> userStudent = studentRepository.findById(username);
>>>>>>> origin/kmseon
        Optional<Users> user = userRepository.findById(username);
        if(user.isEmpty()){
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
        String password = passwordEncoder.encode(user.get().getPassword());
        Users userAccount = user.get();
        userAccount.setPassword(password);
<<<<<<< HEAD
=======
        Student student = userStudent.get();
        System.out.println(student);
>>>>>>> origin/kmseon
        System.out.println(userAccount);
        return new PrincipalDetails(userAccount);
    }
}
