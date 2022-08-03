package PractiseDosyaları.practise03;

public class C06 {
    public static void main(String[] args) {


     char not='A';

     // if ile kodlama
  /*   if (not=='A'){
         System.out.println("gayet basarili");
     }else if (not=='B'){
         System.out.println("basarili");
     }else if (not=='C'){
         System.out.println("ha gayret");
     }else System.out.println("digerleri");
   */


        //ternary ile kodlama
        System.out.println(not=='A'?"gayet basarili":not=='B'?" basisarili":not=='C'?" basisarili":"digerleri");

    }
}
