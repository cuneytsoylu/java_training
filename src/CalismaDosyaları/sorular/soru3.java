package CalismaDosyaları.sorular;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");

        String isim=scan.nextLine();
        if (isim.contains("a")&& isim.contains("Z")){
            System.out.println("sadece birini girin");
        }else if (isim.contains("a")){
            System.out.println("a var");
        }else if (isim.contains("Z")){
            System.out.println("Z var");
        }else {
            System.out.println("ne a var ne Z var");
        }




    }
}
