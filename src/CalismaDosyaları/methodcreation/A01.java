package CalismaDosyaları.methodcreation;

public class A01 {

    public static void main(String[] args) {


        String input="Kaya";
        terstenYazdir(input);



    }

    public static void terstenYazdir(String input) {

        input=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("input = " + input);
    }


}
