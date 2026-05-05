import java.util.Scanner;

public class Bai2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int month = sc.nextInt();
            if(month < 1 || month > 12){
                System.out.println("Khong hop le\n");
                continue;
            }
            switch(month){
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.printf("thang %d co 31 ngay\n", month);
                    break;
                case 4, 6, 9, 11:
                    System.out.printf("thang %d co 30 ngay\n", month);
                    break;
                case 2:
                    System.out.printf("Thang %d co 28 hoac 29 ngay\n", month);
                    break;
            }
        }
    }
}
