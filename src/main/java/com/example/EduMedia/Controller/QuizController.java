package com.example.EduMedia.Controller;

import com.example.EduMedia.Model.Question;
import com.example.EduMedia.Model.Quiz;
import com.example.EduMedia.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        Quiz quiz = quizService.getQuizForToday();
        model.addAttribute("quiz", quiz);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String submitQuiz(List<Question> questions, Model model) {
        int score = 0;
        for (Question question : questions) {
            if (question.getCorrectOption().equals(question.getCorrectOption())) {
                score++;
            }
        }
        model.addAttribute("score", score);
        return "result";
    }
}




