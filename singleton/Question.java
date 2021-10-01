public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        this.answers = new String[]{ans1, ans2, ans3, ans4};
        this.correctAnswer = correctAnswer; 
    }

    public String toString(){
        String answerOptions = "";
        for (int i = 0; i < answers.length; i++) {
            answerOptions += (i+1) + ". " + answers[i] + "\n"; 
        }
        return question + "\n" + answerOptions + "\n";

    }

    public boolean isCorrect(int userAnswer) {
        if (userAnswer == (correctAnswer+1)) {
            return true;
        } 
        return false;
    }

    public String getCorrectAnswerString() {
        return answers[correctAnswer];
    }
 }
