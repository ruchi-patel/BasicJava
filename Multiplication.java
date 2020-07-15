package assignment;

public class Multiplication {

    public void multiplication(int number){
        for(int i = 1; i <=10; i++){
             int answer = number * i;
            System.out.println(number +" * "+ i  +" = " +answer);
        }
    }
    public static void main(String args[]){
        Multiplication object = new Multiplication();
        object.multiplication(2);
    }
}
