package singleton;

import java.util.*;

/**
 * Creates and regulates the Trivia Game
 * @author Ashley Bickham
 */
public class TriviaGame {
    private static TriviaGame triviaGame ;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Creates the Trivia Game, setting the instance variables
     */
    private TriviaGame(){
        score = 0;
        questions = new ArrayList<>(DataLoader.getTriviaQuestions());
        reader = new Scanner(System.in);
        rand = new Random();
    }

    /**
     * Creates an instance of Trivia Game, ensuring only one instance is created
     * @return a TriviaGame
     */
    public static TriviaGame getInstance(){
        if (triviaGame == null) {
            System.out.println("Creating a Trivia Game!");
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Begins and controls the game program
     */
    public void play(){
        boolean play = true;
        int wins = 0;
        while (play){
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
        System.out.println("You won " + wins + " game(s)!\nGoodbye!");

    }

    /**
     * Plays a round of the game program
     * @return A boolean representation of the round outcome: true if the user won the round and false if not
     */
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
