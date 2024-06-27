package com.example.EduMedia.Model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "quiz_results")
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "score")
    private int score;

    @Column(name = "date")
    private LocalDate date;

    // Constructors, getters, and setters

    public QuizResult() {
    }

    public QuizResult(String username, int score, LocalDate date) {
        this.username = username;
        this.score = score;
        this.date = date;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
