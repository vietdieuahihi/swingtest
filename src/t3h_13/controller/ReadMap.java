package t3h_13.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadMap {

    public static List<String> getMap(int level){
        ArrayList<String> result = new ArrayList<>();
        File file = new File("src/t3h_13/assets/map/" + level + ".txt");
        if(file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader buf = new BufferedReader(fileReader);

                String line;

                while ((line = buf.readLine()) != null){
                    result.add(line);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
}
