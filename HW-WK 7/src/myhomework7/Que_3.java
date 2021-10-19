package myhomework7;

import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class Que_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Student name:");
        String name = sc.nextLine();
        System.out.println("Enter Student Roll no:");
        int roll = sc.nextInt();
        System.out.println("Enter math marks:");
        int math = sc.nextInt();
        System.out.println("Enter science marks");
        int science = sc.nextInt();
        System.out.println("Enter English marks");
        int english = sc.nextInt();

//
//
//
//
//       }

        if (!(math >= 0 && math <= 100)) {
            System.out.println("Invalid Input marks between 1 to100");
        }
        System.out.println("Enter science marks:");
        if (!(science >= 0 && science <= 100)) {
            System.out.println("Invalid Input marks between 1 to 100");
        }
        System.out.println("Enter English marks");

        if (!(english >= 0 && english <= 100)) {
            System.out.println("Invalid Input marks between 1 to 100");
        }
        int total = math + science + english;
        double percentage = (total / 3);
        System.out.println("percentage is:" + percentage);

        // if (percentage >= 35) {
        //  String result = "

        if (percentage >= 80) {
            String Grade = "A+";
        } else if (percentage >= 60) {
            String Grade = "A";
        } else if (percentage >= 50) {
            String Grade = "B";
        } else if (percentage >= 35) {
            String Grade = "c";
        } else {
        }


        System.out.println("|_____________________________________________|");
        System.out.println("|              Mark Sheet                     |");
        System.out.println("|_____________________________________________|");
        System.out.println("|     Name             :        " + name + "  |");
        System.out.println("|   Roll no            :        " + roll + "  |");
        System.out.println("|_____________________________________________|");
        System.out.println("|   Subject            :                      |");
        System.out.println("|_____________________________________________|");
        System.out.println("|    Math              :       " + math + "    |");
        System.out.println("|    Science           :       " + science + " |");
        System.out.println("|    English           :        " + english+"   |");
        System.out.println("|_____________________________________________|");
        System.out.println("|     Total             :         marks        |");
        System.out.println("|______________________________________________|");
        System.out.println("|   Percentage           :     " + percentage+" |");
        System.out.println("|   Rusult                :                    | ");
        System.out.println("|    Grade                :                     |");
        System.out.println("|________________________________________________|");


        //main and class
    }
}





