import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Khai báo và nhập giá trị cho mảng
        int[] my_array1 = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            my_array1[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(my_array1);

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("Sorted array: " + Arrays.toString(my_array1));

        // Tính tổng các phần tử của mảng
        int sum = 0;
        for (int num : my_array1) {
            sum += num;
        }

        // Tính giá trị trung bình
        double average = (double) sum / n;

        // Hiển thị tổng và giá trị trung bình
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
