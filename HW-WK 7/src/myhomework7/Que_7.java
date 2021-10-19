package myhomework7;

import java.util.Scanner;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
        then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%*/
public class Que_7 {
    public static void main(String[] args) {

        double comm = 0.0;
        int rate = 0, sale;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales rs:");
        sale = sc.nextInt();
        if (sale <= 50000) {
            rate = 35;
            comm = sale * 0.35;
        }
        if (sale <= 30000) {
            rate = 20;
            comm = sale * 0.20;
        }
        if (sale <= 20000) {
            rate = 10;
            comm = sale * 0.10;
        }
        if (sale <= 10000) {
            rate = 5;
            comm = sale * 0.5;
        }
        if (sale >= 10000) {
            rate = 2;
            comm = sale * 0.2;
        }
        System.out.println("Commission amount="+comm);
        System.out.println("Commission rate:"+rate+"%");
    }}




