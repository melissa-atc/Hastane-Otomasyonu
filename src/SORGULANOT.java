public class SORGULANOT {
    
    private int sira;
    private String tc;
    private String ad;
    private String soyad;
    private String tarih;
    private String ilac;
    private String not;
    private String adres;
    private String tel;

    public SORGULANOT(int sira, String tc, String ad, String tarih, String ilac, String not) {
        this.sira = sira;
        this.tc = tc;
        this.ad = ad;
        this.tarih = tarih;
        this.ilac = ilac;
        this.not = not;
    }
    
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public int getSira() {
        return sira;
    }

    public void setSira(int sira) {
        this.sira = sira;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getIlac() {
        return ilac;
    }

    public void setIlac(String ilac) {
        this.ilac = ilac;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }
    
    
    
    
}
