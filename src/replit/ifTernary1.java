package replit;

import java.util.Scanner;

public class ifTernary1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double weight=scan.nextDouble();
        System.out.println("lutfen boyunuzu m cinsinden giriniz");
        double height=scan.nextDouble();
        double bmi=weight/(height*height);

       /*  bmi < 18.5 ? " your bmi is :" + bmi + " your re weak" : (bmi >= 18.5 && bmi < 25) ?
                " your bmi is :" + bmi + " your weight is ideal" :
                (bmi >= 25 && bmi < 30) ? " your bmi is :" + bmi + " your re fat" :
                        "your bmi is :" + bmi + " your re obese";

        */


    }
}
