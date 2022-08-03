package CalismaDosyaları.methodcreation;

public class A04 {
    public static void main(String[] args) {

        String str1="Cuneyt";
        String str2="Soylu";
       String gizliIsim= istenenFormat(str1,str2);
        System.out.println("isminiz ve soyisminiz gizlendi:"+gizliIsim);
    }

    private static String istenenFormat(String str1, String str2) {

        str1=str1.toUpperCase().substring(0,1)+str1.substring(1).replaceAll("\\w","*");
        str2=str2.substring(0,1).toUpperCase()+str2.substring(1).replaceAll("\\w","*");


        return str1+" "+str2;
    }
}
