package assignment;

import java.util.Arrays;

/** Write a JAVA program that will generate/output the following numbers. 1, 2, 4, 7, 11, 16, 32, 39, 47, 56, 66 */

public class Program14 {

    public static void main(String[] args) {
        Program14 object = new Program14();
        int[] array = new int[10];
        int sum = 1;
       for(int i = 0; i< 10; i++){
            sum = sum + i;
            array[i] = sum;
        }
        System.out.println(Arrays.toString(array));
    }


}
