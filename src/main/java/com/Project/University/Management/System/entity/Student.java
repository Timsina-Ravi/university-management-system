package com.Project.University.Management.System.entity;

import jakarta.persistence.*;

import java.time.Year;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    private String major;
    private Year enrollmentYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Year getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Year enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }
}

