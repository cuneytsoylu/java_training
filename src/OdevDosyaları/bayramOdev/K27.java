package OdevDosyaları.bayramOdev;

public class K27 {
    public static void main(String[] args){
    //        1 2 3 4 5 6
    //         2 3 4 5 6
    //          3 4 5 6
    //           4 5 6
    //            5 6
    //             6       şeklini konsola yazdiriniz.

String sayi="123456";
        for (int i = 0; i <sayi.length() ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j =i; j <sayi.length() ; j++) {
                System.out.print(sayi.substring(j, j + 1));
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

            }

        }



