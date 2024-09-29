import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao của tam giác từ người dùng
        System.out.print("Nhập chiều cao của tam giác (n): ");
        int n = scanner.nextInt();

        // Vẽ tam giác
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In dấu sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng
            System.out.println();
        }

        scanner.close();
    }
}
