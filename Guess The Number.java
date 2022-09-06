package com.hanish.java;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hs= new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber=0;
        do{
            System.out.println("Guess my number(0-100) : ");
            usernumber=hs.nextInt();
            if(usernumber==mynumber) {
                System.out.println("BRUH...GREAT JOB!!...HERE HAVE SOME NACHOS!!!");
                break;
            }
             else if(usernumber>mynumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE PLEASE MAKE IT SMALL");
            }
            else {
                System.out.println("YOUR NUMBER IS TOO SMALL PLEASE MAKE IT LARGE");
            }
        }while(usernumber>=0);
        System.out.println("MY NUMBER WAS:");
        System.out.println(mynumber);





    }

}

