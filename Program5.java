package assignment;

/** 5.Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement */

public class Program5 {

        public boolean checkLeapYear(int year){
            if (year % 4 == 0){
                if(year %100 != 0){
                    return true;
                }
                else if(year % 400 == 0){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args){
            Program5 object = new Program5();
            boolean answer = object.checkLeapYear(Integer.parseInt(args[0]));
            System.out.println(answer);
        }
}
