package com.company;


public class Practice {
    Player1 p1;
    Player1 p2;
    Player1 p3;
    public void startgame(){
        p1 = new Player1();
        p2 = new Player1();
        p3 = new Player1();
        int tragetnum = (int) (Math.random()*10);
        System.out.println("The guess number is "+tragetnum);
        int p1guss;
        int p2guss;
        int p3guss;
        boolean p1result = false;
        boolean p2result = false;
        boolean p3result = false;
       while (true){
         p1guss=p1.player();
         p2guss = p2.player();
         p3guss = p3.player();
         System.out.println("One guess "+p1guss);
         System.out.println("Two guess "+p2guss);
         System.out.println("Three guess "+p3guss);
         if (p1guss == tragetnum){
             p1result = true;
         }
           if (p2guss == tragetnum){
               p2result = true;
           }
           if (p3guss == tragetnum){
               p3result = true;
           }
           if(p1result==true||p2result==true ||p3result==true){
               System.out.println("We get the winner!");
               System.out.println("One :"+p1result);
               System.out.println("Two : "+p2result);
               System.out.println("Three : "+p3result);
               break;
           }
           else {
               System.out.println("We play the game again");
           }
       }

    }
}

class Player1{
public int player(){
    int num = (int) (Math.random()*10);
    return num;
}
}


