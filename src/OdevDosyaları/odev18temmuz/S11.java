package OdevDosyaları.odev18temmuz;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
/*

 11----
    Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
String kelime=scan.next();

String yazdir=kelime.substring(0,kelime.length()-1);

        System.out.println(yazdir);

    }
}
