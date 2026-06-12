package com.life.dev.serviceImpl;

import com.life.dev.dto.StudentDetails;
//import com.life.dev.exception.NoSuchSchoolExistsException;
import com.life.dev.entity.StudentEntity;
import com.life.dev.repository.StudentRepo;
import com.life.dev.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentEntity> getSchoolDetails() {
//        return schoolRepo.findAll();
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity getSchoolDetailsByIdAndName(StudentDetails studentDetails) {
        //        if(schoolEntity==null){
//            throw new NoSuchSchoolExistsException(schoolId,schoolName);
//        }
        return studentRepo.findByAadharNumber(studentDetails.getAadharNumber());
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }



}
