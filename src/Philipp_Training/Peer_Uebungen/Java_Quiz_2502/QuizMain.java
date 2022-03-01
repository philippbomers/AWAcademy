package Philipp_Training.Peer_Uebungen.Java_Quiz_2502;

import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Scanner quizInput = new Scanner(System.in);

        String[] questions = {
                "Ist Java eine Programmiersprache?",
                "Ist Java eine Insel?",
                "Ist Java eine Mahlzeit?"
        };
        boolean[] answers = {
                true,
                true,
                false
        };

        for (int i = 0; i < questions.length; i++) {
            trueFalseQuestion question = new trueFalseQuestion(questions[i], answers[i]);
            System.out.println(question.getQuestion());
            if (question.getCorrectAnswer(quizInput.nextBoolean())) {
                counter.addCorrectAnswer();
                System.out.println("Deine Antwort ist korrekt!\n" +
                        "(" + counter.getCountCorrectAnswers() + " richtige Antworten,\n" +
                        counter.getCountIncorrectAnswers() + " falsche Antworten)");
            } else {
                counter.addIncorrectAnswers();
                System.out.println("Deine Antwort ist falsch!\n" + counter);
            }
            System.out.println("\n");
        }
    }
}
