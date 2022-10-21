import java.util.Scanner;

public class AsalSayii {
    static int prime(int a ,int b){
        if(a == b){
            System.out.print(a +" bir asal sayıdır.");
            return 0;
        }else if(a % b == 0){
            System.out.print(a + "bir asal sayı değildir.");
            return 1;
        }return prime(a , b+1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int n = inp.nextInt();
        prime(n , 2);
    }
}
