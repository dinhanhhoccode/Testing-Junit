import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        double tong = soThuNhat + soThuHai;
        System.out.println("Tổng của hai số là: " + tong);

        scanner.close();
    }
}
