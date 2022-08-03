package Ornekler;


import java.util.Random;

public class Soru3 {

/*
soru 3:
Belirtilen aralikta istenilen sayida uretilen rastgele sayilari
asal ve çift sayi olarak gruplayalım
 */
public static void main(String[] args) {

    Random rastgele = new Random();


    for(int i = 0; i < 30; i++)
    {
      int  sayi =rastgele.nextInt(100);

        int   sayac = 0;
        for(int j = 2; j < sayi; j++)
        {
            if(sayi % j == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println("Asal sayi = " + sayi);
        }
        if(sayi % 2 == 0) {
            System.out.println("Çift sayılar = " + sayi);
        }if (sayi%2==1){
        System.out.println(sayi+"sayi tek");
    }
    }


}



    }
