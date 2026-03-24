

import javax.swing.JOptionPane;
public class MathOperations {

    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog(null, "Nhập vào số thứ nhất:");

        String strNum2 = JOptionPane.showInputDialog(null, "Nhập vào số thứ hai:");
        double num1 = Double.parseDouble(strNum1);

        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;

        double difference = num1 - num2;

        double product = num1 * num2;
        String quotientResult;
        if (num2 == 0) {
            quotientResult = "Không thể chia cho 0!"; 
        } else {
            double quotient = num1 / num2;
            quotientResult = String.valueOf(quotient);
        }
        String resultMessage ="Tổng (Sum): " + sum + "\n"

                             + "Hiệu (Difference): " + difference + "\n"

                             + "Tích (Product): " + product + "\n"

                             + "Thương (Quotient): " + quotientResult;

        JOptionPane.showMessageDialog(null, resultMessage, "Kết quả tính toán", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
}
}


