package CalismaDosyaları.calisma;

public class A09bosluklu {
    public static void main(String[] args) {
        int satır=10;
        int sutun=10;

        for(int i = 0; i < satır; ++i) {
            for(int j = 0; j < sutun; ++j) {
                if (i == 0 | i ==satır - 1) {
                    System.out.print("* ");
                    if (j == sutun - 1) {
                        System.out.println();
                    }
                } else if (j == 0) {
                    System.out.print("* ");
                } else if (j == sutun - 1) {
                    System.out.println("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}
