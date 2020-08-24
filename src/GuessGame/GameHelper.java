package GuessGame;
import com.company.GuessGame;

import java.io.*;
public class GameHelper {
    public String GetUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt+" ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length()==0) return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }
}
