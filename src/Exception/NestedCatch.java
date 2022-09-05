package Exception;

public class NestedCatch {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};

        try {
            int b=30/0;


           System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("array in sinirini asmayiniz");
        }
        catch (Exception e){
            System.out.println("kodun calisir vaziyette");
        }


    }
}
