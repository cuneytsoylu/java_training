package CalismaDosyaları.forloop;

import java.util.Scanner;

public class CodevSoru7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tersini yazdirmak istediginiz kelimeyi giriniz");
        String isim= scan.next();
String ters=" ";
        for (int i =isim.length()-1; i>=0 ; i--) {
            ters+=isim.substring(i,i+1);


        }    System.out.print(ters);
    }
}
