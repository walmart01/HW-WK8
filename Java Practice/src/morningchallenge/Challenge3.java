package morningchallenge;

public class Challenge3 {
     int eld;
     int deptNo;
     String eName;
     String job;

     public void display(int eld,String eName,int deptNo,String job){

         System.out.println(eld);
         System.out.println(eName);
         System.out.println(deptNo);
         System.out.println(job);
     }
     public static void main(String[]args){
         Challenge3 emp1=new Challenge3();
         emp1.display(101,"john",10,"Manual Tester");

         Challenge3 emp2 = new Challenge3();
         emp2.display(102,"Smith",11,"Automation Tester");


             }
         }


