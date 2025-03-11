public class InfoRow {
    private int index;
    private int start;
    private int end;
    private String taskID;
    private boolean status;

    public InfoRow(int index, int start, int end, String taskID, boolean status){

        this.index = index;
        this.start = start;
        this.end = end;
        this.taskID = taskID;
        this.status = status;

    }
    public int getIndex(){return index;}

    public int getStart(){return start;}

    public int getEnd(){return end;}

    public String getTaskID(){return taskID;}
    
    public boolean getStatus(){return status;}

}
