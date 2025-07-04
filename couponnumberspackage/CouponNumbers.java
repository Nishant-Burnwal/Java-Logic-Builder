package com.bridgelabz.qa.couponnumberspackage;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    // Function to generate a random number from 0 to n-1
    public static int getRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }

    // Function to count total random numbers needed to collect all distinct coupons
    public static int countDistinctCoupons(int n) {
        boolean[] collected = new boolean[n]; // tracks which coupons are collected
        int count = 0;     // total random numbers generated
        int distinct = 0;  // number of unique coupons collected

        while (distinct < n) {
            int coupon = getRandomNumber(n);
            count++;

            if (!collected[coupon]) {
                collected[coupon] = true; 
                distinct++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of distinct coupon numbers (N): ");
        int n = sc.nextInt();

        // Process and Output
        int totalRandoms = countDistinctCoupons(n);
        System.out.println("Total random numbers needed to collect all " + n + " coupons: " + totalRandoms);

        sc.close();
    }
}

