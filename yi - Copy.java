package com.company;
import java.util.Scanner;
import java.util.Random;

public class yi {

    public static void main(String[] args) {
        Scanner fg=new Scanner((System.in));
        System.out.println("enter 0 for rock\n 1for paper\n 2 for scissor");
        int user=fg.nextInt();
        Random com=new Random();
        int ty=com.nextInt();
        if(user==ty)
        {
            System.out.println("Draw");

        }
        else if (user==0&&ty==2||user==1&&ty==0||user==2&&ty==1)
        {
            System.out.println("you win");

        }
        else
        {
            System.out.println("computer win");
        }

    }
}
