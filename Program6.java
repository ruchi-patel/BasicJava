package assignment;

import java.util.Scanner;

/** 6.Check whether an alphabet is vowel or consonant using switch statement */

public class Program6 {

    public static void main(String[] args){
        Program6 object = new Program6();
        System.out.println("Enter alphabet:");
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();

        switch (alphabet){

            case "a":
                System.out.println("It is a Vowel");
                break;
            case "e":
                System.out.println("It is a Vowel");
                break;
            case "i":
                System.out.println("It is a Vowel");
                break;
            case "o":
                System.out.println("It is a Vowel");
                break;
            case "u":
                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is a Consonant");

        }

    }
}
