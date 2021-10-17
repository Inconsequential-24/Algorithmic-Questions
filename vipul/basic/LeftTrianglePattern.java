package vipul.basic;

import java.util.Arrays;

public class LeftTrianglePattern {

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPatternOptimized(int n) {
        char[] ch = new char[n];
        Arrays.fill(ch, ' ');
        for (int i = n - 1; i >= 0; i--) {
            ch[i] = '*';
            System.out.println(String.valueOf(ch));
        }
    }

    public static void main(String[] args) {
        printPattern(5);
        System.out.println();
        printPatternOptimized(5);
    }
}
