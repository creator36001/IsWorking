
//import data.csv;
public class IsWorking{

//String data = data.csv;


public String[][] listData(String stringData){
    int rowCount = 0;
    int colCount = 0;
    int commaCount = 0;

        for(int i = 0; i < stringData.length(); i++){
            if (stringData.charAt(i) == 'b'){
            commaCount++;
            }
        }
    String[][] PackData = new String[commaCount/4][commaCount];

        //for(int i = 0; i < commaCount; i++){
            //StringData.split(,);

    return PackData;
}


}

