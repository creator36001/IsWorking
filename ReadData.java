import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
    public static ArrayList<InfoRow> readFile(){
         ArrayList <InfoRow> infoList = new ArrayList<>();

        try{
    FileReader file = new FileReader("data.csv");
    BufferedReader myFile = new BufferedReader(file);    
    String[] row;
    String line = myFile.readLine();
    while (line != null) {
        row = line.split(",");
        InfoRow currentRow = new InfoRow(Integer.parseInt(row[0]), Integer.parseInt(row[1]), Integer.parseInt(row[2]), Integer.parseInt(row[3]), false);
        infoList.add(currentRow);
        System.out.println(row[0] + "," + row[1] + "," + row[2] + "," + row[3] + "," + row[4]);

        line = myFile.readLine();
    }
    myFile.close();
}
catch(IOException e)
{
    System.out.println("error");
}
return infoList;

}




}

