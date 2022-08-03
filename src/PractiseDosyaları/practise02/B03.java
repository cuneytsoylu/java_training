package PractiseDosyaları.practise02;



import java.util.Scanner;

public class B03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir not giriniz");
        int not=scan.nextInt();
 if (not>=90 && not<=100){
     System.out.println("A");
 }else if (not<=89 && not>=80){
     System.out.println("B");
 }else if (not<=79 && not>=70){
     System.out.println("C");
 }else if (not<=69 && not>=60){
     System.out.println("D");
 }else if (not<=59 && not>=0){
     System.out.println("F");
 }else System.out.println("lutfen gecerli bir aralık giriniz");










    }
}
