import java.util.Scanner;

public class Q50Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        patternClass pattern = new patternClass();
        // pattern.pattern1(input);
        // pattern.pattern2(input);
        pattern.pattern3(input);
        scanner.close();
    }

    public static class patternClass {
        public void pattern1(int n) {
            // * * *
            // * * *
            // * * *
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                    if (j == n - 1)
                        System.out.print("\n");
                }
            }

        }

        public void pattern2(int n) {
            // *
            // * *
            // * * *
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                    if (j == i)
                        System.out.print("\n");
                }
            }
        }

        public void pattern3(int n) {
            // 1
            // 1 2
            // 1 2 3

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    if (j == i)
                        System.out.print("\n");
                }
            }
        }
    }

}
