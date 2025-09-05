package com.Project.University.Management.System.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate date;
    private String location;
    private Long participantsCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(Long participantsCount) {
        this.participantsCount = participantsCount;
    }
}
