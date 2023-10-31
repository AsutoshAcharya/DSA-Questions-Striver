import java.util.Scanner;

public class Q50Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        patternClass pattern = new patternClass();

        pattern.pattern9(input);
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

        public void pattern4(int n) {
            // 1
            // 2 2
            // 3 3 3

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                    if (j == i)
                        System.out.print("\n");
                }
            }
        }

        public void pattern5(int n) {
            // * * *
            // * *
            // *
            for (int i = n; i > 0; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print("* ");

                }
                System.out.println("\n");
            }
        }

        public void pattern6(int n) {
            // 1 2 3
            // 1 2
            // 1
            for (int i = n; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");

                }
                System.out.println("\n");
            }
        }

        public void pattern7(int n) {
            // ----*

            // ---***

            // --*****

            // -*******

            // *********
            for (int i = 1; i <= n; i++) {
                String spaces = "-".repeat(n - i);
                System.out.print(spaces);
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }

        public void pattern8(int n) {

            for (int i = n; i >= 1; i--) {
                String spaces = "-".repeat(n - i);
                System.out.print(spaces);
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }

        public void pattern9(int n) {
            for (int i = 1; i <= n; i++) {
                String spaces = "-".repeat(n - i);
                System.out.print(spaces);
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
            for (int i = n; i >= 1; i--) {
                String spaces = "-".repeat(n - i);
                System.out.print(spaces);
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }

            // String lineSeparator = System.lineSeparator(); // Platform-independent line
            // separator
            // StringBuilder sb = new StringBuilder();

            // for (int i = 1; i <= n; i++) {
            // sb.append("-".repeat(n - i));
            // sb.append("*".repeat(2 * i - 1));
            // sb.append(lineSeparator);
            // }

            // for (int i = n - 1; i >= 1; i--) {
            // sb.append("-".repeat(n - i));
            // sb.append("*".repeat(2 * i - 1));
            // sb.append(lineSeparator);
            // }

            // System.out.print(sb.toString());
        }
    }

}
