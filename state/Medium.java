import java.util.Random;

public class Medium implements State{
    private ArithmeticGame game;

    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    //referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    public int getNum(){
        int min = 1;
        int max = 50;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getOperation(){
        String[] operations = new String[]{"+", "-", "*"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode. (๑•̀ㅂ•́)و✧");
        game.setState(game.getHardState());
    }

    public void levelDown(){
           System.out.println("You are struggling ( •᷄⌓•᷅ ) Let's go to easy mode.");
           game.setState(game.getEasyState());
    }
}
    
