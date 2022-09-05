package ArrayTekrar;

import java.util.Arrays;
import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {

        String [] esya={"tahta","sıra","masa","kalem"};
        Scanner scan= new Scanner(System.in);
        System.out.println("yeni esya giriniz");
        String esya1=scan.next();

     String [] esya2 =new String[esya.length+1];
        for (int i = 0; i <esya.length ; i++) {
            esya2[i]=esya[i];
        }
        esya2[esya2.length-1]= esya1;
        System.out.println(Arrays.toString(esya2));








    }
}
