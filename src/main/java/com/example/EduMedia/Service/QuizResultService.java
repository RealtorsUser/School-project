package com.example.EduMedia.Service;

import com.example.EduMedia.Model.QuizResult;

public interface QuizResultService {

    QuizResult findLatestResultByUsername(String username);

    void saveResult(QuizResult quizResult);
}
