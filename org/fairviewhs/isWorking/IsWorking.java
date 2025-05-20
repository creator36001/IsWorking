package org.fairviewhs.isWorking;

import java.util.ArrayList;

public class IsWorking {

    public static void readData(ArrayList<InfoRow> stringData) {
        ArrayList<InfoRow> dataArray = ReadData.readFile("data.csv");

        int failNum = 0;
        double failPercent = 0.0;
        int endOfTime = 0;

        for (int i = 0; i < stringData.size(); i++) {
            if (stringData.get(i).getEnd() > endOfTime) {
                endOfTime = stringData.get(i).getEnd();
            }
        }

        int[] frequency = new int[endOfTime];

        for (int i = 0; i < dataArray.size(); i++) {
            if (dataArray.get(i).getStatus() == false) {
                failNum++;
            }
        }
        failPercent = (failNum / dataArray.size());

        for (int i = 0; i < dataArray.size(); i++) {

            for (int t = dataArray.get(i).getStart(); t < dataArray.get(i).getEnd(); t++) {
                frequency[t] += 1;
            }

        }

        System.out.println(" Fail % : " + failPercent);

        for (int i = 0; i < frequency.length; i += 10) {
            System.out.println(" I: " + i + " Frequency:" + frequency[i] + " ");
        }
    }

}
