import controller.QuizController;
import java.util.ArrayList;
import java.util.List;
import model.Question;
import view.QuizView;

public class Main {
    public static void main(String[] args) {
        // Define questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"},
                2 // Index of the correct answer (Paris)
        ));
        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"},
                1 // Index of the correct answer (Mars)
        ));
        questions.add(new Question(
                "What is 5 + 3?",
                new String[]{"5", "8", "9", "10"},
                1 // Index of the correct answer (8)
        ));

        // Initialize view and controller
        QuizView view = new QuizView();
        QuizController controller = new QuizController(questions, view);

        // Start the quiz
        controller.startQuiz();
    }
}
