package PractiseDosyaları.practise03;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen A , B , C karakterlerinden birini giriniz ");
        String harf=scan.next().toUpperCase();

        switch (harf) {
            case "A" :
                System.out.println("java kolaydir");
                break;
                case "B" :
                    System.out.println("java eglencelidir");
                    break;
                    case "C" :
                        System.out.println("ogrenmek zorundayim");
                        break;
            default:
                System.out.println("unknown");
        }


    }
}
