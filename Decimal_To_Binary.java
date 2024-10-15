import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A 'DECIMAL' NUMBER ");
        int a = sc.nextInt();
        int n = 1;
        int  remainder = 0;
        int result = 0;
        while(a>0){
            remainder = a%2;
            result += remainder * n;
            n*=10;
            a/=2;
        }
        System.out.println("your 'BINARY' number is : " + result);
    }
}
