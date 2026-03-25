package EquationSolver;
import javax.swing.JOptionPane;
public class EquationSolver2{
    public static void main(String[] args) {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            JOptionPane.showMessageDialog(null, "Hệ có nghiệm duy nhất:\nx1 = " + (D1/D) + "\nx2 = " + (D2/D));
        } else {
            if (D1 == 0 && D2 == 0) JOptionPane.showMessageDialog(null, "Hệ có vô số nghiệm.");
            else JOptionPane.showMessageDialog(null, "Hệ vô nghiệm.");
        }
    }
}

        

