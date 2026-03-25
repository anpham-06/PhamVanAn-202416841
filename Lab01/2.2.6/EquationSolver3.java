package EquationSolver;
import javax.swing.JOptionPane;
public class EquationSolver3{
     public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhập c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) JOptionPane.showMessageDialog(null, "Vô số nghiệm.");
                else JOptionPane.showMessageDialog(null, "Vô nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Nghiệm x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2);
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + (-b / (2 * a)));
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm thực.");
            }
        }
    }
}    
