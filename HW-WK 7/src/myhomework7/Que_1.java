package myhomework7;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
      /*  Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even number:"+num);
        } else {
            System.out.println("Number is odd number:"+num);
        }
    }
}
