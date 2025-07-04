package com.bridgelabz.qa.javamathcode;
//Doubt 1: Important imports to learn

import java.util.Scanner;

public class JavaMaths {
    public static void main(String[] args) {
        System.out.println("java maths");
        Scanner sc = new Scanner(System.in);
//         Q1: Addition and Subtraction
        System.out.print("Enter no. 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no. 2: ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        int difference = n1 - n2;

        System.out.println("Sum of " + n1 + " + " + n2 + " is: " + sum );
        System.out.println("Difference of " + n1 + " - " + n2 + " is: " + difference );

        // Q2: Multiplication Table
        System.out.println("Multiplication Table: ");
        System.out.println("Enter table you want: ");
        int t = sc.nextInt();
        System.out.println(" Multiplication Table of " + t);
        for (int i = 1; i <= 10; i++) {
            System.out.println(t +"*"+ i +":" + t * i);
        }

        // Q3: Average of 5 numbers
        System.out.println("Average of 5 nos.: ");
        System.out.println("Enter 5 nos.: ");
        int sum1 = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Num" + i + ": ");
            int num = sc.nextInt();
            sum1 += num;
        }
        System.out.println("Average: " + sum1/5);

        // Q4. Area of circle
        System.out.println("Area of circle: \nEnter Radius of circle: ");
        int radius = sc.nextInt();
        float area= (float) (3.14 * radius * radius);
        System.out.println("Area of circle: " + area);

        // 2.1 MAX of three numbers
        int a = 10, b = 40, c = 20;

        int greatest = (a > b) ? a : b;
        greatest = (c > greatest)? c : greatest;

        System.out.println("Greatest: " + greatest);

        //2.2 Equality check

        int a1 = 5;
        int b1 = 6;

        System.out.println(a + "==" + b + ": " + (a1 == b1));

        // 3.1 Leap year
        int year = 2024;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Divisibility check
        int num1 = 5, num2 = 7;
        System.out.print("Enter the no. to check divisibility: ");
        int userNo = sc.nextInt();
        System.out.print("Are " + num1 + " and " + num2 + " divisible by " + userNo + ": ");
        System.out.println(userNo % num1 == 0 && userNo % num2 == 0);

        // Compound Assignment
        int numadd = 10;
        numadd += 5;
        int numsub = 10;
        numsub -= 5;
        int multinum = 5;
        multinum *= 5;
        int divnum = 10;
        divnum /= 5;
        int modulonum = 10;
        modulonum %= 5;
        System.out.println(numadd + " " + numsub + " " + multinum + " " + divnum + " " + modulonum);

        // Post-Increment and Pre-Increment
        int n = 5;
        System.out.println(n++); // Post-Increment
        System.out.println(n);
        System.out.println(--n);// Pre-Increment
        System.out.println(n);

        // ToggleBoolean
        boolean flag = true;
        System.out.println("Initial value: " + flag);

        flag = !flag;
        System.out.println("After 1st toggle: " + flag);

        flag = !flag;
        System.out.println("After 2nd toggle: " + flag);

        System.out.println("First Module");
    }
}
