import java.util.*;
public class TriviaGame {

    private static TriviaGame triviaGame ;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame(){
        score = 0;
        questions = new ArrayList<>(DataLoader.getTriviaQuestions());
        reader = new Scanner(System.in);
        rand = new Random();
    }

    public static TriviaGame getInstance(){
        if (triviaGame == null) {
            System.out.println("Creating a Trivia Game!");
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play(){
        boolean play = true;
        int wins = 0;
        do {
            System.out.print("(P)lay or (Q)uit: ");
            String input = reader.next();
            reader.nextLine();
            if (input.toLowerCase().equals("p")) {
                if (playRound()) {
                    wins++;
                }
            }
            else if (input.toLowerCase().equals("q")) {
                play = false;
            }
            else {
                System.out.println("Invalid Input\n");
            }
        }
        while (play);
        System.out.println("You won " + wins + " game(s)!\nGoodbye!");

    }

    private boolean playRound() {
        int questionIndex = rand.nextInt(questions.size());
        Question currentQuestion = questions.get(questionIndex);
        System.out.print(questions.get(questionIndex) + "Enter Answer: ");
        int userAnswer = reader.nextInt();
        reader.nextLine();
        final int NUMANSWCHOICES = 4;
        boolean retVal = false;
        if (userAnswer > NUMANSWCHOICES){
            System.out.println("Invalid Input\n");
        }
        else {
            retVal = currentQuestion.isCorrect(userAnswer);
            if (retVal) {
                System.out.println("Yay ^^ You got it right!\n");
            }
            else {
                System.out.println("You got it wrong!\nThe correct answer is " + currentQuestion.getCorrectAnswerString()+"\n");

            }
        }
        return retVal;
    }
    
}
