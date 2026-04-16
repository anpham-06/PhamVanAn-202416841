import javax.swing.JOptionPane;

public class CalculateDoubleNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        // Nhập dữ liệu
        strNum1 = JOptionPane.showInputDialog(null,
                "Enter the first number:", "Input",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Enter the second number:", "Input",
                JOptionPane.INFORMATION_MESSAGE);

        // Convert sang double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Tính toán
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + diff +
                        "\nProduct: " + product;

        // Kiểm tra chia cho 0
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "\nQuotient: " + quotient;
        } else {
            result += "\nQuotient: Cannot divide by zero";
        }

        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result,
                "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
