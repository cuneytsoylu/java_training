package CalismaDosyaları.execeries;

public class C5_ {
    public static void main(String[] args) {


        /*
Kayan noktalı bir sayı okuyan ve sayı sıfır ise "sıfır" yazan bir Java programı yazın.
Aksi takdirde, "pozitif" veya "negatif" yazdırın. Sayının mutlak değeri 1'den küçükse "küçük"
veya 1.000.000'u aşarsa "büyük" ekleyin.

Test Verileri
Bir sayı girin: 25
Beklenen Çıktı :
Giriş değeri: 25
Pozitif sayı
 */


        double sayi = -0.5;
       if (sayi >0){

           if (sayi<1){
               System.out.println("pozitif  1 den kucuk sayi");
           }else if (sayi>1000000){
               System.out.println("buyuk");
           }else System.out.println("pozitif");

       }else if (sayi < 0){
           if (sayi*-1<1){
               System.out.println("0 ile -1 arasindaki negatif sayılar");
           }else if(sayi*-1>1000000){
               System.out.println("negatif buyuk sayi");
           }else System.out.println("negatiftir");

       }else System.out.println("zero");
    }

}

