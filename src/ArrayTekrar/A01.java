package ArrayTekrar;

import java.util.Arrays;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

       // int [] a={1,2,3,4,5};//index sayacağız

        int [] a= new int[5];
      /*  a[4]=10;
        a[0]=1;

        System.out.println(a[4]);
        System.out.println(Arrays.toString(a));
*/   Scanner scan=new Scanner(System.in);

        for (int i = 0; i <a.length; i++) {

            a[i]=scan.nextInt();


        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
