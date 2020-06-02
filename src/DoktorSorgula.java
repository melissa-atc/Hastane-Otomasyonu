public class DoktorSorgula {
   
    private int sira;
    private String pertur;
    private String tc;
    private String ad;
    private String soyad;
    private String servis;
    private String email;
    private String adres;
    private String tel;
    
    public DoktorSorgula(int sira, String pertur, String tc, String ad, String soyad, String servis, String tel, String email, String adres){
        this.sira = sira;
        this.pertur = pertur;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.servis = servis;
        this.tel = tel;
        this.email = email;
        this.adres = adres;
    }

    public String getPertur() {
        return pertur;
    }

    public void setPertur(String pertur) {
        this.pertur = pertur;
    }

    public String getServis() {
        return servis;
    }

    public void setServis(String servis) {
        this.servis = servis;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    

   
}
