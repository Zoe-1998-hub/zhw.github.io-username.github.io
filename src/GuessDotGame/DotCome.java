package GuessDotGame;
import java.util.ArrayList;
public class DotCome {
    String dotname;
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);//玩家猜测值是否在数组中
        if(index>=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            }
            else result = "hit";
        }
        return result;
    }
    public void setName(String name){
        dotname= name;
    }
}

