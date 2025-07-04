package com.bridgelabz.qa.bitwiseandorxor;

import java.util.Scanner;

// Doubt1: uses of Bitwise andorxor
public class BitwiseAndOrXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 12; // 1100
        int b = 10; // 1010

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b)); // when both a and b bit are same return 0 else 1

        // Bitwise Shifts
        // Write a program that multiplies a given integer by 2
        // using the left (<<) shift operator

        // Input the number
        System.out.print("Enter a integer: ");
        int number = sc.nextInt(); // 5 = 00000101

        // Multiply the number
        // To learn: In binary left shift (<<) of any number multiplies the number by 2
        int result = number << 1; // left shift by 1 bit 00001010

        // print the result
        System.out.println("Result after 1 bitwise left shift: " + result);

        // Create a program that divides a given integer by 2 using the right shift operator

        System.out.print("Enter a integer: ");
        int number2 = sc.nextInt(); // 8 = 00001000

        // To learn: In 1 bitwise right shift (>>) of any number divides the number by 2
        int result2 = number2 >> 1; // right shift by 1 bit 00000100 (which is 2)

        // print the result
        // Note if n = 5 results 2 not 2.5 remainders excluded
        System.out.println("Result after 1 bitwise right shift: " + result2);

        /* Write a program that determines if a number is odd or even using the bitwise AND operator */

        /* Logic:
        In binary, even numbers always have the last bit (LSB) as 0

        Odd numbers have the last bit as 1 */

        System.out.println(7 & 1);
        System.out.println(6 & 1);

        int n = 6;

        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is odd");
        }

        // Minimum of two numbers
        int n1 = 10, n2 = 20;
        int min = (n1 > n2) ? n2 : n1;
        System.out.println("Minimum: " + min);

        // Pass or Fail
        int score = 90;
        String score_result =  (score > 40) ? "Pass" : "Fail";
        System.out.println("Student Pass or Fail: " + score_result);
    }
}

