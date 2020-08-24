package GuessGame;

import com.company.GuessGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotComGame dot = new SimpleDotComGame();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.CheckYourself(userGuess);
    }
}
