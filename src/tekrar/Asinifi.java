package tekrar;

public class Asinifi {
    int m=222;
    {
        m=m++;

        System.out.println(m);
    }
}
class Bsinifi extends Asinifi {
    {
        System.out.println(methodB());
    }

    int methodB(){
    int    a=m--+
            --m;

        return a;
    }
}
class Main{
    public static void main(String[] args) {
        Bsinifi b=new Bsinifi();
    }
}