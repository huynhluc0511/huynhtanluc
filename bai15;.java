package packagebai15;
import java.util.Scanner;
public class TachNgayThangNam {
    public static void tachNgayThangNam(String chuoi) {
        String[] parts = chuoi.split("[/.-]");

        if (parts.length != 3) {
            System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
        } else {
            String ngay = parts[0];
            String thang = parts[1];
            String nam = parts[2];
            System.out.println("Ngày: " + ngay);
            System.out.println("Tháng: " + thang);
            System.out.println("Năm: " + nam);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày,tháng,năm : ");
        String chuoi = scanner.nextLine();
    }
}
