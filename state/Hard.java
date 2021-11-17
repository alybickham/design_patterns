import java.util.Random;

public class Hard implements State{
    private ArithmeticGame game;

    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    //referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    public int getNum(){
        int min = 1;
        int max = 100;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getOperation(){
        String[] operations = new String[]{"+", "-", "*", "/"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    public void levelUp(){
        System.out.println("You are doing so well!!!ヾ(≧∇≦*)✧");
    }

    public void levelDown(){
        System.out.println("You are struggling ^^; Let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}
    
