package packagebai13;
import java.util.Scanner;
public class DemSoTu {

    public static int demSoTu(String chuoi) {
        String[] tu = chuoi.trim().split("\\s+");  
        return tu.length;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String chuoi = scanner.nextLine();
        int soTu = demSoTu(chuoi);
        System.out.println("Số từ trong chuỗi là: " + soTu);

    }
}
