package CalismaDosyaları.execeries;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {

        /*
İkinci dereceden denklemleri çözmek için bir Java programı yazın (if, else if ve else kullanın).

Test Verileri
Giriş a: 1
Giriş b: 5
Giriş c: 1
Beklenen Çıktı :
Kökler -0.20871215252208009 ve -4.7912878474779195'tir
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("a sayisini giriniz");
        double a=scan.nextDouble();
        System.out.println("b sayisini giriniz");
        double b=scan.nextDouble();
        System.out.println("c sayisini giriniz");
        double c=scan.nextDouble();

        double diskriminant=(b*b)-4*a*c;


    }
}
