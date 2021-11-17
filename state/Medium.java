public class Medium implements State{
    private ArithmeticGame game;

    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
     * Retrives a random number from 1 to 50
     */
    public int getNum(){
        int min = 1;
        int max = 50;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    /**
     * Retrieves a random operation from the predetermined options: + or -
     **/
    public String getOperation(){
        String[] operations = new String[]{"+", "-", "*"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    /**
     * Elevates game difficulty from medium to hard, printing a relevant message to the user
     */
    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode. (๑•̀ㅂ•́)و✧");
        game.setState(game.getHardState());
    }

     /**
     * Prints a relevant message to the user
     */
    public void levelDown(){
           System.out.println("You are struggling ( •᷄⌓•᷅ ) Let's go to easy mode.");
           game.setState(game.getEasyState());
    }
}