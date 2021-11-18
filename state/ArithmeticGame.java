import java.util.Scanner;

public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * Creates a Arithmetic Game, setting an initial score of 0
     */
    public ArithmeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        reader = new Scanner(System.in);
        score = 0;
    }

    /**
     * Provides the user with an arithmetic problem and tabulates the score and game difficulty based off the answers
     */
    public void pressQuestionButton(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        String op = state.getOperation();
        System.out.print(num1 + " " + op + " " + num2 +": " );
        int ans = Integer.parseInt(reader.nextLine());
        if ((op.equals("+") && ans == (num1+num2)) || (op.equals("-") && ans == (num1-num2)) ||
            (op.equals("*") && ans == (num1*num2)) || (op.equals("/") && ans == (num1/num2))) {
            System.out.println("Correct! :)");
            score++;
        }
        else {
            System.out.println("Wrong (✖ ▂ ✖)");
            score--;
        }
        if (score >= 3) {
            state.levelUp();
            score = 0;
        }
        else if (score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    /**
     * Sets the game's state (difficulty)
     * @param state The state (difficulty) to be changed to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Provides the object's easy state/difficulty
     * @return the easy state/difficulty
     */
    public State getEasyState(){
        return easyState;
    }

    /**
     * Provides the object's medium state/difficulty
     * @return the medium state/difficulty
     */
    public State getMediumState(){
        return mediumState;
    }

    /**
     * Provides the object's hard state/difficulty
     * @return the hard state/difficulty
     */
    public State getHardState(){
        return hardState;
    }
}