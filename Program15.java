package assignment;

import java.util.Scanner;

/** 15.Write a Java program to detect key presses.If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show "Not allowed". */

public class Program15 {

    public static void main(String[] args) {
        Program15 object = new Program15();
        System.out.println("Enter a number:\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (input.length() > 1){
            System.out.println("Not allowed");
        }
        else {
            if (Character.isDigit(input.charAt(0))) {
                System.out.println("you pressed " + input);
            } else {
                System.out.println("Not allowed");
            }
        }
    }
}
