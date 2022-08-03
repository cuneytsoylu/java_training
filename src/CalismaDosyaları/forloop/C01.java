package CalismaDosyaları.forloop;



public class C01 {
    public static void main(String[] args) {
int toplam=0;
        for (int i =1; i <500 ; i++) {
            if (i%7==0){
                toplam+=i;
            }

        }
        System.out.println("1 den 500 e kadar 7 ye bolunebilen sayıların toplami :"+toplam);
    }
}