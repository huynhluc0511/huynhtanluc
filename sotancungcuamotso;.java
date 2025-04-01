package packagesotancungcuamotso;
import java.util.Scanner;
public class TimChucSo {
    
    public static int timChuSoDauTien(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;  
    }

    public static int timChuSoTanCung(int num) {
        return num % 10; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        int chuSoDauTien = timChuSoDauTien(num);
        int chuSoTanCung = timChuSoTanCung(num);

        System.out.println("Chữ số đầu tiên: " + chuSoDauTien);
        System.out.println("Chữ số tận cùng: " + chuSoTanCung);

    }
}
