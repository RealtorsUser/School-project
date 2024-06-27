package com.example.EduMedia.Util;

// com.example.EduMedia.Util.QuizUtil

import com.example.EduMedia.Model.Question;
import com.example.EduMedia.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class QuizUtil {

    @Autowired
    private QuestionService questionService;

    @PostConstruct
    public void init() {
        int count = 25; // Adjust the count as per your requirement
        List<Question> randomQuestions = questionService.getRandomQuestions(count);
        // Perform initialization tasks with randomQuestions
    }
}



