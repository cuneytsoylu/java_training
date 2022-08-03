package CalismaDosyaları.sorular;

public class soru2 {
    public static void main(String[] args) {


        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replace("$","");
        str2=str2.replace("$","");

        Double sonuc1=Double.parseDouble(str1);
        Double sonuc2=Double.parseDouble(str2);

        System.out.println(sonuc1+sonuc2);

    }
}
