package org.fairviewhs.isWorking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
    public static ArrayList<InfoRow> readFile(String fileName) {
        ArrayList<InfoRow> infoList = new ArrayList<>();
        boolean done = false;
        try {
            FileReader file = new FileReader(fileName);
            BufferedReader myFile = new BufferedReader(file);
            String[] row;
            String line = myFile.readLine();
            while (line != null) {
                row = line.split(",");
                if (row[4] == "COMPLETED") {
                    done = true;
                } else {
                    done = false;
                }
                InfoRow currentRow = new InfoRow(Integer.parseInt(row[0]), Integer.parseInt(row[1]),
                        Integer.parseInt(row[2]), row[3], done);
                infoList.add(currentRow);
                // System.out.println(currentRow.getStart() + "," + currentRow.getEnd() + "," +
                // currentRow.getTaskID() + "," + currentRow.getStatus());

                line = myFile.readLine();
            }
            myFile.close();
        } catch (IOException e) {
            // System.err.println("error");
            e.printStackTrace();
            System.exit(1);
        }
        return infoList;

    }

}
