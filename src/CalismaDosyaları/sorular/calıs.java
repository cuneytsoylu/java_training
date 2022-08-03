package CalismaDosyaları.sorular;

public class calıs {
    public static void main(String[] args) {


String str1="$13.99";
String str2="$10.55";

str1=str1.replace("$","");
str2=str2.replace("$","");

        double d1=Double.parseDouble(str1);
        double d2=Double.parseDouble(str2);

        System.out.println("$"+(d1+d2));



    }
}
