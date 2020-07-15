package assignment;

/** 13.Write a program to remove White Spaces from string in Java? ”Enter input string to be cleaned from white spaces...!” INPUT :OneSpace TwoSpaces ThreeSpaces FourSpaces Tab End */

public class Program13 {

    public String program13(String input) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {

            if (Character.isSpaceChar(input.charAt(i))) {
                continue;
            }
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Program13 object = new Program13();
        String output = object.program13("Did   i remove all   the spaces?");
        System.out.println(output);

    }
}
