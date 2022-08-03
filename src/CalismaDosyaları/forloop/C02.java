package CalismaDosyaları.forloop;

public class C02 {
    public static void main(String[] args) {

        String input="amcaoglu";

        tersCevir(input);

    }

    public static void tersCevir(String input) {
String tersInput=" ";

        for (int i =input.length()-1; i>=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }

        System.out.println(tersInput);
    }
}
