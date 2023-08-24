package com.company;
import java.util.Scanner;




public class cbsc {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(" enter 1st marks");
        float a=sc.nextFloat();
        System.out.println("enter 2nd marks ");
        float b=sc.nextFloat();
        System.out.println(" enter third marks");
        float c=sc.nextFloat();
        System.out.println("enter 4th marks");
        float d=sc.nextFloat();
        System.out.println("enter 5th marks");
        float e=sc.nextFloat();
        float p=(a+b+c+d+e)/500*100;
        System.out.println(p);

    }




}
