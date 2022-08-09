package Main;

public class TrueFalseQuestion extends Question {
// class variables

    //Constructors
    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer  = "True, False"
        // answer = "TRUE, faLsE"
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
