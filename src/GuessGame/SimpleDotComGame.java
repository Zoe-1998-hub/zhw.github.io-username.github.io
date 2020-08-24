package GuessGame;

import com.company.GuessGame;

public class SimpleDotComGame {
    int[] locationCells;
    int numOfHits = 0;
    int randomNum = (int) (Math.random()*10);
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String CheckYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);//把String换成Int
        String result = "miss";
        for (int cell : locationCells) {//等同于 int cell = 0;cell<locationCells.size;cell++
          if (guess == cell){
              result = "hit";
              numOfHits++;
              break;
          }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
