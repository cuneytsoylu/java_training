package PractiseDosyaları.practise04;

public class D01 {
    public static void main(String[] args) {

String str1="$13.99";
String str2="$15.55";

str1=str1.replace("$","");
str2=str2.replace("$","");

 double son=Double.parseDouble(str1);
 double son2=Double.parseDouble(str2);
double sonuc=son+son2;
        System.out.println(sonuc);


    }
}
