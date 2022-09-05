package Exceptions;

public class A04_exceptionsPropagation {
    public static void main(String[] args) {
       birinciMethod();
    }


    public static void ucuncuMethod(){

        int a=12/0;
    }
    public static void ikinciMethod(){

        try {
            ucuncuMethod();
        } catch (Exception e) {
            System.out.println("calisiyor sorun yok");
        }

    } public static void birinciMethod(){
        ikinciMethod();

    }

}
