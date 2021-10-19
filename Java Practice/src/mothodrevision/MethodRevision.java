package mothodrevision;

public class MethodRevision {
    public static void main(String[] args) {
        //static area
        MethodRevision me = new MethodRevision();//object
        me.additionCalculation();
        me.subtraction(10, 20);
        me.myAddition();//5,10
      int value=  me.myAddition();//15
        System.out.println(value);//5,10,15
       // System.out.println(me.myAddition());//5,10,15
    }
    //1. No return type, No parameters(args)
    // instance method (

    public void additionCalculation() {

        //Local variables

        System.out.println();
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        myName("Prime");


    }

    //2.No return type (void),with parameters(args)

    public void subtraction(int a, int b) {
        System.out.println(a - b);


    }

    // with return type (data),no parameter(args)
    public int myAddition() {
        int a = 5;
        int b = 10;
        System.out.println("First value:" + a);
        System.out.println("Secount:" + b);
        return a + b;


    }
    //4.with return type(data),with parameter(args)
    private  static  String myName(String name){
        return name;


    }
}
