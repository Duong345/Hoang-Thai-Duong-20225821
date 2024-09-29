import javax.swing.JOptionPane;

public class LinearSystem {
    public static void main(String[] args) {
        // Nhập hệ số của phương trình
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số b2:"));

        // Tính các định thức
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Nghiệm của hệ phương trình là: x1 = " + x1 + ", x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm.");
        } else {
            JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm.");
        }
    }
}
