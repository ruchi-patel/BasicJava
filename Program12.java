package assignment;

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args){
        System.out.println("what is a command key word to exit a loop in java ?");
        System.out.println("a.quit");
        System.out.println("b.continue");
        System.out.println("c.break");
        System.out.println("c.exit");
        String input;
        String continueIndicator;

        do {
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            input = sc.next();
            if(input.equals("c")){
                System.out.println("Congratulation");
            }
            else {
                System.out.println("Incorrect");
            }
            System.out.println("Press y to continue:");
            continueIndicator = sc.next();
        } while( continueIndicator.equals("y"));
    }
}
