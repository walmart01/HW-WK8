package myhomework7;
/*9. Same as above program-8 using switch statement.*/

import java.util.Scanner;

public class Que_9{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        char city;
         city= scanner.next().charAt(0);

  switch (city){

      case 'A':
          System.out.println( "Ahmedabad");
          break;
      case 'B':
          System.out.println("Bombay");
          break;
      case 'c':
          System.out.println("Chennai");
          break;
      case  'D':
          System.out.println("Delhi");
          break;
      case 'E':
          System.out.println("Egypt");
          break;
      case 'F':
          System.out.println("France");
          break;
      default:
          System.out.println("Invalid Input doesn't exist city name");

  }

    }


    }



