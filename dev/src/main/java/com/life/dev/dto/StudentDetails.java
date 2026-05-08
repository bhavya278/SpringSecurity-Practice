package com.life.dev.dto;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

import java.util.Objects;


public class StudentDetails {
    private String aadharNumber;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentDetails that = (StudentDetails) o;
        return Objects.equals(aadharNumber, that.aadharNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(aadharNumber);
    }

    public StudentDetails() {
    }

    public StudentDetails(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }


}
