package packagenamnhuanhaykhông;
import java.util.Scanner;

public class namkhongnhuan {
    
    public static boolean namnhuan(int nam) {
        if (nam % 4 == 0) {
            if (nam % 100 != 0 || nam % 400 == 0) {
                return true; 
            }
        }
        return false; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();  
        if (namnhuan(nam)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }
    }
}
