package CalismaDosyaları.whileLoop;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        int temp=0;
        int sayac=0;
        while (temp<500){
            System.out.println("lutfen toplama eklenmek uzere bir sayi giriniz");
            int sayi=scan.nextInt();
            temp+=sayi;
sayac++;

        }System.out.println("girdiginiz sayilarin toplami : "+temp);
        System.out.println("toplamda : "+ sayac +" adet sayi girdiniz");

    }
}
