package Philipp_Training.Peer_Uebungen.Java_Quiz_2502;

public class Counter {
    private int countCorrectAnswers = 0,
            countIncorrectAnswers = 0;

    public void addCorrectAnswer() {
        this.countCorrectAnswers++;
    }

    public void addIncorrectAnswers() {
        this.countIncorrectAnswers++;
    }

    public int getCountCorrectAnswers() {
        return countCorrectAnswers;
    }

    public int getCountIncorrectAnswers() {
        return countIncorrectAnswers;
    }

    @Override
    public String toString() {
        return "Antworten: " + this.getCountCorrectAnswers() + " richtig, " +
                this.getCountIncorrectAnswers() + " falsch";
    }
}
