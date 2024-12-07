package com.example.quizapp.controller;

import com.example.quizapp.model.Question;
import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return quizService.getAllQuestions();
    }

    @PostMapping("/answer")
    public String checkAnswer(@RequestParam int questionIndex, @RequestParam int userAnswer) {
        boolean isCorrect = quizService.checkAnswer(questionIndex, userAnswer);
        return isCorrect ? "Correct!" : "Wrong!";
    }
}
