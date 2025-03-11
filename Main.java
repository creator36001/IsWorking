import java.util.ArrayList;

public class Main{

    public static void main (String args[]){
            ArrayList <InfoRow> dataArray = ReadData.readFile("data.csv");


        Speaker.sayHello();
        ReadData.readFile("data.csv");
        IsWorking.readData(dataArray);

    }
}