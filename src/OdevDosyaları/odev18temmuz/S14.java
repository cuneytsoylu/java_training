package OdevDosyaları.odev18temmuz;

public class S14 {
    public static void main(String[] args) {
        /*
         14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.


    Test data:
    1. String : techproed.com
    2. String : Techproed.com

         */

        String str1="techproed.com";
        String str2="Techproed.com";
boolean str3=str1.equalsIgnoreCase(str2);
        System.out.println(str3);
    }
}
