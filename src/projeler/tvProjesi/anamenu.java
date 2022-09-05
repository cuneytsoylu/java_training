package projeler.tvProjesi;

import java.util.Scanner;

public class anamenu {
  static Scanner scan=new Scanner(System.in);// 3.adim kullanicidan almak icin scanner olusturduk static yaparak heryerden ulasilsin istedim
static Televizyon tv;
    public static void main(String[] args) throws InterruptedException {


        menuGoster();// 1.adım menuGoster methodu olusturup create ettik
        boolean cikis=false; // 4.adim  kullanıcı 0 a basana kadar menunun surekli gosterilmesini istiyorum

        while(cikis==false) {
            System.out.println("Seciminiz : (Menuyu gormek icin 8 i tuslayiniz)");
            int secim=scan.nextInt();
            switch (secim) {
                case 1:
                    tvKurveKanallariOlustur();
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden cikiliyor.......");
                    Thread.sleep(2000);
                    cikis=true; // cikis degerini true yaparak bir daha buraya girmemesini sagladim
                    break;
                default:
                    System.out.println("0 ile 8 arasinda bir deger giriniz");
                    break;
            }
        }
    }

    private static void tvKurveKanallariOlustur() {


if(tv==null){
    System.out.println("Televizyonun markasini giriniz");
    scan.nextLine();
    String marka=scan.nextLine();
    System.out.println("Tv nin kac inc oldugunu giriniz");
    String inc= scan.next();
    tv=new Televizyon(marka,inc);
    System.out.println(tv);
}else{
    System.out.println(tv);
}

    }

    private static void menuGoster() { // 2.adim menumuzde hangi secenekler oldugunu yazıyoruz

        System.out.println("******************* M E N U *******************");
        System.out.println("0 -- Cikis\n"+
                "1 --- Televizyonu Kur\n"+
                "2 ---Televizyonu Ac\n"+
                "3 ---Sesini Ac\n"+
                "4 ---Sesi Kapat\n"+
                "5 ---Kanal Degistir\n"+
                "6 ---Kanal Bilgisini Goster\n"+
                "7 ---Televizyonu KApat\n"+
                "8 ---Menuyu Goster\n");


    }
}
