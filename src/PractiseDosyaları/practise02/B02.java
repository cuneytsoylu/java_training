package PractiseDosyaları.practise02;

import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen Y veya N  harflerinden birini giriniz");
     /*    String y=scan.next();
       if (y.equals("Y")){
            System.out.println("YES");

        }if (y.equals("N")){
            System.out.println("NO");
        }  */



        char ilk=scan.next().charAt(0);
        if (ilk=='y'|| ilk=='Y'){
            System.out.println("YES");}else

            if (ilk=='n'|| ilk=='N'){
                System.out.println("NO");


        }else System.out.println("lutfen gecerli harf giriniz");


    }
}
