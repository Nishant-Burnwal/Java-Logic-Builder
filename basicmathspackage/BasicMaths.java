package com.bridgelabz.qa.basicmathspackage;

import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series");
        System.out.print("Enter the nth term of fibonacci Series: ");
        int n1 = 0;
        int n2 = 1;
        int nth_term = sc.nextInt();
        System.out.print("Fibonacci Series: " + n1 + " " + n2 + " ");
        for (int i = 2; i <= nth_term; i++) {
            int n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        // Q2. Perfect Number
        System.out.println("Perfect Number: ");
        int number = 31;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        boolean isPerfect = sum == number;
        System.out.println(number + " isPerfect?: " + isPerfect);

        // Q3. Prime number
        int num = 97;

        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            int limit = (int) Math.sqrt(num); // Take square root of num and convert to int
            for (int i = 2; i < limit; i++)
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
        }
        System.out.println(num + " isPrime?: " + isPrime);

        // Q4. Reverse a number
        int n = 12345;
        int copyOfn = n;
        int revOfn = 0;

        while (n > 0){
            int digit = n % 10;
            revOfn = (revOfn * 10) + digit;
            n = n / 10;
        }

        System.out.println("Reverse of " + copyOfn + ": " + revOfn);
    }
}
