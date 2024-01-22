package Bt2_StopWatch;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private long starTime;
    private long endTime;
    public StopWatch(){
        starTime = System.currentTimeMillis();
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        starTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long  getElapsedTime(){
        return endTime - starTime;
    }

}
