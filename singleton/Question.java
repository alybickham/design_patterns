public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        this.answers = new String[]{ans1, ans2, ans3, ans4};
    }

    public String toString(){
        String answerOptions = "";
        for (int i = 0; i < answers.length; i++) {
            answerOptions += (i+1) + ". " + answers[i] + "\n"; 
        }
        return question + "\n" + answerOptions + "\n" + 
        "\nCorrect Answer Index is: " + correctAnswer + 
        "\ncorrectAnswer list Number: " + (correctAnswer+1) + 
        "\nAnswer at index: " + answers[correctAnswer];

    }

    public boolean isCorrect(int userAnswer) {
        if (userAnswer == (correctAnswer+1)) {
            return true;
        } 
        else {
        return false;
        }
    }

    public String getCorrectAnswerString() {
        return answers[correctAnswer];
    }
 }
