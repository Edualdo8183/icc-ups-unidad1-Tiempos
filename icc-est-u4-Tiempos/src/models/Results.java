package models;

public class Resultas {
    private int SampleSize;
    private String fuctionName;
    private int timeResult;


    public Resultas(int sampleSize, String fuctionName, int timeResult) {
        SampleSize = sampleSize;
        this.fuctionName = fuctionName;
        this.timeResult = timeResult;
    }


    public int getSampleSize() {
        return SampleSize;
    }


    public void setSampleSize(int sampleSize) {
        SampleSize = sampleSize;
    }


    public String getFuctionName() {
        return fuctionName;
    }


    public void setFuctionName(String fuctionName) {
        this.fuctionName = fuctionName;
    }


    public int getTimeResult() {
        return timeResult;
    }


    public void setTimeResult(int timeResult) {
        this.timeResult = timeResult;
    }


    @Override
    public String toString() {
        return SampleSize + "-" + SampleSize + ", fuctionName=" + fuctionName + ", timeResult=" + timeResult
                + "]";
    }

    

    
    
    
}
