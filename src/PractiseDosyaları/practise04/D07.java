package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println(isim);
        }else System.out.println(soyisim);

    }
}
