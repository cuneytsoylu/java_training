package CalismaDosyaları.calisma;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("gideceginiz yeri seciniz\nkoln yada frankfurt");
        String konum=scan.next();

switch (konum){
    case "koln":
        System.out.println("gideceginiz yer KOLN 20 Euro");
        break;
    case "frankfurt":
        System.out.println("gideceginiz yer FRANKFURT 15 Euro");
    default :
            System.out.println("gecerli yer giriniz");


}

    }
}
