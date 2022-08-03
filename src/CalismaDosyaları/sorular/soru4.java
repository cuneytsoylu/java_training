package CalismaDosyaları.sorular;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soy isim giriniz");
        String isim=scan.nextLine();
        String soyIsim=scan.nextLine();

        if (isim.length()<soyIsim.length()){
            System.out.println(soyIsim);
        }else System.out.println(isim);







    }
}
