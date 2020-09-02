import java.util.Scanner;

public class StackAlphabet {
    public static void main(String[] args) {
        String keepBox = "";
        // Input scanner
        Scanner input = new Scanner(System.in);
        // Convert
        char convertChar = input.next().toUpperCase().charAt(0);
        int index = (int) convertChar;
        // Operation
        for (int i = 65; i <= index; i++) {
            keepBox = keepBox + (char) i;
            System.out.println(keepBox);
        }
    }

}

/*
 * ☘️ If input is " G " the result should be ☘️ 
 * A 
 * AB 
 * ABC 
 * ABCD 
 * ABCDE 
 * ABCDEF
 * ABCDEFG ✅ PASSED
 */