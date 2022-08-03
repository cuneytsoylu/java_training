package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K23swictholmadi {
    public static void main(String[] args) {


        // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   2. 50(dahil) ile 60 arası - C   3. 60(dahil) ile 80 arası - B
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.

        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not >= 0 && not < 50) {

            System.out.println("notunuz : D");
        } else if (not >= 50 && not < 60) {
            System.out.println("notunuz : C");
        } else if (not >= 60 && not < 80) {
            System.out.println("notunuz : B");
        } else if (not >= 80 && not <= 100) {
            System.out.println("notunuz : A");
        } else System.out.println("gecersiz not girdiniz");


    }


    }
