package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K20 {
    public static void main(String[] args) {

        /*
         * Problem tanimi :
         *
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen kac adet urun aldiginizi giriniz");
        double adet=scan.nextDouble();
        System.out.println("lutfen urunun adet fiyatini tl olarak giriniz");
        double fiyat=scan.nextDouble();
        System.out.println("Musteri kartiniz var mı?\ntrue ya da false giriniz");
        boolean kart=scan.nextBoolean();
        double toplamFiyat=adet*fiyat;
        if (kart==true){
            if (adet>10){
                System.out.println("aldiginiz urunlerin toplam fiyati : "+(toplamFiyat-(toplamFiyat*0.2)));
            }else if (adet<=10){
            System.out.println("aldiginiz urunlerin toplam fiyati :"+ (toplamFiyat-(toplamFiyat*0.15)));
            }
        }else if (kart==false){
            if (adet>10){
                System.out.println("aldiginiz urunlerin toplam fiyati : "+(toplamFiyat-(toplamFiyat*0.15)));
            }else if (adet<=10){
                System.out.println("aldiginiz urunlerin toplam fiyati : "+(toplamFiyat-(toplamFiyat*0.1)));
            }else System.out.println("yanlis bir cevap girdiniz");





        }






    }
}
