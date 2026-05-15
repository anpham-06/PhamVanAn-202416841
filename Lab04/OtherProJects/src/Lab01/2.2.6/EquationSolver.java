import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chon bai toan:");
        System.out.println("1. Phuong trinh bac 1");
        System.out.println("2. He 2 phuong trinh bac 1");
        System.out.println("3. Phuong trinh bac 2");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                solveLinear(sc);
                break;
            case 2:
                solveSystem(sc);
                break;
            case 3:
                solveQuadratic(sc);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

    // 1. ax + b = 0
    public static void solveLinear(Scanner sc) {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }

    // 2. He 2 PT bac 1
    public static void solveSystem(Scanner sc) {
        System.out.print("Nhap a11, a12, b1: ");
        double a11 = sc.nextDouble();
        double a12 = sc.nextDouble();
        double b1 = sc.nextDouble();

        System.out.print("Nhap a21, a22, b2: ");
        double a21 = sc.nextDouble();
        double a22 = sc.nextDouble();
        double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = D1 / D;
            double y = D2 / D;
            System.out.println("Nghiem x = " + x + ", y = " + y);
        }
    }

    // 3. ax^2 + bx + c = 0
    public static void solveQuadratic(Scanner sc) {
        System.out.print("Nhap a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            // quay về bậc 1
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("Vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem x = " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Hai nghiem phan biet:");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiem kep x = " + x);
        } else {
            System.out.println("Vo nghiem (khong co nghiem thuc)");
        }
    }
}
