package vipul.basic;

public class RightTrianglePattern {

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPatternOptimized(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        printPattern(5);
        System.out.println();
        printPatternOptimized(5);
    }
}
