package GuessGame;

public class StartGame {
    public static void main(String[] args){
        int numOfGueses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotComGame theDotCame = new SimpleDotComGame();
        int randomNum = (int) (Math.random()*5);

        int[] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCame.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive ==true){
            String guess = helper.GetUserInput("enter a number");
            String result = theDotCame.CheckYourself(guess);
            numOfGueses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " +numOfGueses+" guesses");
            }
        }
    }
}
