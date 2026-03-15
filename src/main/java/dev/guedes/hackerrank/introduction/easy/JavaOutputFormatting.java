package main.java.dev.guedes.hackerrank.introduction.easy;

import java.util.Scanner;

/**
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
 * <br><br>
 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
 * <br><br>
 * <strong>Input Format</strong>
 * <br><br>
 * Every line of input will contain a String followed by an integer.
 * <br>
 * Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
 * <br><br>
 * <strong>Output Format</strong>
 * <br><br>
 * In each line of output there should be two columns:
 * <br>
 * The first column contains the String and is left justified using exactly 15 characters.
 * <br>
 * The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 * <strong>Sample Input</strong>
 * <code>
 *     java 100<br>
 *     cpp 65<br>
 *     python 50
 * </code>
 * <br><br>
 * <strong>Sample Output</strong>
 * <code>
 *     ================================<br>
 *     java           100<br>
 *     cpp            065<br>
 *     python         050<br>
 *     ================================
 * </code>
 * <br><br>
 * <strong>Explanation</strong>
 * Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
 *
 * @author João Guedes
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================");

            for (int i = 0; i < 3; i++) {
                String s = scanner.next();
                int n = scanner.nextInt();

                System.out.printf("%-14s %03d%n", s, n);
            }

            System.out.println("================================");
        }
    }
}
