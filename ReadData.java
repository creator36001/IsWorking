import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
    public static void readFile(){
        try{
    FileReader file = new FileReader("data.csv");
    BufferedReader myFile = new BufferedReader(file);
    
    String[] row;
    String line = myFile.readLine();
    while (line != null) {
        row = line.split(",");
        System.out.println(row[4]);

        line = myFile.readLine();
    }
    myFile.close();
}
catch(IOException e)
{
    System.out.println("error");
}
}
}
