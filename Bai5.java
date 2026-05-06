import java.util.Scanner;

public class Bai5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String number = sc.next();
            if(Integer.parseInt(number) < 100 || Integer.parseInt(number) > 999){
                System.out.println("So nhap vao khong hop le");
                continue;
            }
            char hundreds = number.charAt(0);
            char tens = number.charAt(1);
            char units = number.charAt(2);
            String statement = "";
            switch(hundreds){
                case '1':
                    statement += "Mot tram ";
                    break;
                case '2':
                    statement += "Hai tram ";
                    break;
                case '3':
                    statement += "Ba tram ";
                    break;
                case '4':
                    statement += "Bon tram ";
                    break;
                case '5':
                    statement += "Nam tram ";
                    break;
                case '6':
                    statement += "Sau tram ";
                    break;
                case '7':
                    statement += "Bay tram ";
                    break;
                case '8':
                    statement += "Tam tram ";
                    break;
                case '9':
                    statement += "Chin tram ";
                    break;
            }

            switch(tens){
                case '0':
                    if(units == '0') {
                        statement += "";
                    }
                    else{
                        statement += "le ";
                    }
                    break;
                case '1':
                    statement += "muoi ";
                    break;
                case '2':
                    statement += "hai muoi ";
                    break;
                case '3':
                    statement += "ba muoi ";
                    break;
                case '4':
                    statement += "bon muoi ";
                    break;
                case '5':
                    statement += "nam muoi ";
                    break;
                case '6':
                    statement += "sau muoi ";
                    break;
                case '7':
                    statement += "bay muoi ";
                    break;
                case '8':
                    statement += "tam muoi ";
                    break;
                case '9':
                    statement += "chin muoi ";
                    break;
            }
            switch(units){
                case '1':
                    statement += "mot ";
                    break;
                case '2':
                    statement += "hai ";
                    break;
                case '3':
                    statement += "ba ";
                    break;
                case '4':
                    statement += "bon ";
                    break;
                case '5':
                    statement += "nam ";
                    break;
                case '6':
                    statement += "sau ";
                    break;
                case '7':
                    statement += "bay ";
                    break;
                case '8':
                    statement += "tam ";
                    break;
                case '9':
                    statement += "chin ";
                    break;
                default:
                    break;
            }
            System.out.println(statement.trim());
        }
    }
}
