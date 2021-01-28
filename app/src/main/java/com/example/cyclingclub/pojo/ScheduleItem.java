package com.example.cyclingclub.pojo;

/**
 * ScheduleItem Class that will help us create a recyclerView of this object
 * @author Omar Yousef
 * @version 1.0
 */
public class ScheduleItem {

    private String day;
    private String time;

    /**
     * ScheduleItem Constructor
     * @param day
     * @param time
     */
    public ScheduleItem(String day, String time) {
        this.day = day;
        this.time = time;
    }

    /**
     * Day Getter
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * Day setter
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Time Getter
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * Time Setter
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
