package view;

import model.Question;
import java.util.Scanner;

public class QuizView {
    private Scanner scanner = new Scanner(System.in);

    public void displayQuestion(Question question) {
        System.out.println("\n" + question.getQuestionText());
        String[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public int getUserAnswer() {
        System.out.print("Enter your answer (1-4): ");
        return scanner.nextInt() - 1; // Adjusting to zero-based index
    }

    public void displayScore(int score, int totalQuestions) {
        System.out.println("\nQuiz Completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);
    }
}
