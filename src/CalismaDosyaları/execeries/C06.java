package CalismaDosyaları.execeries;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        /*
 Kullanıcıdan bir sayı tutan ve 1 ile 7 arasında bir tamsayı üreten ve hafta içi adını görüntüleyen bir Java programı yazın.

 Test Verileri
 Giriş numarası: 3
 Beklenen Çıktı :
 Çarşamba
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecersiz numara girdiniz");


        }


    }
}
