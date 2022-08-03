package Ornekler;

import java.util.Random;

public class Soru4 {
    /*
    Soru4:
    belirtilen aralıkta istenilen sayida uretilen rastgele sayinin
    her bir rakaminin toplamini hesaplayan programi yaziniz
     */
    public static void main(String[] args) {
        Random rastgele=new Random();

        for (int i = 0; i <5 ; i++) {
            int toplam=0;
            int sayi=rastgele.nextInt(100);
            System.out.println(sayi);
            while (sayi>0){
                toplam+=sayi%10;
                sayi/=10;

            }
            System.out.println("rakamlar toplami "+toplam);
        }


    }
}
