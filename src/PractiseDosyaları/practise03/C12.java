package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ilk kelimeyi giriniz");
        String ilkkelime=scan.next();
        System.out.println("lutfen ikinci kelimeyi giriniz");
        String ikincikelime=scan.next();
        String istenen=ilkkelime.concat(ikincikelime);
        System.out.println(istenen);
 String birlestir1=ilkkelime.substring(1);
String birlestir2=ikincikelime.substring(1);
String son=birlestir1.concat(birlestir2);
        System.out.println(son);
    }
}
