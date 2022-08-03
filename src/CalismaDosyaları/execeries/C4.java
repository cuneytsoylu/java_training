package CalismaDosyaları.execeries;

import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {

/*
Kullanıcıdan üç sayı alın ve en büyük sayıyı yazdırın.

Test Verileri
1. Numarayı girin: 25
2. Numarayı girin: 78
3. Numarayı girin: 87
Beklenen Çıktı :
En büyüğü: 87
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("lutfen ucuncu sayiyi giriniz");
        double sayi3=scan.nextDouble();

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("sayi1 = " + sayi1);
        }else if (sayi2>sayi1 && sayi2>sayi3){
            System.out.println("sayi2 = " + sayi2);
        }else System.out.println("sayi3 = " + sayi3);

    }
}
