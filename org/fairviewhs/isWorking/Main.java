package org.fairviewhs.isWorking;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<InfoRow> dataArray = ReadData.readFile("data.csv");
        IsWorking.readData(dataArray);
    }
}