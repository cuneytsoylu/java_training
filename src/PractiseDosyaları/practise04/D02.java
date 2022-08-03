package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.next();
        if ((kelime.length()>=3)) {
            System.out.println(kelime.substring(kelime.length() - 2) +
                    kelime.substring(kelime.length() - 2) + kelime.substring(kelime.length() - 2));


        }else{
            System.out.println("kelime");
        }
    }
}
