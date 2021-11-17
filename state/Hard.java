public class Hard implements State{
    private ArithmeticGame game;

    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
     * Retrives a random number from 1 to 100
     */
    public int getNum(){
        int min = 1;
        int max = 100;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    /**
     * Retrieves a random operation from the predetermined options: + or -
     **/
    public String getOperation(){
        String[] operations = new String[]{"+", "-", "*", "/"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    /**
     * Elevates game difficulty from medium to hard, printing a relevant message to the user
     */
    public void levelUp(){
        System.out.println("You are doing so well!!!ヾ(≧∇≦*)✧");
    }

    /**
     * Prints a relevant message to the user
     */
    public void levelDown(){
        System.out.println("You are struggling ^^; Let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}