import java.util.Scanner;

public class Bai4{
    public static void checkTriangular(int x, int y, int z){
        if(x < 0 || y <0 || z < 0 || x + y <= z || x+z <= y || y+z<=x){
            System.out.println("Ba canh khong tao thanh tam giac");
        }
        else{
            if(x == y && y == z && x == z) System.out.println("Tam giac deu");
            else if(x == y || y == z || x == z) System.out.println("Tam giac can");
            else if(Math.pow(x,2) == Math.pow(y,2) + Math.pow(z, 2) || Math.pow(y,2) == Math.pow(x, 2) + Math.pow(z, 2) ||
                    Math.pow(z,2) == Math.pow(x,2) + Math.pow(y, 2)){
                System.out.println("Tam giac vuong");
            }
            else System.out.println("Tam giac thuong");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            checkTriangular(a,b,c);
        }
    }
}
