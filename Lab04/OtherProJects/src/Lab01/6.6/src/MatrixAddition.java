import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        // nhập kích thước
        while (true) {
            System.out.print("Enter number of rows: ");
            if (sc.hasNextInt()) {
                m = sc.nextInt();
                if (m > 0) break;
            } else sc.next();
            System.out.println("Invalid input.");
        }

        while (true) {
            System.out.print("Enter number of columns: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
            } else sc.next();
            System.out.println("Invalid input.");
        }

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        // nhập ma trận A
        System.out.println("Enter matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    if (sc.hasNextInt()) {
                        A[i][j] = sc.nextInt();
                        break;
                    } else {
                        sc.next();
                        System.out.println("Invalid input.");
                    }
                }
            }
        }

        // nhập ma trận B
        System.out.println("Enter matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    if (sc.hasNextInt()) {
                        B[i][j] = sc.nextInt();
                        break;
                    } else {
                        sc.next();
                        System.out.println("Invalid input.");
                    }
                }
            }
        }

        // cộng ma trận
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // in kết quả
        System.out.println("Result matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}