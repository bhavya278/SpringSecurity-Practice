package com.life.dev.serviceImpl;

import com.life.dev.dto.StudentDetails;
import com.life.dev.entity.SchoolEntity;
//import com.life.dev.exception.NoSuchSchoolExistsException;
import com.life.dev.entity.StudentEntity;
import com.life.dev.repository.SchoolRepo;
import com.life.dev.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepo schoolRepo;

    @Override
    public List<StudentEntity> getSchoolDetails() {
//        return schoolRepo.findAll();
        return null;
    }

    @Override
    public StudentEntity getSchoolDetailsByIdAndName(StudentDetails studentDetails) {
        //        if(schoolEntity==null){
//            throw new NoSuchSchoolExistsException(schoolId,schoolName);
//        }
        return schoolRepo.findByAadharNumber(studentDetails.getAadharNumber());
    }

    @Override
    public StudentEntity saveSchool(StudentEntity student) {
        return schoolRepo.save(student);
    }



}
