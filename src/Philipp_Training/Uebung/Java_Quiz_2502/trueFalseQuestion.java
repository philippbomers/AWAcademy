package Philipp_Training.Uebung.Java_Quiz_2502;

public class trueFalseQuestion {

    String question;
    boolean answer;

    trueFalseQuestion(String question, boolean answer) {
        this.setQuestion(question);
        this.setAnswer(answer);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    boolean getCorrectAnswer(boolean userInput) {
        return userInput == this.getAnswer();
    }

}
