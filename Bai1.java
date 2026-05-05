import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int number = sc.nextInt(), sum = 0;
            if(number < 1){
                System.out.printf("Không hợp lệ\n");
                continue;
            }
            for(int i = 1; i<=number;i++){
                sum += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là %d\n", number, sum);
        }
    }
}
