package deneme;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static deneme.Yonetici.cikis;

public class Kullanici {
    static Scanner scan=new Scanner(System.in);
    static String yanit="";
    public static void kullanici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String kullanici="\n"+"DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n"+
                "1 : ALEM FM\n"+
                "2 : POWER FM\n"+
                "3 : VIRGIN RADIO\n"+
                "4 : METRO FM\n"+
                "5 : CIKIS";
        System.out.println(kullanici);
        yanit=scan.next();
        switch (yanit){
            case "1":
                alemFm();
                break;
            case "2":
                powerFm();
                break;
            case "3":
               virginRadio();
                break;
            case "4":
               metroFm();
                break;
            case "5":
                cikis();
                break;
        }
    }

    public static void alemFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
File file=new File("src/deneme/Riv-Riv-Riv.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
            "4 : KANAL LISTESI\n"+
                    "5 : CIKIS");
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
                    cikis();
                    break;
                default:{
                    System.out.println("YANLIS SECENEK GIRDINIZ\n" +
                            "TEKRAR TERCIH ETMEK ICIN LUTFEN BEKLEYINIZ...");
               Thread.sleep(4000);


                }
            }
        }
    }
    public static void virginRadio() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/deneme/ezhel.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 :KANAL LISTESI\n"+
                    "5 : CIKIS");
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
                    cikis();
                    break;
                default:{
                    System.out.println("YANLIS SECENEK GIRDINIZ\n" +
                            "TEKRAR TERCIH ETMEK ICIN LUTFEN BEKLEYINIZ...");
                    Thread.sleep(4000);


                }
            }
        }
    }
    public static void powerFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/deneme/PAnda.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 :KANAL LISTESI\n"+
                    "5 : CIKIS");
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
                    cikis();
                    break;
                default:{
                    System.out.println("YANLIS SECENEK GIRDINIZ\n" +
                            "TEKRAR TERCIH ETMEK ICIN LUTFEN BEKLEYINIZ...");
                    Thread.sleep(4000);


                }
            }
        }
    }
    public static void metroFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/deneme/trend.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        while(!yanit.equals("5")){
            System.out.println("1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 :KANAL LISTESI\n"+
                    "5 : CIKIS");
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
                    cikis();
                    break;
                default:{
                    System.out.println("YANLIS SECENEK GIRDINIZ\n" +
                            "TEKRAR TERCIH ETMEK ICIN LUTFEN BEKLEYINIZ...");
                    Thread.sleep(4000);


                }
            }
        }
    }

}
