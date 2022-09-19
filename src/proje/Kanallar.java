package proje;

public class Kanallar {
  static  String isim;
  static  String frekans;

    public Kanallar(String isim, String frekans) {
        this.isim = isim;
        this.frekans = frekans;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }
 public String toString() {
        return "KANAL ISMI= "+isim+"\n"+
                "KANAL FREKANSI= "+frekans;
 }

}
