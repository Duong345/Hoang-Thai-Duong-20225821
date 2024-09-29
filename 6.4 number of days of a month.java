import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang = 0, nam = 0;

        // Nhập tháng
        do {
            System.out.print("Nhập tháng (1-12): ");
            if (scanner.hasNextInt()) {
                thang = scanner.nextInt();
                if (thang < 1 || thang > 12) {
                    System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
        } while (thang < 1 || thang > 12);

        // Nhập năm
        do {
            System.out.print("Nhập năm (số nguyên dương): ");
            if (scanner.hasNextInt()) {
                nam = scanner.nextInt();
                if (nam <= 0) {
                    System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
                scanner.next(); // Xóa dữ liệu không hợp lệ
            }
        } while (nam <= 0);

        // Xác định số ngày của tháng
        int soNgay = 0;
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29; // Năm nhuận
                } else {
                    soNgay = 28; // Năm không nhuận
                }
                break;
        }

        // Hiển thị kết quả
        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
    }
}
