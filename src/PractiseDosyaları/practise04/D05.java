package PractiseDosyaları.practise04;

import java.util.Scanner;

public class D05 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci kelimeyi giriniz");
        String name1=scan.next();
        System.out.println("ikinci kelimeyi giriniz");
        String name2=scan.next();

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2, name1.length()));
        }else System.out.println("birinci kelime cift sayili olmadigi icin ortasina yerlestiremedik");



    }
}
