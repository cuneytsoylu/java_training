package OdevDosyaları.odev18temmuz;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
/*
        10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cümle giriniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen aratmak istediginiz kelimeyi giriniz");
        String kelime=scan.nextLine();

        boolean sonuc=true;

        if (cumle.contains(kelime)){
            System.out.println(sonuc);
        }else System.out.println(!sonuc);

    }
}
