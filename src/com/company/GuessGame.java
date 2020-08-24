package com.company;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;
         boolean p1lisRight = false;
         boolean p2lisRight = false;
         boolean p3lisRight = false;
         int tragetNum = (int) (Math.random()*10);
         System.out.println("I'm thinking of a number between 0 and 9");
         while(true){
             System.out.println("Number to guess is"+tragetNum);
             p1.guess();
             p2.guess();
             p3.guess();
             guessp1 = p1.number;
             System.out.println("Player one guessed" +guessp1);
             guessp2 = p2.number;
             System.out.println("Player two guessed" +guessp2);
             guessp3 = p3.number;
             System.out.println("Player three guessed" +guessp3);
             if (guessp1 == tragetNum){
                 p1lisRight=true;
             }
             if (guessp2 == tragetNum){
                 p2lisRight=true;
             }
             if (guessp3 == tragetNum){
                 p3lisRight=true;
             }
             if(p1lisRight||p2lisRight||p3lisRight){
                 System.out.println("We have a winnner");
                 System.out.println("Player one got it right?"+p1lisRight);
                 System.out.println("Player two got it right?"+p2lisRight);
                 System.out.println("Player three got it right?"+p3lisRight);
                 break;
             }
             else {
                 System.out.print("Player will have to try again");
             }
         }
    }
}
class Player{
int number = 0;
public void guess(){
    number = (int) (Math.random()*10);
    System.out.println("I'm guessing"+number);
}
}
 class GameLauncher{
    public static void main(String arg[]){
        GuessGame game = new GuessGame();
        game.startGame();
    }
 }