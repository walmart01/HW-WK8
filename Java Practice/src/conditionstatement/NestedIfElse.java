package conditionstatement;

public class NestedIfElse {
    public static void main(String[] args) {

        int marks =90;
        if(marks>=90){
            System.out.println("Grad a");

        }else if(marks<80&&marks >=70){
            System.out.println("Grade b");
        }else  if (marks<70&& marks>=60){
            System.out.println("Grade c");
        }else {
            System.out.println("pass");
        }
    }
}
