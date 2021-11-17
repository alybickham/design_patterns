import java.util.Scanner;

public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    public ArithmeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        reader = new Scanner(System.in);
        score = 0;
    }

    public void pressQuestionButton(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        String op = state.getOperation();
        System.out.println(num1 + " " + op + " " + num2 +": " );
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

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState(){
        return easyState;
    }

    public State getMediumState(){
        return mediumState;
    }

    public State getHardState(){
        return hardState;
    }
}
