package Exception;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");

        int yas=scan.nextInt();


        try {
            kanMerkezi(yas);
        } catch (Exception e) {
            System.out.println("yasin tutmuyor ama saglik degerlerin kan vermek icin uygundur");
        }
    }

    private static void kanMerkezi(int yas) {

        if (yas<18){
            throw new ArithmeticException();
        }else {
            System.out.println("kan bagisi yapabilirsiniz");
        }
    }
}
