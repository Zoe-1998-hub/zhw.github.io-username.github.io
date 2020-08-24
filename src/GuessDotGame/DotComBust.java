package GuessDotGame;
import java.util.*;
import GuessGame.GameHelper;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCome> dotComesList = new ArrayList<DotCome>();
    private int numOfGuesses = 0;
    private void setUpGame(){
        DotCome one = new DotCome();
        one.setName("Pets.com");
        DotCome two = new DotCome();
        two.setName("eToys.com");
        DotCome three = new DotCome();
        three.setName("Go2.com");

        dotComesList.add(one);
        dotComesList.add(two);
        dotComesList.add(three);

        System.out.println("Your goal is to sink three dot coms");
        System.out.println("Pets.com,eToys.com,Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCome dotComToset:dotComesList){

        }
    }
}
