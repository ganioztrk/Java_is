
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,max;
        
        System.out.println("Lütfen 3 Tam Sayı Giriniz");
        
        System.out.print("a:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();
        System.out.print("c:");
        c = scanner.nextInt();
        
        if(a>=b && a>=c){
            max = a;
        }
        else if(b>=a && b>=c){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println("Maksimum Sayı: " + max);
    }
}
