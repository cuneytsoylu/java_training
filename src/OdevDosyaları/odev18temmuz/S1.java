package OdevDosyaları.odev18temmuz;

public class S1 {
    /*


     1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
    Test Data
    34
    Beklenen Çıktı
    7
     */
    public static void main(String[] args) {
        int sayi=34;
        int rakamlarTop=0;

        while (sayi>0){
        rakamlarTop+=sayi%10;
        sayi/=10;
        }
        System.out.println("girdiginiz sayinin rakamlari toplami: "+rakamlarTop);
    }




}
