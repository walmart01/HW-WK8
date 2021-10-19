package fridaypractice;

public class FridayPractice_3 {
     int eld;
     int deptNO;
     String eName;
     String job;
     public void display(int eld,String eName,int deptNO,String job) {
          System.out.println(eld);
          System.out.println(eName);
          System.out.println(deptNO);
          System.out.println(job);
     }
public static void main(String[]args){
          FridayPractice_3 emp1=new FridayPractice_3();
          emp1.display(101,"Jone",10,"Manual Teastr");

          FridayPractice_3 emp2=new FridayPractice_3();
          emp1.display(102,"Smith",11,"Automation Tester");
}
}
