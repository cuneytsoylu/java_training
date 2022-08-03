package CalismaDosyaları.forloop;

public class C06 {
    public static void main(String[] args) {

int input=12;
int top=0;
for (int i=1; i<=input; i++){

 if (input%i==0){
     System.out.print(i+" ");
     top+=i;
 }

}
        System.out.println(" ");
        System.out.print(top);


    }
}
