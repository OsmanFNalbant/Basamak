import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("C(n,r) n'i giriniz:");
    int a=sc.nextInt();
    int x =1;
    int toplam=0;
    while(a/10!=0) {
        System.out.println(x+ "'ler basamağı "+a%10);
        toplam +=(a%10);
        a=a/10;
        x*=10;
    }
    System.out.println((x*10)+"'ler basamağı "+a);
    System.out.println("Basamak toplamı:"+(a+toplam));
    }
}