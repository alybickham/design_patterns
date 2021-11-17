import java.util.Random;

public class Easy implements State{
    private ArithmeticGame game;

    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    //referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    public int getNum(){
        int min = 1;
        int max = 10;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getOperation(){
        String[] operations = new String[]{"+", "-"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    public void levelUp(){
        System.out.println("You've been advanced to medium mode. ^^ ");
        game.setState(game.getMediumState());
    }
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study. (๑꒪꒫꒪๑)");
    }
}