package assignment;

/** 4.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>) */

import java.util.Scanner;

public class Program4 {

    public float tipCalculator(float amount, int tip){
        float tip_amount = (amount*tip)/100;
        return tip_amount;
    }

    public static void main(String[] args) {
        System.out.println("Enter amount:\n");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        System.out.println("Enter tip:\n");
        Scanner sc2 = new Scanner(System.in);
        int tip = sc.nextInt();

        Program4 object = new Program4();
        float answer  = object.tipCalculator(amount,tip);
        System.out.println(answer);
    }

}
