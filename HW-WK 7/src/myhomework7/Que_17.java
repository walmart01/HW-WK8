package myhomework7;

import java.util.Arrays;
/*Write a Java program to sort a numeric array and a string array.*/
public class Que_17 {
    public static void main(String[] args) {
    int[]arraydata1={23,45,6,56,77,89,90,65,45,78};
    String[]arraydata2={"Josh","Max","Alax","John"};
        System.out.println("value:"+ Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted value:"+Arrays.toString(arraydata1));
        Arrays.sort(arraydata2);
        System.out.println("Value:"+Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("short value:"+Arrays.toString(arraydata2));
    }
}

