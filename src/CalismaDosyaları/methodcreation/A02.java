package CalismaDosyaları.methodcreation;

public class A02 {
    public static void main(String[] args) {


        int sayi=456;
        rakamlariTopla(sayi);
         A01.terstenYazdir("cano");

    }

    public static void rakamlariTopla(int sayi) {
       int birlerbasamagi=0;
       int rakamlartoplami=0;
        int sayimiz=sayi;

        birlerbasamagi=sayi%10;
        rakamlartoplami+=birlerbasamagi;
        sayi/=10;

        birlerbasamagi=sayi%10;
        rakamlartoplami+=birlerbasamagi;
        sayi/=10;


        birlerbasamagi=sayi%10;
        rakamlartoplami+=birlerbasamagi;
        sayi/=10;

        System.out.println("bize verilen "+sayimiz+" sayisinin rakamlari toplami : "+rakamlartoplami);

    }
}
