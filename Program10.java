package assignment;

import java.util.Scanner;

/** Write a program to input indefinite numbers and then calculate the sum of only the positive numbers. The program terminates when negative numbers is input */

public class Program10 {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter number:\n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number > 0) {
            sum = sum + number;
            System.out.println("Enter number:\n");
            number = sc.nextInt();
        }

            System.out.println(sum);

    }

}
