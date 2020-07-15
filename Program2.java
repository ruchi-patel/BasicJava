package assignment;

import java.util.Scanner;

/** 2.Take a number from user and Print if the number is less than 200 and even number otherwise print invalid number using Logical Operator. */

public class Program2 {

    public static void main(String[] args){
        Program2 object = new Program2();
        System.out.println("Enter a number:\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input < 200 && input%2 == 0){
            System.out.println(input + " is less than 200 and even");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
