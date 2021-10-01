/**
 * Holds the various questions to be used in th program
 * @author Ashley Bickham
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Creates a variation of a question along with answer choices and the correct answer
     * @param question A Strign representation of the question
     * @param ans1 A String representation of an answer option to the question
     * @param ans2 A String representation of an answer option to the question
     * @param ans3 A String representation of an answer option to the question
     * @param ans4 A String repr A nukbr representation of the correct answer option
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        this.answers = new String[]{ans1, ans2, ans3, ans4};
        this.correctAnswer = correctAnswer; 
    }

    /**
     * Allows for the formatted display of the question, along with the answer choices
     * @return A String representation of the question and its answer choices
     */
    public String toString(){
        String answerOptions = "";
        for (int i = 0; i < answers.length; i++) {
            answerOptions += (i+1) + ". " + answers[i] + "\n"; 
        }
        return question + "\n" + answerOptions;

    }

    /**
     * Shows if the provided answer is the correct answer to the question
     * @param userAnswer The numeric value of the answer option as displayed to the user
     * @return A boolean representation if the user's answer is correct (true) or ont (false)
     */
    public boolean isCorrect(int userAnswer) {
        if (userAnswer == (correctAnswer+1)) {
            return true;
        } 
        return false;
    }

    /**
     * Obtains the String value of the correct answer option to the question
     * @return A String representation of the correct answer to the question
     */
    public String getCorrectAnswerString() {
        return answers[correctAnswer];
    }
 }
