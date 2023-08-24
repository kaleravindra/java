package com.company;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;



public class fg {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("0 for rock\n 1for paper\n2for scisoor");
        int a=sc.nextInt();

        Random po=new Random();
        int b=po.nextInt();
        if(a==b)
        {
            System.out.println("Draw");
        }
        else if(a==0&&b==2||a==1&&b==0||a==2&&b==1)
        {
            System.out.println("you win");
        }
        else
        {
            System.out.println("computer win");
        }
        if(b==0)
        {
            System.out.println("computer i/p rock");
        }
       else if(b==1)
        {
            System.out.println("computer i/p paper");
        }
       else if(b==2)
        {
            System.out.println("computer i/p scissor");
        }

    }

}
