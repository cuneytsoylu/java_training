package proje;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static proje.Yonetici.giris;

public class Kullanici {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner scan = new Scanner(System.in);
    static String yanit="";
    public static void kullanici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String kullanici="\n"+ANSI_RED+"DINLEMEK ISTEDIGINIZ KANALI SECINIZ"+
                "\n"+
                ANSI_GREEN+"1 : POWER FM\n"+
                ANSI_YELLOW+ "2 : SLOW TURK\n"+
                ANSI_BLUE + "3 : VIRGIN RADIO\n"+
                ANSI_PURPLE+"4 : METRO FM\n"+
                ANSI_CYAN+"5 : CIKIS";
        System.out.println(kullanici);
        yanit=scan.next();

        switch (yanit) {
            case "1":
powerFm();
break;
case "2":
    slowTurk();
    break;
    case "3":
        virginRadio();
        break;
            case"4":
                metroFm();
                break;
            case "5":
                cikis();
break;
            default:{
                System.out.println("HATALI BIR YANIT GIRDINIZ\nLUTFEN TEKRAR DENEYINIZ");
    kullanici();
    break;
}
        }

    }

    private static void cikis() {
        System.out.println("TREN FM KEYIFLI GUNLER DILER");
    }

    public static void powerFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/proje/ezhel.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT\n"+
                    "2 : DUR\n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "5 : ANA MENU");

            yanit=scan.next();

            switch (yanit){
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
                    clip.stop();
                    kullanici();
                    break;
                case "5":
                    clip.stop();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BİR YANIT GIRDINIZ\n" +
                            "TEKRAR SECIM YAPINIZ");
                }
                Thread.sleep(4000);
            }

        }
    }

    public static void slowTurk() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/proje/Zeynep Bastık Ara.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT\n"+
                    "2 : DUR\n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "5 : ANA MENU");

            yanit=scan.next();

            switch (yanit){
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
                    clip.stop();
                    kullanici();
                    break;
                case "5":
                    clip.stop();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BİR YANIT GIRDINIZ\n" +
                            "TEKRAR SECIM YAPINIZ");
                }
                Thread.sleep(4000);
            }

        }
    }

    public static void virginRadio() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/proje/PAnda.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT\n"+
                    "2 : DUR\n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "5 : ANA MENU");

            yanit=scan.next();

            switch (yanit){
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
                    clip.stop();
                    kullanici();
                    break;
                case "5":
                    clip.stop();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BİR YANIT GIRDINIZ\n" +
                            "TEKRAR SECIM YAPINIZ");
                }
                Thread.sleep(4000);
            }

        }
    }
    public static void metroFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/proje/the moon.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT\n"+
                    "2 : DUR\n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "5 : ANA MENU");

            yanit=scan.next();

            switch (yanit){
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
                    clip.stop();
                    kullanici();
                    break;
                case "5":
                    clip.stop();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BİR YANIT GIRDINIZ\n" +
                            "TEKRAR SECIM YAPINIZ");
                }
                Thread.sleep(4000);
            }

        }
    }


}
