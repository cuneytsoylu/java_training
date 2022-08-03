package CalismaDosyaları.forloop;

import java.util.Scanner;

public class Codevsoru10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen ikinici sayiyi giriniz");
        int sayi2=scan.nextInt();
int top=0;
if (sayi1<sayi2){
        for (int i=sayi1; i <=sayi2 ; i++) {
            top+=i;
        }
        }else if (sayi2<sayi1){
    for (int i =sayi2; i <=sayi1 ; i++) {
        top+=i;

    }
        }
        System.out.println(top);
    }
}
