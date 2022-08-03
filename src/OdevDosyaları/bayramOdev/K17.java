package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K17 {
    public static void main(String[] args) {


        /*
         * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
         * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
         * durumunu da kontrol edniz
         *
         * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         * herhangi iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c
         * b+c>a>b-c a=b=c ise es kenar ucgen
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin birinci kenarini giriniz");
        int a=scan.nextInt();
        System.out.println("lutfen ucgenin ikinci kenarini giriniz");
        int b=scan.nextInt();
        System.out.println("lutfen ucgenin ucuncu kenarini giriniz");
        int c=scan.nextInt();

        if(a==b && b==c){
            System.out.println("girilen sayilar bir eskanar ucgen belirtir");


        }else if ((a+b>c && c>a-b) && (a+c>b && b>a-c) && (b+c>a && a>b-c) ){
            System.out.println("girilen sayilar bir ucgen belirtir");
        }else{
            System.out.println("girilen sayilar bir ucgen belirtmez");
        }
    }
}
