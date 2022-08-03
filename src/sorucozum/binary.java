package sorucozum;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        int uzunluk = 0, kalan = 0;
        int[] toplam = new int[20];
        Scanner scan= new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz: ");
        int binary1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int binary2 = scan.nextInt();
        while (binary1 != 0 || binary2 != 0)
        {
            toplam[uzunluk++] = ((binary1 % 10 + binary2 % 10 + kalan) % 2);
            kalan = ((binary1 % 10 + binary2 % 10 + kalan) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (kalan != 0) {
            toplam[uzunluk++] = kalan;
        }
        --uzunluk;
        System.out.print("verilen binary sayilarin toplami: ");
        while (uzunluk>= 0) {
            System.out.print(toplam[uzunluk--]);
        }
        System.out.print(" ");
    }
    }

