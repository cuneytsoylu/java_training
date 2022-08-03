package ArrayOrnekler;

import java.util.Arrays;
import java.util.Random;

public class eksiksayiyibulma {
    public static void main(String[] args) {

        int[] input1 = {1,2,3,4,5,6,7,8,9,10};
        int[] eksik = new int[1];

        Random rnd = new Random();
        int[] input = new int[9];
        for (int i = 0; i < input.length; i++)
            for (int j = 0; j <input1.length ; j++) {
                if (input1[j]!=input[i]){
                    input[i] = rnd.nextInt(10);
                }
            }





        System.out.println(Arrays.toString(input));
    }

          /*  for (int j = 0; j< input.length; j++) {
                if (Arrays.binarySearch(input, input1[j]) < 0) {

                    eksik[0] = input1[j];
                }
            }
            System.out.println(Arrays.toString(eksik));

           */


        }
