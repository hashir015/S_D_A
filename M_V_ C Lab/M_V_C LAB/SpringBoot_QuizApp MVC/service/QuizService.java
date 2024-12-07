package com.example.quizapp.service;

import com.example.quizapp.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    private List<Question> questions;

    public QuizService() {
        // Predefined questions
        questions = new ArrayList<>();
        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"},
                2
        ));
        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"},
                1
        ));
        questions.add(new Question(
                "What is 5 + 3?",
                new String[]{"5", "8", "9", "10"},
                1
        ));
    }

    public List<Question> getAllQuestions() {
        return questions;
    }

    public boolean checkAnswer(int questionIndex, int userAnswer) {
        return questions.get(questionIndex).checkAnswer(userAnswer);
    }
}
