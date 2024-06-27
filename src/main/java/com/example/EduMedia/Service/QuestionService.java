package com.example.EduMedia.Service;

// com.example.EduMedia.Service.QuestionService

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EduMedia.Model.Question;
import com.example.EduMedia.Repository.QuestionRepository;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getRandomQuestions(int count) {
        List<Question> allQuestions = questionRepository.findAll();

        // Ensure there are enough questions to select
        if (count > allQuestions.size()) {
            throw new IllegalArgumentException("Requested more questions than available");
        }

        // Shuffle the questions and select the first 'count' questions
        Random random = new Random();
        return random.ints(0, allQuestions.size())
                .distinct()
                .limit(count)
                .mapToObj(index -> allQuestions.get(index))
                .collect(Collectors.toList());
    }
}




