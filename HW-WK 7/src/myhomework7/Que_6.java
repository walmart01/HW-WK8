package myhomework7;

import java.util.Scanner;
/*Write a java program to input any number and find out if it’s odd or even*/
public class Que_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even:"+num);
        } else {
            System.out.println("number is odd:"+num);
        }
    }
}

