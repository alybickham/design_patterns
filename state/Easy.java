public class Easy implements State{
    private ArithmeticGame game;

    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * referenced site: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
     * Retrives a random number from 1 to 10
     */
    public int getNum(){
        int min = 1;
        int max = 10;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    /**
     * Retrieves a random operation from the predetermined options: + or -
     **/
    public String getOperation(){
        String[] operations = new String[]{"+", "-"};
        return operations[(int)Math.floor(Math.random()*operations.length)];
    }

    /**
     * Elevates game difficulty from easy to medium, printing a relevant message to the user
     */
    public void levelUp(){
        System.out.println("You've been advanced to medium mode. ^^ ");
        game.setState(game.getMediumState());
    }

     /**
     * Prints a relevant message to the user
     */
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study. (๑꒪꒫꒪๑)");
    }
}