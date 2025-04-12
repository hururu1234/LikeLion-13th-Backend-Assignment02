package com.likelion.springprac.student.api;

import lombok.Builder;

@Builder
public record StudentDto (
        long studentId,
        String studentName,
        String phoneNumber,
        long departmentId
){
}

