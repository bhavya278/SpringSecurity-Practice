package com.life.dev.controller;

import com.life.dev.dto.StudentDetails;
import com.life.dev.entity.SchoolEntity;
import com.life.dev.entity.StudentEntity;
import com.life.dev.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("/getSchool")
    public List<StudentEntity> SchoolDetails(){
        return schoolService.getSchoolDetails();
    }

    @GetMapping("/getSchoolDetailsByAadhar")
    public StudentEntity getSchoolDetailsByIdAndName(@RequestBody StudentDetails studentDetails ){
        return schoolService.getSchoolDetailsByIdAndName(studentDetails);
    }

    @PostMapping("/addStudent")
    public StudentEntity saveStudent(@RequestBody StudentEntity student){
        return schoolService.saveStudent(student);
    }

}
