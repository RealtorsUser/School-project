package com.example.EduMedia.Service;

import com.example.EduMedia.Model.QuizResult;
import com.example.EduMedia.Repository.QuizResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizResultServiceImpl implements QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

    @Override
    public QuizResult findLatestResultByUsername(String username) {
        // Implement logic to find the latest quiz result by username
        return quizResultRepository.findTopByUsernameOrderByDateDesc(username);
    }

    @Override
    public void saveResult(QuizResult quizResult) {
        // Implement logic to save quiz result to the database
        quizResultRepository.save(quizResult);
    }
}
