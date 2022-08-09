package Main;

public class MultipleChoiceQuestions extends Question {
    // class variables

    //Constructor
    public MultipleChoiceQuestions(String question, String answer) {
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        //expect answer to be "A" or "B" etc
        String actualAnswer = this.getTheAnswer();
        //compare it to the user provided answer and case insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
        //extends means this is a child class of the parent class Question


    }
}