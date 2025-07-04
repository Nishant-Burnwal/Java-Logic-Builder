package com.bridgelabz.qa.digitalclocksystem;
/*
5. Digital Clock System
    📘 Problem:
    Create a digital clock simulation.

Requirements:
    Class Clock with fields: hour, minute, second.
    Method tick() increases time by 1 second, handles rollover.
    Method displayTime() shows time in hh:mm:ss format.

OOP Concepts Used:
    Constructors
    Encapsulation
    Time logic using class fields
 */

public class DigitalClockSystem {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 9,58);
        for (int i = 0; i < 5; i++) {
            clock.tick();
            clock.displayTime();
        }
    }
}
