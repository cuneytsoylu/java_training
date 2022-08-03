package CalismaDosyaları.forloop;

import java.util.Scanner;

public class CodevSoru8 {
    public static void main(String[] args) {


        terscevir();



    }

    private static String terscevir() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ters cevirilecek kelimeyi giriniz");
        String isim=scan.nextLine();
        String ters="";
        for (int i =isim.length()-1; i>=0 ; i--) {
            ters+=isim.substring(i,i+1);

        }
        System.out.println(ters+" ");

        return isim;
    }
}
