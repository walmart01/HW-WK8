package myhomework7;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF*/

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name= scanner.nextLine();
        System.out.println("Enter employee ID:");
        int ID= scanner.nextInt();
        System.out.println("Enter salary");
        int salary= scanner.nextInt();
        System.out.println("HRD,TA,DA,PF = Gross:");
        int Gross=scanner.nextInt();

        if("(basic salary=+(%10)+,(%8),+(%9)-(%20)" == "Gross") {
            System.out.println("Gross salary");

        }
            System.out.println("|-------------------------------------------------|");
            System.out.println("|                Salary  Slip                     |");
            System.out.println("|_________ _______________________________________|" );
            System.out.println("|   Employee ID           :            ID         |");
            System.out.println("|   Employee name         :           name        |");
            System.out.println("|__________________________________________________|");
            System.out.println("|   Basic Salary          :           Salary      |");
            System.out.println("|    HRD                  :           HRD         |");
            System.out.println("|     TD                 :             TD         |");
            System.out.println("|      DA                 :           DA           |");
            System.out.println("|      PF                :            PF           |");
            System.out.println("|_________________________________________________ |");
            System.out.println("|   Gross Salary         :             Salary      |");
            System.out.println("|__________________________________________________|");
        }

        }





