import javax.swing.JOptionPane;

public class CalculateOperations {
    public static void main(String[] args) {
        // Nhập hai số từ người dùng
        String strNum1 = JOptionPane.showInputDialog(null, "Nhập số thứ nhất:");
        String strNum2 = JOptionPane.showInputDialog(null, "Nhập số thứ hai:");

        // Chuyển đổi từ chuỗi sang double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Tính toán các phép tính
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient = (num2 != 0) ? String.valueOf(num1 / num2) : "Không thể chia cho 0";

        // Hiển thị kết quả
        String result = "Tổng: " + sum + "\n"
                + "Hiệu: " + difference + "\n"
                + "Tích: " + product + "\n"
                + "Thương: " + quotient;
        JOptionPane.showMessageDialog(null, result);
    }
}
