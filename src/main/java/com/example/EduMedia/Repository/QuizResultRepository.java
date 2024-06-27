package com.example.EduMedia.Repository;

import com.example.EduMedia.Model.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    QuizResult findTopByUsernameOrderByDateDesc(String username);

    // Add custom query methods if needed
}
