package com.life.dev.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "schools")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolId;

    private String schoolName;

    private String board;

    private String passingYear;

    @ManyToOne
    @JoinColumn(name = "student_aadhar")
    private StudentEntity student;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<MarksEntity> marks;

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public List<MarksEntity> getMarks() {
        return marks;
    }

    public void setMarks(List<MarksEntity> marks) {
        this.marks = marks;
    }
}