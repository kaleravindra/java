package com.company;
import java.util.Scanner;



public class ravi {

    public static void main(String[] args)
    {
        float a,b,c,d,e,f ,sum,ty;
        System.out.println("taking i/p fram user");
        Scanner p=new Scanner(System.in);
        System.out.println(" enter 1st number");
         a=p.nextFloat();
        System.out.println("enter 2nd number");
         b=p.nextFloat();
        System.out.println(" enter thrd number");
        c= p.nextFloat();
        System.out.println("enter four number");
        d=p.nextFloat();
        System.out.println("entyer five number ");
        e=p.nextFloat();


         sum=a+b+c+d+e;
         ty=sum/500;
        System.out.println(ty);


    }

}
