
import java.util.Scanner;

public class bai63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // in khoảng trắng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // in dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // xuống dòng
        }

        sc.close();
    }
}