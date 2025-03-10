import java.util.ArrayList;
import java.util.List;
//import data.csv;
public class IsWorking{
   // ArrayList <InfoRow> dataArray = ReadData.readFile("data.csv");
//String data = data.csv;

public static void readData(ArrayList<InfoRow> stringData){
    ArrayList <InfoRow> dataArray = ReadData.readFile("data.csv");
    int numCongruent = 0;
    int failNum = 0;
    double failPercent = 0.0;

//for(int i = 0; i < dataArray.size(; i++)){}




    for(int i = 0; i < dataArray.size(); i++){
        if(dataArray.get(i).getStatus() == false){
            failNum ++;
        }
    }
    failPercent = (failNum / dataArray.size());

    System.out.println("fail % : " + failPercent);
}


}

