package OdevDosyaları.odev18temmuz;

public class S8 {
    public static void main(String[] args) {

        /*
          8----
     Girilen String değerde tersten yazan Java kodunu yazınız.
    Test Data:
    java
    avaj
         */
String input="kac";
String  output="";
        for (int i = input.length()-1; i >= 0; i--) {
            output+=input.charAt(i);
        }
        System.out.println("girilen kelimenin tersi : \n"+output);
    }
}
