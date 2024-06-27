package com.example.EduMedia.Repository;

import com.example.EduMedia.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByDate(LocalDate date);
}

