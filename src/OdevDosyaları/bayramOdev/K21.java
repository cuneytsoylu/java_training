package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K21 {
    public static void main(String[] args) {

        /*
         * Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini
         * hesaplayin. 45 hiz siniridir. Eger hiziniz 55-74 arasinda ise: Ceza 100
         * $'dir.
         *
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         *
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
         *
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         *
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         *
         * örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         *
         * -----------------------------------------
         *
         * örn;
         *
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * true;
         *
         * sonuc 320 olmalidir.
         *
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * false;
         *
         * sonuc 300 olmalidir.
         */

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aracinizin hizini giriniz");
        int hiz=scan.nextInt();
        System.out.println("ehliyetiniz var mı?\nvarsa true\nyoksa false giriniz");
        boolean ehliyet=scan.nextBoolean();
if (ehliyet==false){
  if (hiz>55 && hiz<=74){
      System.out.println("hiz sinirini astiginiz icin cezanız 100$\nehliyetiniz olmadigindan 200$ da eklenerek\ntoplam 300$ ceza odemelisiniz");
  }else if (hiz>=75&&hiz<=84){
      System.out.println("hiz sinirini astiginiz icin cezanız 150$\nehliyetiniz olmadigindan 200$ da eklenerek\ntoplam 350$ ceza odemelisiniz");
  }else if (hiz>=85&&hiz<=94) {
      System.out.println("hiz sinirini astiginiz icin cezanız 320$\nehliyetiniz olmadigindan 200$ da eklenerek\ntoplam 520$ ceza odemelisiniz");
  }else if (hiz>=94){
      System.out.println("hiz sinirini astiginiz icin cezanız 500$\nehliyetiniz olmadigindan 200$ da eklenerek\ntoplam 700$ ceza odemelisiniz");
  }

}else if (ehliyet==true){
    if (hiz>55 && hiz<=74){
        System.out.println("hiz sinirini astiginiz icin cezanız 100$");
    }else if (hiz>=75&&hiz<=84){
        System.out.println("hiz sinirini astiginiz icin cezanız 150$");
    }else if (hiz>=85&&hiz<=94) {
        System.out.println("hiz sinirini astiginiz icin cezanız 320$");
    }else if (hiz>=94){
        System.out.println("hiz sinirini astiginiz icin cezanız 500$");
    }



}

    }
}
