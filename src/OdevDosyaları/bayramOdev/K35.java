package OdevDosyaları.bayramOdev;

public class K35 {
    public static void main(String[] args) {
        /*
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.
            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16
            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25
            Example 3:
            Input: 14
            Output: false
         */


            int input=16;
            int sayac=0;
            for (int i = 0; i <=input ; i++) {
                if(input==i*i){
                    sayac++;}
            }if(sayac==1) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }

