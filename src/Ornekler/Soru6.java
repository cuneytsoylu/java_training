package Ornekler;

import java.util.Arrays;

public class Soru6 {
/*
Soru6:
Olusturdugumuz dizideki istenilen elemanlari seçip
baska bir diziye atan programi yaziniz
 */
public static void main(String[] args) {
int sayac=0;
    int[] arr1={1,5,2,6,4,14,6,13,8,16,5,};

    int[] arr2=new int[4];

    for (int i = 0; i < arr1.length ; i++) {
        if (arr1[i]%2==1){
            arr2[sayac]=arr1[i];
sayac++;
        }
    }
   System.out.println(Arrays.toString(arr2));
}
}
