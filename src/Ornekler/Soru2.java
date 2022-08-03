package Ornekler;

import java.util.Random;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        once rastgele belli bir aralıkta sayı uretelim
        daha sonra kullanıcıdan bir sayı alalım ve urettigimiz sayilarla kullanıcının girdigi sayi
        aynı olunca oyun bitsin ve kac tahminde dogru bildigini yazdıralim
         */
        Scanner scan=new Scanner(System.in);
        Random sayıUret=new Random();

int rastgeleSayi=10+sayıUret.nextInt(2);
        System.out.println(rastgeleSayi);
int sayi;
int sayac=0;
int sayim=1;
do {
    System.out.println(sayim+". sayiyi giriniz");
    sayi=scan.nextInt();
    sayim++;
if (sayi>rastgeleSayi){
    System.out.println("sayiyi kucuk giriniz");
}else if (sayi<rastgeleSayi){
    System.out.println("sayiyi buyutunuz");
}
sayac++;

}while(sayi!=rastgeleSayi);

        System.out.println("tebrikler "+sayac+".denemede sayiyi buldunuz");

    }
}
