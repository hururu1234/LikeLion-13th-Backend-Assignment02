package com.likelion.springprac.student.api;

import com.likelion.springprac.student.application.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //학생등록
    @PostMapping("student")
    public void save(@RequestBody StudentDto studentDto) {
        studentService.saveStudent(studentDto);
    }

    //학생id로 학생검색
    @GetMapping("student/{studentId}")
    public StudentDto findStudentById(@PathVariable Long studentId) {
        return studentService.findStudentById(studentId);
    }

    //학생 전체 조회
    @GetMapping("student")
    public List<StudentDto> findAllStudent() {
        return studentService.findAllStudent();
    }

    //학생id로 전화번호 변경
    @PatchMapping("student/{studentId}")
    public void updateStudentPhoneNumber(@PathVariable Long studentId, @RequestBody StudentDto studentDto) {
        studentService.updateStudentPhoneNumber(studentId, studentDto);
    }


    //학생 id로 삭제
    @DeleteMapping("student/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }



}
