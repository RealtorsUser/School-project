package com.example.EduMedia.Controller;

import com.example.EduMedia.Model.QuizResult;
import com.example.EduMedia.Service.QuizResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResultController {

    @Autowired
    private QuizResultService quizResultService;

    // Display quiz results for the current user
    @GetMapping("/results")
    public String showResults(Model model) {
        String username = "current_user"; // Replace with actual logged-in username retrieval
        QuizResult quizResult = quizResultService.findLatestResultByUsername(username);

        if (quizResult != null) {
            model.addAttribute("quizResult", quizResult);
            return "results";
        } else {
            // Handle case where no results found
            return "error"; // Example, customize based on your application logic
        }
    }

    // Handle saving of quiz results (if needed)
    @PostMapping("/results/save")
    public String saveResults(QuizResult quizResult) {
        quizResultService.saveResult(quizResult);
        return "redirect:/results";
    }
}
