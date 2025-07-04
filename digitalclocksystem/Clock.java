package com.bridgelabz.qa.digitalclocksystem;

class Clock {
    int hour;
    int minute;
    int second;

    Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void tick() {
        second ++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if(minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) hour = 0;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}
