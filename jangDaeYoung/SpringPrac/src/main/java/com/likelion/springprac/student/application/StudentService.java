package com.likelion.springprac.student.application;

import com.likelion.springprac.student.api.StudentDto;
import com.likelion.springprac.student.domain.Student;
import com.likelion.springprac.student.domain.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private static Long sequence = 0L;

    //학생저장
    public void saveStudent(StudentDto requestStudent){
        Student student = Student.builder()
                .studentId(++sequence)
                .studentName(requestStudent.studentName())
                .phoneNumber(requestStudent.phoneNumber())
                .departmentId(requestStudent.departmentId())
                .build();

        studentRepository.save(student);
    }

    //학생 아이디로 조회
    public StudentDto findStudentById(Long studentId){
        Student student = studentRepository.findById(studentId);
        if (student==null){
            throw new IllegalStateException("해당하는 학생이 없습니다. student = " + studentId);
        }
        return toDto(student);
    }

    //전체 학생 조회
    public List<StudentDto> findAllStudent(){
        return studentRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    //학생id로 전화번호 변경
    public Student updateStudentPhoneNumber(Long studentId, StudentDto requestDto){
        Student student = studentRepository.findById(studentId);
        if (student==null){
            throw new IllegalStateException("해당하는 학생이 없습니다. student = " + studentId);
        }

        student.phoneNumberUpdate(requestDto.phoneNumber());
        studentRepository.updateById(studentId, student);
        return student;
    }


    //학생 삭제
    public void deleteStudent(Long studentId){
        studentRepository.deleteById(studentId);
    }

    private StudentDto toDto(Student student){
        return StudentDto.builder()
                .studentId(student.getStudentId())
                .studentName(student.getStudentName())
                .phoneNumber(student.getPhoneNumber())
                .departmentId(student.getDepartmentId())
                .build();
    }

}
