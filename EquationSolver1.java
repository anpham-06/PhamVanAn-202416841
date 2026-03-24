package EquationSolver;
import javax.swing.JOptionPane;
public class EquationSolver1 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));

        if (a == 0) {
            if (b == 0) JOptionPane.showMessageDialog(null, "Phương trình vô số nghiệm.");
            else JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
        } else {
            JOptionPane.showMessageDialog(null, "Nghiệm x = " + (-b / a));
        }
    }
}