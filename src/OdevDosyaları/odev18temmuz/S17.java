package OdevDosyaları.odev18temmuz;

public class S17 {
    public static void main(String[] args) {

        /*
        17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
         */

        sayilariSirala();



    }

    private static void sayilariSirala() {

        int sayi1=12;
        int sayi2=24;
        int sayi3=34;
    if (sayi2 > sayi1 && sayi3 > sayi2) {
        System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi1);
    }else if (sayi1 > sayi2 && sayi3 > sayi2) {
        System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi2);
    }else if (sayi2 > sayi3 && sayi3 <  sayi1){
        System.out.println(" girilen sayilar icinde en kucuk sayi : "+sayi3);
    }
        }

    }

