package Main;

import java.util.ArrayList;
import java.util.Scanner;

// what to do
// Add questions
//Run or carry out the quiz
//Grade the quiz
public class Quiz {
    // Class variables

    private ArrayList<Question> questions = new ArrayList<>(); //to hold all the questions
    private int numberOfQuestionsCorrect = 0; // scoring quiz # correct
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() {

    }

    //Methods, void doesnt return anything
    //this is adding questions from the different classes?
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    //running the quiz, i.e. looping through each question to ask user and grade it
    public void runQuiz() {
        //loop through each question
        for (Question question : questions) {
            // ask the user each question
            System.out.println(question.getTheQuestion());
            //get the users answer by calling the method?
            String usersAnswer = this.getUsersAnswers();
            //check the answer, so compare to correct answers (not grade just yet)
            boolean usersGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //increment numberOfQuestionsCorrect if answered correctly
            if (usersGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        //Grade the Quiz (outside the loop, cus its after looping finished)
double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageCorrect + "%");
    }

    //get the users answer with a new method
    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }


}
