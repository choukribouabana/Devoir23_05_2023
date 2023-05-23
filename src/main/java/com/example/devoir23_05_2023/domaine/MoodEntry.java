package com.example.devoir23_05_2023.domaine;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="moodentry")
public class MoodEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="moodentry_utilisateur",
            joinColumns = @JoinColumn(name = "moodentry_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<User> users;

    private boolean mood;
    private String description;
    // Add format
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public MoodEntry() {
    }

    public MoodEntry(List<User> users, boolean mood, String description, LocalDate date) {
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> user) {
        this.users = user;
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
