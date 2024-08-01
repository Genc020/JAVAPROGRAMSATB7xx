package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle_Classifier {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length for side1");
    int Side1 = sc.nextInt();
    System.out.println("Enter the length for side2");
    int Side2 = sc.nextInt();
    System.out.println("Enter the length for side3");
    int Side3 = sc.nextInt();

    if (Side1==Side2 && Side2==Side3) {
        System.out.println("Equilateral Triangle");
    } else if (Side1==Side2 || Side1==Side3 || Side3==Side2 ) {
        System.out.println("Isosceles Triangle");
    } else if (Side1+Side2<=Side3 || Side2+Side3<= Side1 || Side1+Side3<=Side2) {
        System.out.println("Not a triangle");
    } else if (Side1<=0 || Side2<=0 || Side3<=0) {
        System.out.println("Invalid triangle");
    }
    else{
        System.out.println("Scalene Triangle");
    }

}

}
