
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Bir sayı giriniz:");
     
        int faktoriyel = 1;
     
        int sayi = scanner.nextInt();
     
        for (int i = 1; i <= sayi;i++) {
         
        faktoriyel *= i;
        
        System.out.println("Faktoriyel = " + faktoriyel + " i = " + i);
        }
        System.out.println("Faktöriyel = " + faktoriyel);   
    }
}
