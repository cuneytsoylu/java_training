package CalismaDosyaları.calisma;

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kac adet urun aldiniz");
        int urun=scan.nextInt();
        System.out.println("urunun adet fiyatini giriniz");
        double fiyat=scan.nextDouble();
        System.out.println("Musteri kartiniz var mı?\n E yada H giriniz");
        String tercih=scan.next().toUpperCase();


        if (tercih.charAt(0)=='E'){
            if (urun>10){
                System.out.println("toplam ucret : "+((urun*fiyat)-(urun*fiyat*0.2)));
            }else if(urun<=10){
                System.out.println("toplam ucret : "+((urun*fiyat)-(urun*fiyat*0.15)));
            }

        }else
            if (tercih.charAt(0)=='H'){
            if (urun>10){
            System.out.println("toplam ucret : "+((urun*fiyat)-(urun*fiyat*0.15)));
        }else if(urun<=10){
            System.out.println("toplam ucret : "+((urun*fiyat)-(urun*fiyat*0.1)));
        }else System.out.println("gecerli bir  tercih giriniz");





        }
    }
}
