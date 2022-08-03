package OOP;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    @Override
    public String toString() {
        return
                "hesapNo=" + hesapNo +
                "\nbakiye=" + bakiye +
                "\nisim=" + isim +
                "\nemail=" + email +
                "\ntelefonNo=" + telefonNo ;

    }

    public Account(){
    /*    this.hesapNo="Bilgi yok";
        this.bakiye=00.0;
        this.isim="Bilgi yok";
        this.email="Bilgi yok";
        this.telefonNo="Bilgi yok";*/
        //System.out.println("kendi yazdigimiz constructor");
        this("bilgi yok",00.00,"bilgi yok","bilgi yok","bilgi yok");
    }
public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo= hesapNo;
        this.bakiye= bakiye;
        this.isim= isim;
        this.email= email;
        this.telefonNo= telefonNo;


}
    public void paraYatir(double miktar){

      bakiye+=miktar;
        System.out.println("Yeni bakiye = "+bakiye);
    }
    public void paraCekme(double miktar){
        if (miktar>1500){
            System.out.println("bir gunde 1500 tl den fazla para cekemezsiniz");
        }
        if (bakiye-miktar<0){
            System.out.println("yeterli bakiye yok.bakiye = "+bakiye);

        }else {
            bakiye-=miktar;
            System.out.println("yeni bakiye = "+bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
