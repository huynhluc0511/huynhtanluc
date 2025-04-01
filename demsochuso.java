package packagedemsochuso;
import java.util.Scanner;
public class DemSoChuSo {

    public static int demSoChuSoVongLap(int num) {
        int dem = 0;
        while (num != 0) {
            num /= 10;  
            dem++;  
        }
        return dem;
    }

    public static int demSoChuSoBangChuoi(int num) {
        String str = Integer.toString(num);  
        return str.length();  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        int soChuSoVongLap = demSoChuSoVongLap(num);

        int soChuSoChuoi = demSoChuSoBangChuoi(num);

        System.out.println("Số chữ số (vòng lặp): " + soChuSoVongLap);
        System.out.println("Số chữ số (chuỗi): " + soChuSoChuoi);

    }
}
