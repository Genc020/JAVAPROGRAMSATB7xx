package Homework;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
            int i = sc.nextInt();

             if(i%4==0 && !(i%100==0))

            {
                System.out.println("It is a leap year");
            }
             else if(i%4==0&&i%100==0&&i%400==0)
            {
                System.out.println("It is a leap year");
            }
             else{
                System.out.println("It is not a leap year");
            }
    }
}
