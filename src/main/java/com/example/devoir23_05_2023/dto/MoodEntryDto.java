package com.example.devoir23_05_2023.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;

import java.time.LocalDate;
import java.util.List;

public class MoodEntryDto {
    private Long id;
    private List<UserDto> users;
    private boolean mood;
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public MoodEntryDto() {
    }

    public MoodEntryDto(Long id, List<UserDto> users, boolean mood, String description, LocalDate date) {
        this.id = id;
        this.users = users;
        this.mood = mood;
        this.description = description;
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

    public boolean isMood() {
        return mood;
    }

    public void setMood(boolean mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
