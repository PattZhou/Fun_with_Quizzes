package Main;

public abstract class Question {
    private final String theQuestion; //final means it can never change, which is why there are no setters
    private final String theAnswer;

    //constructors
    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //getters

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    //methods
    public abstract boolean checkAnswer(String answer);
}
