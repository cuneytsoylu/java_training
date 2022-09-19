package denemeProje;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static denemeProje.YoneticiGiris.yonetici;

public class Ekleme {
  private   String isim;
   private String frekans;

public Ekleme(){

}
    public Ekleme(String isim, String frekans) {
        this.isim = isim;
        this.frekans = frekans;

    }
    public Object silme(String isim) {
        this.isim = isim;


        return null;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }

    @Override
    public String toString() {
        return "Kanal ismi=" + isim +" "+
                "Kanal frekansi=" + frekans;

    }

    public static class KullaniciGiris {
        static Scanner scan=new Scanner(System.in);
      static  String yanit="";

        public static void giris() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {


            String giris = "\n" +
                    "******************************TREN FM******************************\n" +
                    "\n" +
                    "1 : KULLANICI GIRISI ICIN \n" +
                    "2 : YONETICI GIRISI ICIN\n" +
                    "3 : CIKMAK ICIN ";
            System.out.println(giris);

            yanit = scan.next();
            switch (yanit) {
                case "1":
                    kullaniciGiris();
                    break;
                case "2":
                    yonetici();
                    break;
                case "3":
                    System.out.println("TREN FM KEYIFLI GUNLER DILER");
                    break;

                default: {
                    System.out.println("GECERSIZ BIR GIRIS YAPTINIZ");
                    giris();

                }

            }

        }


        public static void kullaniciGiris() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

            String kullanici="DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n"+
                    "1 : POWER TURK FM \n"+
                    "2 : SLOW TURK FM \n"+
                    "3 : VIRGIN RADIO \n"+
                    "4 : METRO FM \n";
            System.out.println(kullanici);
         String yanıt=scan.next();
            switch (yanıt) {
                case "1":
                    powerTurk();
                    break;
                case"2":
                    slowTurk();
                    break;
                    case "3":
                        virginRadio();
                        break;
                        case "4":
                            metroFM();
                            break;
                default:{
                    System.out.println("GECERSIZ BIR RADYO KANALI GIRDINIZ");
                }

            }


        }

        public static void powerTurk() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            File file=new File("src/radyoProjesi/ezhel.wav");
            AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
            Clip clip= AudioSystem.getClip();
            clip.open(audioStream);



            while (!yanit.equals("5")) {

                System.out.println("1 : OYNAT \n"+
                        "2 : DUR \n"+
                        "3 : BASTAN OYNAT\n"+
                        "4 : KANAL LISTESI: \n"+
                        "5 : ANA MENU");

                System.out.println("LUTFEN SECIMINIZI YAPINIZ");
                yanit=scan.next();

                switch (yanit) {
                    case "1":
                        clip.start();
                        break;
                    case "2":
                        clip.stop();
                        break;
                        case "3":
                            clip.setMicrosecondPosition(0);
                            break;
                    case "4":
                        clip.close();
                        kullaniciGiris();
                        break;
                    case "5":
                        clip.close();
                        giris();
                        break;
                    default:{
                        System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                    }
                    Thread.sleep(2000);
                }
            }
        }
        public static void slowTurk() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            File file=new File("src/radyoProjesi/Zeynep Bastık Ara.wav");
            AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
            Clip clip= AudioSystem.getClip();
            clip.open(audioStream);



            while (!yanit.equals("5")) {

                System.out.println("1 : OYNAT \n"+
                        "2 : DUR \n"+
                        "3 : BASTAN OYNAT\n"+
                        "4 : KANAL LISTESI: \n"+
                        "5 : ANA MENU");

                System.out.println("LUTFEN SECIMINIZI YAPINIZ");
                yanit=scan.next();

                switch (yanit) {
                    case "1":
                        clip.start();
                        break;
                    case "2":
                        clip.stop();
                        break;
                    case "3":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "4":
                        clip.close();
                        kullaniciGiris();
                        break;
                    case "5":
                        clip.close();
                        giris();
                        break;
                    default:{
                        System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                    }
                    Thread.sleep(2000);

                }
            }
        }
        public static void virginRadio() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            File file=new File("src/radyoProjesi/PAnda.wav");
            AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
            Clip clip= AudioSystem.getClip();
            clip.open(audioStream);



            while (!yanit.equals("5")) {

                System.out.println("1 : OYNAT \n"+
                        "2 : DUR \n"+
                        "3 : BASTAN OYNAT\n"+
                        "4 : KANAL LISTESI: \n"+
                        "5 : ANA MENU");

                System.out.println("LUTFEN SECIMINIZI YAPINIZ");
                yanit=scan.next();

                switch (yanit) {
                    case "1":
                        clip.start();
                        break;
                    case "2":
                        clip.stop();
                        break;
                    case "3":
                        clip.setMicrosecondPosition(0);
    break;
                    case "4":
                        clip.close();
                        kullaniciGiris();
                        break;
                    case "5":
                        clip.close();
                        giris();
                        break;
                    default:{
                        System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                    }
                    Thread.sleep(2000);
                }
            }
        }

        public static void metroFM() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

            File file=new File("src/radyoProjesi/the moon.wav");
            AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
            Clip clip= AudioSystem.getClip();
            clip.open(audioStream);



            while (!yanit.equals("5")) {

                System.out.println("1 : OYNAT \n"+
                        "2 : DUR \n"+
                        "3 : BASTAN OYNAT\n"+
                        "4 : KANAL LISTESI: \n"+
                        "5 : ANA MENU");

                System.out.println("LUTFEN SECIMINIZI YAPINIZ");
                yanit=scan.next();

                switch (yanit) {
                    case "1":
                        clip.start();
                        break;
                    case "2":
                        clip.stop();
                        break;
                    case "3":
                        clip.setMicrosecondPosition(0);
          break;
                    case "4":
                        clip.close();
                        kullaniciGiris();
                        break;
                    case "5":
                        clip.close();
                        giris();
                        break;
                    default:{
                        System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                    }
                    Thread.sleep(2000);
                }
            }
        }




    }
}
