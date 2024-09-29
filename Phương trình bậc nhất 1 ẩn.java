import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        // Nhập hệ số a và b
        String strA = JOptionPane.showInputDialog(null, "Nhập hệ số a:");
        String strB = JOptionPane.showInputDialog(null, "Nhập hệ số b:");

        // Chuyển đổi từ chuỗi sang double
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        // Xử lý các trường hợp
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm của phương trình là: " + x);
        }
    }
}
