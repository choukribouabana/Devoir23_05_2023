package com.example.devoir23_05_2023.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class ActivityDto {
    private Long id;
    private List<UserDto> users;
    private String name;
    private int duration;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public ActivityDto() {
    }

    public ActivityDto(Long id, List<UserDto> users, String name, int duration, LocalDate date) {
        this.id = id;
        this.users = users;
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
