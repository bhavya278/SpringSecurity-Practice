package com.life.dev.service;

import com.life.dev.dto.StudentDetails;
import com.life.dev.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<StudentEntity> getSchoolDetails();

    StudentEntity getSchoolDetailsByIdAndName(StudentDetails studentDetails);

    StudentEntity saveStudent(StudentEntity school);
}
