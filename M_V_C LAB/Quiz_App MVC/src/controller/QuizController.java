package controller;

import model.Question;
import view.QuizView;
import java.util.List;

public class QuizController {
    private List<Question> questions;
    private QuizView view;
    private int score;

    public QuizController(List<Question> questions, QuizView view) {
        this.questions = questions;
        this.view = view;
        this.score = 0;
    }

    public void startQuiz() {
        for (Question question : questions) {
            view.displayQuestion(question);
            int userAnswer = view.getUserAnswer();
            if (question.checkAnswer(userAnswer)) {
                score++;
            }
        }
        view.displayScore(score, questions.size());
    }
}
