import java.util.Scanner;

public class Bai3{
    public static int sumLetterNumber(long n){
        n = Math.abs(n);
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long number = sc.nextLong();
            System.out.printf("Tong cac chu so la: %d\n", sumLetterNumber(number));
        }
    }
}
