package myhomework7;

import java.util.Scanner;
/*Write a program that tells us input value is number or an alphabet or symbol.*/
public class Que_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch > 'A' && ch <= 'Z')) {
            System.out.println(ch +  "is A alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch +  "is A digit.");
        } else {
            System.out.println(ch+ "is A special character");
        }
    }
}