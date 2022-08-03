package OdevDosyaları.odev18temmuz;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {

/*
12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kucuk harflerle bir cumle giriniz");
        String cumle=scan.nextLine();

        String sonuc=cumle.toUpperCase();
        System.out.println(sonuc);

    }
}
