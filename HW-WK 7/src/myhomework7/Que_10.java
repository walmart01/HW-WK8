package myhomework7;

import java.util.Scanner;

public class Que_10 {
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
                                                                                            /, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the operator (+,-,*,/): ");
        ch = scanner.next().charAt(0);
        if (ch == '+') {
            System.out.println("Addition of" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of" + num1 + "*" + num2 + "=" + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Division of" + num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
        }
    }  }