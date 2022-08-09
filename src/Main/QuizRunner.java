package Main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestions myMultipleChoiceQuestions = new MultipleChoiceQuestions("A dog goes...?\n A.Bark \nB.Moo\nC.Quack\n Please select a single letter for the Answer.", "A");
        // add question to the quiz
        myQuiz.addQuestion(myMultipleChoiceQuestions);

        CheckBox myCheckBoxQuestion = new CheckBox("Select all that apply, which animals can fly?\n A. Duck\nB. Dog\nC.Goose", "A,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Can dogs fly?\n True or False?", "False");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
