package replit;

import java.util.Scanner;

public class ifternary2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String name = scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String surName = scan.next();

        System.out.println("lutfen kart no giriniz");
        String kart = scan.next();

        switch (kart.length()) {
            case 16:
                name = name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\W", "*");
                surName = surName.substring(0, 1).toUpperCase() + surName.substring(1).replaceAll("\\w", "*");
                kart = kart.substring(0, 1).toUpperCase() + kart.substring(1).replaceAll("\\d", "*") + kart.substring(12);

                System.out.println("name : " + name + " " + surName);
                System.out.println();


        }
    }
}