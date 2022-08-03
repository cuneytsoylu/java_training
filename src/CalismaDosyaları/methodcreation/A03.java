package CalismaDosyaları.methodcreation;

public class A03 {
    public static void main(String[] args) {

String str1="Cuneyt";
String str2="Soylu";
istenenFormat(str1,str2);
    }

    public static void istenenFormat(String str1, String str2) {

        str1=str1.toUpperCase().substring(0,1)+str1.substring(1).replaceAll("\\w","*");
        str2=str2.substring(0,1).toUpperCase()+str2.substring(1).replaceAll("\\w","*");
        System.out.println("isminiz ve soyisminiz gizlendi:"+str1+" "+str2);



    }
}
