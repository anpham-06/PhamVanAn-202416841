import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số phần tử
        int n;
        while (true) {
            System.out.print("Enter number of elements: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
            } else {
                sc.next(); // bỏ input sai
            }
            System.out.println("Invalid number. Try again.");
        }

        int[] arr = new int[n];

        // nhập mảng
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    break;
                } else {
                    sc.next(); // bỏ input sai
                    System.out.println("Invalid number. Try again.");
                }
            }
        }

        // tính tổng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double avg = (double) sum / n;

        // sort
        Arrays.sort(arr);

        // output
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        sc.close();
    }
}