public class Sıra_Ver {
    
    private int sira;
    private String tc;
    private String ad;
    private String soyad;
    private String d_yeri;
    private String d_tarihi;
    private String guvence;
    private String g_no;
    private String tel;
    private String servis;
    private String tarih;
    private String saat;
    private String ilac;
    private String not;

    public Sıra_Ver(String tc, String ad, String soyad, String d_yeri, String d_tarihi, String guvence, String g_no, String tel, String servis, String tarih, String saat) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.d_yeri = d_yeri;
        this.d_tarihi = d_tarihi;
        this.guvence = guvence;
        this.g_no = g_no;
        this.tel = tel;
        this.servis = servis;
        this.tarih = tarih;
        this.saat = saat;
    }
    public Sıra_Ver(int sira, String tc, String ad, String soyad, String tarih, String ilac, String not){
        this.sira = sira;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.tarih = tarih;
        this.not = not;
        this.ilac = ilac;
    }

    public int getSira() {
        return sira;
    }

    public void setSira(int sira) {
        this.sira = sira;
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

    public String getD_yeri() {
        return d_yeri;
    }

    public void setD_yeri(String d_yeri) {
        this.d_yeri = d_yeri;
    }

    public String getD_tarihi() {
        return d_tarihi;
    }

    public void setD_tarihi(String d_tarihi) {
        this.d_tarihi = d_tarihi;
    }

    public String getGuvence() {
        return guvence;
    }

    public void setGuvence(String guvence) {
        this.guvence = guvence;
    }

    public String getG_no() {
        return g_no;
    }

    public void setG_no(String g_no) {
        this.g_no = g_no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getServis() {
        return servis;
    }

    public void setServis(String servis) {
        this.servis = servis;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
    
    
    
    
    
}
