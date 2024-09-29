import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        // Nhập hệ số a, b, c
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhập hệ số c:"));

        // Kiểm tra nếu a = 0
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Đây không phải là phương trình bậc hai.");
            return;
        }

        // Tính delta (Δ)
        double delta = b * b - 4 * a * c;

        // Xử lý các trường hợp của phương trình
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + x);
        } else {
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
        }
    }
}
