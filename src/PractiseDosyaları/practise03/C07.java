package PractiseDosyaları.practise03;

public class C07 {
    public static void main(String[] args) {

        String gun="pazartesi";

        switch (gun){
            case "pazartesi" :
            case "sali":
                System.out.println("Java dersi gunleri");
                break;
                case "persembe" :
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                    break;
            default :
                        System.out.println("izin gunu");


        }



    }
}
