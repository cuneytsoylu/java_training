package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D03 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci kelimeyi giriniz");
        String kelime1=scan.next();
        System.out.println("lutfen ikinci kelimeyi giriniz");
        String kelime2=scan.next();
        System.out.println("lutfen ucuncu kelimeyi giriniz");
        String kelime3=scan.next();
        System.out.println("lutfen dorduncu kelimeyi giriniz");
        String kelime4=scan.next();
         String son=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "+kelime2+" "+kelime3+" "+kelime4+".";
         String istenen=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1).concat(" "+kelime2.concat(" "+kelime3.concat(" "+kelime4+".")));

        System.out.println(son);
        System.out.println(istenen);

    }
}
