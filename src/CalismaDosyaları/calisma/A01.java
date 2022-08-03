package CalismaDosyaları.calisma;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("islem seciniz\n +,-,/,*");
        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println("toplam : "+(sayi1+sayi2));
                break;
                case "-":
                    System.out.println("fark : "+(sayi1-sayi2));
                    break;
                    case "*":
                        System.out.println("carpim : "+(sayi1*sayi2));
                        break;
            case"/":
                System.out.println("bolum: "+(sayi1/sayi2));
                break;

            default:
                System.out.println("islem icin gecerli bir modul giriniz");
        }





    }
}
