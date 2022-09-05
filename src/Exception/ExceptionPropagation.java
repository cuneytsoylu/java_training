package Exception;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
           birinciMethod();
        } catch (Exception e) {
            System.out.println("program calisiyor");
        }
    }


    public static void ucuncuMethod(){

        int   a=15/0;

    }

    public static void ikinciMethod(){
        ucuncuMethod();
    }



    private static void birinciMethod() {
        ikinciMethod();
    }
}
