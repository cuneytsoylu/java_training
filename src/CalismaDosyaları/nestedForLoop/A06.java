package CalismaDosyalarÄ±.nestedForLoop;

public class A06 {
    public static void main(String[] args) {
        String str="deniz";

        for (int i =1; i <=str.length() ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(str.substring(j-1,j));

            }
            System.out.println(" ");

        }
        for (int i =str.length()-1; i >= 1; i--)  {
            for (int j =i; j >=1; j--) {
                System.out.print(str.substring(j-1,j));

            }
            System.out.println(" ");

        }
    }
}
