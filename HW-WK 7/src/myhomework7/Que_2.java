package myhomework7;

import java.util.Scanner;

public class Que_2{
   /* Write a java program to input any year like (ex.2007) and find out if it is leap year or
    not?*/
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year+ "is a leap year");

        }
    }
}

