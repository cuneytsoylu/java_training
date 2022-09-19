package denemeProje;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static denemeProje.Ekleme.KullaniciGiris.giris;

public class YoneticiGiris  {
    static Scanner scan = new Scanner(System.in);
    static String cevap = "";
    static ArrayList<Ekleme> kanalListesi = new ArrayList<>();



    public static void yonetici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String yonetici = "1 : KANAL EKLEME \n" +
                "2 : KANAL SILME\n" +
                "3 : KANAL LISTESI\n" +
                "4 : ANA SAYFA\n" +
                "5 : CIKIS ";

        System.out.println(yonetici);
        cevap = scan.next();
        switch (cevap) {
            case "1":
                kanalEkleme();
                devamMi();
                 break;
            case "2":
              kanalSil();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                System.out.println();
                Thread.sleep(3000);
              yonetici();
                    break;
            case "3":
kanalListesiGoster();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                System.out.println();
Thread.sleep(4000);
yonetici();
break;
            case "4":
                giris();
                break;
            case "5": {
                System.out.println("TREN FM KEYIFLI GUNLER DILER");
                break;
            }


            default: {
                System.out.println("GECERSİZ BİR DEGER GİRDİNİZ\nTEKRAR GIRMEK ICIN LUTFEN HERHANGI BIR TUSA BASIN");
                 scan.next();
            yonetici();
        }

    }}

    private static void kanalListesiGoster() {
        for (Ekleme each:kanalListesi
             ) {
            System.out.println(each);

        }

    }

    private static void kanalSil() {
        if (kanalListesi.isEmpty()) {
            System.out.println("SILINECEK KANAL YOKTUR");
            System.out.println();
        }else {
            System.out.println("SILINECEK KANALLARIN LISTESI");
            System.out.println(kanalListesi);

         //   System.out.println("DEVAM...");

            System.out.println("SILINECEK KANALIN ISMINI GIRINIZ");

            String sil=scan.next();


            Ekleme kanalSil = new Ekleme();
            kanalSil.silme(sil);
            kanalListesi.remove(kanalListesi.indexOf(kanalSil.silme(sil))+1);

         }



    }

    private static void kanalEkleme() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
       // System.out.println("YENI KANAL EKLEMEK İSTER MISIN\nEKLEMEK ICIN : true\nCIKMAK ICIN : false");
        cevap = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN ADINI GIRINIZ");
        String isim = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN FREKANSINI GIRINIZ");
        String frekans = scan.nextLine();
        Ekleme kanalEkle = new Ekleme(isim, frekans);
        System.out.println(kanalEkle);
        kanalListesi.add(kanalEkle);
        devamMi();

    }
public static void devamMi() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

    System.out.println("YENI KANAL EKLEMEK İSTER MISIN\nEKLEMEK ICIN : Yes\nCIKMAK ICIN : No");
       String devamMi=scan.next();

        if (devamMi.equalsIgnoreCase("yes")){

            kanalEkleme();
        }else {
            yonetici();
        }
}

    }
