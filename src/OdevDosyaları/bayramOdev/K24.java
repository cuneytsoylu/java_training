package OdevDosyaları.bayramOdev;

import java.util.Scanner;

public class K24 {
    public static void main(String[] args) {
        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kac gun gectigini giriniz");

        String gun="pazartesi";
        int sonra=scan.nextInt();
     sonra%=7;
        switch (sonra) {
            case 0:
                System.out.println("pazartesi");
                break;
                case 1:
                    System.out.println("sali");
                    break;
                    case 2:
                        System.out.println("carsamba");
                        break;
                        case 3:
                            System.out.println("persembe");
                            break;
                            case 4:
                                System.out.println("cuma");
                                break;
                                case 5:
                                    System.out.println("cumartesi");
                                    break;
                                    case 6:
                                        System.out.println("pazar");
                                        break;
            default:
                System.out.println("gecersiz gun");
        }

    }
}
