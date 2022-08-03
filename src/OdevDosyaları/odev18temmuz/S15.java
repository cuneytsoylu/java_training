package OdevDosyaları.odev18temmuz;

import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {

/*
 15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i

 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("kacıncı index deki karakteri istiyorsunuz");
         int sira=scan.nextInt();

         cumle=cumle.substring(sira,sira+1);

        System.out.println(sira+".  index deki karakter : "+cumle);

    }
}
