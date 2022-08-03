package CalismaDosyaları.doWhileLoop;

import java.util.Scanner;

public class CodevSoru4 {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
int sayi;
int pozSayiTop=0;
int pozSayiAdedi=0;
int negSayiAdedi=0;

do {
    System.out.println("lutfen pozitif bir sayi giriniz");
sayi=scan.nextInt();
if (sayi<0){
    System.out.println("negatif sayi giremezsiniz");


negSayiAdedi++;

}else if (sayi>0){
    pozSayiTop+=sayi;
   pozSayiAdedi++;
}else if (sayi==0){

    System.out.println("girdiginiz pozitif sayilarin toplami : "+pozSayiTop);
    System.out.println("girdiginiz negatif sayıların adedi : "+ negSayiAdedi);
    System.out.println("girdiginiz pozitif sayilarin adedi : "+pozSayiAdedi );
}



}while (sayi!=0);



    }
}
