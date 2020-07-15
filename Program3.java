package assignment;

import java.util.Arrays;

/** 3.Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt */

public class Program3 {

    public int[] fibonacciSeries(int input){

        int[] array = new int[input];

        if (input == 1){
            array[0] = 0;
        }
        if (input == 2){
            array[0] = 0;
            array[1] = 1;
        }
        if (input > 2){
            array[0] = 0;
            array[1] = 1;
            for(int i = 2; i < input; i++ ){
                array[i] = array[i-1] + array[i-2];
            }
        }
        return array;
    }
    public static void main(String[] args){
        Program3 object = new Program3();
        int [] array =  object.fibonacciSeries(11);
        System.out.println(Arrays.toString(array));

    }
}
