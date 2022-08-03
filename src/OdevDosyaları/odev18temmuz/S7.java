package OdevDosyaları.odev18temmuz;

public class S7 {
    public static void main(String[] args) {
       /*
        Ugly Number:


        Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


        Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
        İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

       Test Data:
        13

        Beklenen çıktı:
        ugly number  degildir

        Test Data:
        25
        Beklenen Çıktı:

        ugly number

*/

/*int sayi=8;
if (sayi%2==0 || sayi%3==0||sayi%5==0||sayi==1){
    System.out.println("girilen sayi ugly sayidir");
}else System.out.println("girilen sayi ugly sayi degildir");


 */

    /*    int imput=19;
        int kontrol=1;
        for (int i = 2; i <imput; i++) {
            if(imput%i==0){
                kontrol=0;
                break;
            }}
        if(kontrol==0){
            System.out.println("asal sayi degildir");
        }else {
            System.out.println("asal sayidir");

        }

     */
       /* Scanner scan  = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        */
int sayi=12;
        while (sayi>1) {
            if (sayi%2==0) {
                sayi/=2;
            } else if (sayi%3==0) {
                sayi/=3;
            } else if (sayi%5==0) {
                sayi/=5;
            } else {
                System.out.println("Ugly number degildir");
                break;
            }
        }
        if (sayi==1){
            System.out.println("Ugly number");
        }


        /*
        hcmbu koda gore 2 yada 3 yada 5 e bolunen her sayi ugly gibi oluyor fakat 12 den buyuk ugly sayilari dusunursek  21  yada 14 mesela 21 3 e  ,14 2 yebolundugu icin ugly gibi olur koda gore fakat 21 in 7 carpani oldugu icin ugly degildir yada 2,3,ve 5 disindaki asal sayilar(7,11,13,17,19……..gibi)carpani olan her sayi ugly degildir
1:15
o yuzden size attigim kodda asal sayilari bulup ordan gideyim dedim fakat devamini getiremedim
         */

    }
}
