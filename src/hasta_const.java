
public class hasta_const {
    
    private int sira;
    private String ad;
    private String soyad;
    private String iletisim;
    private String yer;
    private String tarih;
    private String guvence;
    private String sicil;
    private String kimlik;

    public hasta_const(int sira, String ad, String soyad, String iletisim, String yer, String tarih, String guvence, String sicil, String kimlik) {
        this.sira = sira;
        this.ad = ad;
        this.soyad = soyad;
        this.iletisim = iletisim;
        this.yer = yer;
        this.tarih = tarih;
        this.guvence = guvence;
        this.sicil = sicil;
        this.kimlik = kimlik;
    }
    public int getSira(){
        return this.sira;
    }
    public void setSira(int sira){
        this.sira = sira;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getGuvence() {
        return guvence;
    }

    public void setGuvence(String guvence) {
        this.guvence = guvence;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    } 
}
