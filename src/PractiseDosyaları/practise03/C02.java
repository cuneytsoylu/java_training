package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("bir iscinin isi bitirme suresi: ");
        double isci=scan.nextDouble();
        System.out.print(" calisacak isci sayisini giriniz: ");
        double calisacak=scan.nextDouble();
        double sure=isci/calisacak;
        System.out.print("isin bitme suresi: "+sure+ " gundur");

    }
}
