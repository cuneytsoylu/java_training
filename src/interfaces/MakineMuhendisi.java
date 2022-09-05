package interfaces;

public class MakineMuhendisi implements IMuhendis,ikinci{
    private boolean askerlik;

    private boolean referans;

    public MakineMuhendisi(boolean askerlik, boolean referans) {
        this.askerlik = askerlik;
        this.referans = referans;
    }

    @Override
    public void referansSorgula() {

    }

    @Override
    public void askerlikDurumuSorgula() {

    }

    @Override
    public String mezuniyetOrtalmasi(double derece) {
        return null;
    }

    @Override
    public void isTecrubesi(String[] array) {

    }



    public static void main(String[] args) {

    }

    @Override
    public void rastgele1() {

    }
}
