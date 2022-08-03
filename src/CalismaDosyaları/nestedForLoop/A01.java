package CalismaDosyaları.nestedForLoop;

public class A01 {
    public static void main(String[] args) {

        String input="Java her zaman guzel";


        tekrarsizyap(input);




    }

    public static void tekrarsizyap(String input) {

String atanacakKelime=" ";

String bosluksuzKelime=input.replaceAll("\\W","");
        System.out.print(bosluksuzKelime.substring(0,1));
atanacakKelime+=bosluksuzKelime.substring(0,1);


        for (int i =1; i <bosluksuzKelime.length() ; i++) {

            if (!atanacakKelime.contains(bosluksuzKelime.substring(i,i+1))){
                System.out.print(","+ bosluksuzKelime.substring(i,i+1));
                atanacakKelime+=bosluksuzKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("ilk kelimemiz: "+input);
        System.out.println("tekrarsız harflerimiz: "+atanacakKelime);
        System.out.println("benzersiz harf sayısı :"+atanacakKelime.length());




        }




    }
