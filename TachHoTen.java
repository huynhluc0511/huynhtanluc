package packagebai14;
import java.util.Scanner;
public class TachHoTen {
    public static void tachHoTen(String chuoi) 
        chuoi = chuoi.trim();
        String[] parts = chuoi.split("\\s+");

        if (parts.length < 2) {
            System.out.println("Vui lòng nhập đầy đủ họ và tên.");
        } else if (parts.length == 2) {
    
            System.out.println("Họ: " + parts[0]);
            System.out.println("Tên: " + parts[1]);
            System.out.println("Tên đệm: Không có");
        } else {
  
            String ho = parts[0];  
            String ten = parts[parts.length - 1];  
            String tenDem = "";  

            for (int i = 1; i < parts.length - 1; i++) {
                tenDem += parts[i] + " ";
            }
            tenDem = tenDem.trim();  

            System.out.println("Họ: " + ho);
            System.out.println("Tên: " + ten);
            System.out.println("Tên đệm: " + tenDem);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String chuoi = scanner.nextLine();
        tachHoTen(chuoi);
    }
}
