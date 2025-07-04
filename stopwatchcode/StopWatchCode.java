package com.bridgelabz.qa.stopwatchcode;

import java.util.Scanner;

public class StopWatchCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Wait for user to pres
        // s Enter to start
        System.out.println("Press Enter to START the stopwatch...");
        sc.nextLine();
        long startTime = System.currentTimeMillis();

        // Wait for user to press Enter to stop
        System.out.println("Press Enter to STOP the stopwatch...");
        sc.nextLine();
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time
        long elapsedTime = endTime - startTime;

        // Output
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        System.out.printf("Elapsed time: %.2f seconds\n", elapsedTime / 1000.0);

        sc.close();
    }
}

