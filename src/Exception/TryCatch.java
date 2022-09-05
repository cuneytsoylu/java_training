package Exception;

public class TryCatch {
    public static final String S = "\u001B[30m";
    public static final String K = "\u001B[31m";
    public static final String Y = "\u001B[32m";
    public static final String SA = "\u001B[33m";
    public static final String M= "\u001B[34m";
    public static final String MO= "\u001B[35m";
    public static final String TUR= "\u001B[36m";
    public static final String B= "\u001B[37m";

    public static void main(String[] args) {
      /*   int a=0;
        int b=0;
       try {
            a=30;
            b=0;
            System.out.println(a/b);
        }catch(ArithmeticException e){

            System.out.println("bir sayi 0 a bolunemez");
        }

        System.out.println("burasi calisiyor..");
*/
        int [] a={1,2,3,4,5};

       try {
           System.out.println(a[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(SA+"array in sinirini asmayiniz");
        }
        System.out.println(MO+"kodun calisir vaziyette");

    }
}
