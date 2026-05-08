package com.life.dev.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String aadharNumber;

    private String studentName;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<SchoolEntity> schools;

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<SchoolEntity> getSchools() {
        return schools;
    }

    public void setSchools(List<SchoolEntity> schools) {
        this.schools = schools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
