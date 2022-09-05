package projeler.tvProjesi;

import java.util.ArrayList;

public class Televizyon {

   private String marka;
    private String inc;

    private ArrayList<Kanal> kanallar;

    public Televizyon(String marka, String inc) {
        this.marka = marka;
        this.inc = inc;
        kanallariOlustur();
    }

    private void kanallariOlustur() {
        HaberKanali cnn=new HaberKanali("CNN",1,"genel haber");
        kanallar.add(cnn);

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    @Override
    public String toString() {
        return
                "marka=" + marka +
                "\ninc=" + inc
                        +"\nolan tv olusturuldu";
    }
}
