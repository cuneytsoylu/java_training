package Exceptions;

public class A05_FinallyBloklari {
    public static void main(String[] args) {
        /*
        finaly bloklari try catch yapilarinda exception olussada olusmasada
        mutlaka calisiyor..mesela bir dosya kapama bir veri tabanı baglantısını kesme gibi
        islemlerimiz bizim arka planlarda islemlerimizin aksamaması icin kullanıyoruz

         */
    /*    try {
          //  String s=null;
            String s="cuneyt";
            System.out.println(s.hashCode());
        }catch(NullPointerException e){
            System.out.println("null reference hatası....");
        }finally {
            System.out.println("Finally blogu calisiyor...");
        }
        System.out.println("program devam mı");

     */
        int b; //yorumlar karısmasın diye rastgele yazılıp aradakı baglantı kesildi
/*
12.satiri aktif edip 13.satiri pasif hale getirip run edersek hem 15  hemde 17.satir calisacak
fakat 13.satiri aktif edip 12.satiri pasif bırakırsak 15.satir calismayıp sadece 17.satır calısacak
 */

     /*   try {
            int a=13/0;
        }catch(NullPointerException e){
            System.out.println("null reference hatası....");
        }finally {
            System.out.println("Finally blogu calisiyor...");

        }System.out.println("program devam mı");
        /*
        seklinde bir int yazıp catch kısmına da ArithmeticException yazmasak bile finaly calısır ve sonra bize
        ArithmeticException oldugunu söyler...ve finally blogundan sonra birsey calıstırmaz
         */

        try {
            int a = 13 / 0;
        }catch (ArithmeticException e){
            System.out.println("bir sayi sifira bolunemez");
        }catch(NullPointerException e){
            System.out.println("null reference hatası....");
        }finally {
            System.out.println("Finally blogu calisiyor...");

        }System.out.println("program devam mı");
        /*
        ama eger catch den sonra int a uygun bir ArithmeticException yazarsak program calısmaya devam eder

         */



    }
}
