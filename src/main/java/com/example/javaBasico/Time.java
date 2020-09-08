package com.example.javaBasico;

import lombok.Data;

@Data
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void printTime(Time t){
        System.out.printf("%02:%02:%02\n",
                t.hour,t.minute,t.second);
    }
}
