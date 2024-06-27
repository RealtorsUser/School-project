package com.example.EduMedia.Service;

import com.example.EduMedia.Model.Quiz;
import com.example.EduMedia.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;


@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz getQuizForToday() {
        String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Optional<Quiz> quiz = quizRepository.findByDate(todayDate);
        return quiz.orElse(null);
    }

    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}




