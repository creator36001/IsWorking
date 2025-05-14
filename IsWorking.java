import java.util.ArrayList;
//import java.util.List;
//import data.csv;
public class IsWorking{
   // ArrayList <InfoRow> dataArray = ReadData.readFile("data.csv");
//String data = data.csv;

public static void readData(ArrayList<InfoRow> stringData){
    ArrayList <InfoRow> dataArray = ReadData.readFile("data.csv");
    ArrayList <int> frequency = new arrayList<>();
    int numCongruent = 0;
    int failNum = 0;
    double failPercent = 0.0;

    for(int i = 0; i < dataArray.size(); i++){
        if(dataArray.get(i).getStatus() == false){
            failNum ++;
        }
    }
    failPercent = (failNum / dataArray.size());

for(int i = 0; i < dataArray.size(); i++){

for(int j = dataArray.get(i).getStart(); j < dataArray.get(i).getEnd; j++){
    frequency.set(j, frequency.get(j) + 1);
}




}


    System.out.println("fail % : " + failPercent);
    System.out.println(frequency.get(1) + "-" + frequency.get(1));
}


}

