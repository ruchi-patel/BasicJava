package assignment;

import java.util.Scanner;

/** 1.Take input from the user and Print if the number is less than or greater than 100 using Ternary Operator */

public class Program1 {

public static void main(String[] args){
    Program1 object = new Program1();
    System.out.println("Enter the input:\n");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    String message = input >= 100 ? "number is greater than or equal to 100" : "number is less than 100";
    System.out.println(message);
}
}
