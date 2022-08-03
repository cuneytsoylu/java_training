package CalismaDosyaları.methodcreation;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {

        String sehir=sehirAl();
        String tarih=tarihAl();



        System.out.println("dogum tarihiniz: "+tarih);
        System.out.println("dogum yeriniz : "+ sehir);
    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dogum yilinizi giriniz");
        int yil=scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih=tarih+yil+"-";

        }else {System.out.println("lutfen belirtilen aralıkta yil giriniz(1900-2100)");}
        System.out.println("lutfen ay giriniz");
        int ay=scan.nextInt();
if (ay>12 || ay<=0){
    System.out.println("lutfen belirtilen aralikta ay giriniz(1-12)");
}else if (ay>0 && ay<10){
    tarih=tarih+"0"+ay+"-";
}else tarih=tarih+ay+"-";
        System.out.println("lutfen gun giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("lutfen 1-31 arasinda gun giriniz");
        }else if (gun>0 && gun<10){
            tarih=tarih+"0"+gun;
        }else tarih=tarih+gun;

        return tarih;
    }

    public static String sehirAl() {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen dogum yerinizi giriniz");
        String sehiradi=scan.next();
        sehiradi=sehiradi.toUpperCase();

        return sehiradi;
    }
}
