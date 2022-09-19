package proje;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static proje.Kanallar.frekans;
import static proje.Kanallar.isim;
import static proje.Kullanici.kullanici;

public class Yonetici {
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLUE = "\u001B[34m";
   public static final String ANSI_PURPLE = "\u001B[35m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_WHITE = "\u001B[37m";

  static ArrayList<Kanallar> kanalList=new ArrayList<Kanallar>();
   static Scanner scan = new Scanner(System.in);
   static String yanit="";
   public static void giris() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
      String giris="\n"+ANSI_GREEN+"***********************TREN FM***********************\n"+
              "\n"+
              ANSI_PURPLE+ "1 : KULLANICI GIRISI\n"+
              ANSI_BLACK+"2 : YONETICI GIRISI\n"+
              ANSI_RED+ "3 : CIKIS";

      System.out.println(giris);
      yanit=scan.next();

      switch (yanit) {
         case "1":
            kullanici();
            break;
         case "2":
            yonetici();


      }

   }

   private static void yonetici() throws InterruptedException {
      String yonetici="\n"+
              "1 : KANAL EKLE\n"+
              "2 : KANAL SIL\n"+
              "3 : KANAL LISTESI\n"+
              "4 : ANA SAYFA\n"+
              "5 : CIKIS";
      System.out.println(yonetici);
      yanit=scan.next();
      switch (yanit){
         case "1":
            kanalEkle();
            devamMi();
            yonetici();
            break;
          case "3":
              kanalListesiGoster();
              yonetici();
              break;
      }
   }

    private static void kanalListesiGoster() throws InterruptedException {
        for (Kanallar each:kanalList
             ) {
            System.out.println(each);

        }

    }

    public static void kanalEkle() {
      yanit=scan.nextLine();
      System.out.println("EKLEMEK ISTEDIGINIZ KANALIN ISMINI YAZINIZ");
      String isim=scan.nextLine();
      System.out.println("EKLEMEK ISTEDIGINIZ KANALIN FREKANSINI YAZINIZ");
      String frekans=scan.next();
        System.out.println(kanalList);
      Kanallar kanalekle=new Kanallar(isim,frekans);
      kanalList.add(kanalekle);

   }

   public static boolean devamMi(){
      boolean devamMi=false;
      System.out.println("YENI KANAL EKLEMEK ISTERMISINIZ\n" +
              "EVET YA DA HAYIR GIRINIZ");
      String cevap=scan.next();


      while (cevap.equalsIgnoreCase("EVET")){
         kanalEkle();
         System.out.println("YENI KANAL EKLEMEK ISTERMISINIZ\n" +
                 "EVET YA DA HAYIR GIRINIZ");
          cevap=scan.next();
      }

      return devamMi;
   }

}
