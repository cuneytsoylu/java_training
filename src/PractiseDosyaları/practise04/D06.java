package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D06 {
    public static void main(String[] args) {


Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.next();
        char ortanca=kelime.charAt((kelime.length()-1)/2);
       if (kelime.length()%2==0) {
           System.out.println("kelimeniz tek sayida karaktere sahip degil");
           // }else System.out.println(kelime.toUpperCase().substring(kelime.length()/2,kelime.length()/2+1));
       }else System.out.println(ortanca);

    }
}
