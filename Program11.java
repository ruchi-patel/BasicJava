package assignment;

/** Write a program to print year from 1 to 4000 except leap years using Continue statement. */
public class Program11 {
    public void leapYear(){
        for(int i = 1; i <= 4000; i++){
            if(i%4 == 0){
                if(i%100 != 0)
                continue;
            }
            if(i%400 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String [] args){
        Program11 object = new Program11();
        object.leapYear();
    }
}
