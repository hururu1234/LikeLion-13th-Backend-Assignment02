package com.likelion.springprac.student.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Student {
    private Long studentId;
    private String studentName;
    private String phoneNumber;
    private Long departmentId;


    @Builder
    public Student(Long studentId, String studentName, String phoneNumber, Long departmentId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.departmentId = departmentId;
    }

    public void phoneNumberUpdate(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
