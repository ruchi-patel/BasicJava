package assignment;

public class StairCasePattern {

    public void staircasePattern(int number){

        for(int i = 1 ; i <= number; i++){
            StringBuilder sb = new StringBuilder();
            int z = 1;
            for(int j = 1 ; j <= number; j++){
                new StringBuilder(sb);
                if( i+j > number){
                    sb.append(z);
                    z++;
                }
                else {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args){
        StairCasePattern object = new StairCasePattern();
        object.staircasePattern(9);
    }
}
