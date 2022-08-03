package OdevDosyaları.odev18temmuz;

public class S18 {
    public static void main(String[] args) {

      /*  Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Test Data:
        java is fun

        Beklenen Çıktı:

        Stringdeki sesli harf sayısı: 4


       */

        String sesliHarf= "aeiou";
        String input =("Oguzu cihAd").toLowerCase();


        sesliHarfSay(input,sesliHarf);


    }

    private static void sesliHarfSay(String input, String sesliHarf) {

        int count=0;
        for (int i = 0; i <input.length() ; i++) {
            if(sesliHarf.contains(input.substring(i,i+1))){
                count++;
            }

        }
        System.out.println("String deki sesli harf sayisi : " + count);
    }
}
