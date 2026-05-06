import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bai6{
    public static int countLetterNumber(long number){
        int dem = 0;
        while(number != 0){
            dem++;
            number/=10;
        }
        return dem;
    }
    public static boolean armstrong(long number){
        int count = countLetterNumber(number);
        double sum = 0d, temp = number;
        while(number != 0){
            sum += Math.pow(number%10, count);
            number /= 10;
        }
        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long number = sc.nextLong();
            List<Long> list = new ArrayList<>();
            for (long i = 0; i < number + 1; i++) {
                if (i < 10) list.add(i);
                else {
                    if (armstrong(i)) list.add(i);
                }
            }
            for (var x : list) {
                System.out.printf(x + " ");
            }
            System.out.println();
        }
    }
}
