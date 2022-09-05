package Exceptions;

public class A01_TryCatch {
    public static final String S = "\u001B[30m";
    public static final String K = "\u001B[31m";
    public static final String Y = "\u001B[32m";
    public static final String SA = "\u001B[33m";
    public static final String M= "\u001B[34m";
    public static final String MO= "\u001B[35m";
    public static final String TUR= "\u001B[36m";
    public static final String B= "\u001B[37m";
    public static void main(String[] args) {

    /*    int a=30;
        int b=0;

try{ int c=30/0;
    System.out.println(c);
}catch (ArithmeticException abcd){
    System.out.println("sayi 0 a bolunemez");

}
*/

        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
            int b = 15 / 0;
            System.out.println(b);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(TUR+"Arrayin sinirini astiniz");

        } catch (ArithmeticException e) {
            System.out.println("sayi 0 a bolunemez");


        }catch(Throwable e){
            System.out.println("hepsini yaz");
        }
        System.out.println(MO+"buraya kadar calisti");
    }
}