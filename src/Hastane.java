import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
public class Hastane {
public static final String kullanıcı_adi="root";
public static final String parola="";
public static final String db_ismi="hastane";
public static final String host="localhost";
public static final int port=3306 ;

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

public Hastane(){
    String url ="jdbc:mysql://"+Veritabanı.host+":"+Veritabanı.port+"/"+Veritabanı.db_ismi+"?useUnicode = true & characterEncoding = utf8" +
    "    private Statement statement = null;\n" +
    "    private PreparedStatement preparedStatement = null;";
    try{
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException ex){
        System.out.println("Driver bulunamadı....");
    }
    try{
    con=DriverManager.getConnection(url, Veritabanı.kullanici_adi,Veritabanı.parola);
        System.out.println("Bağlantı Başarılı...");
    }
    catch (SQLException ex){
            System.out.println("bağlantı başarısız...");
    }
}
    public ArrayList<hasta_const> hastalariGetir(){
        ArrayList<hasta_const> cikti = new ArrayList<hasta_const>();
        
        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM hastalar";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               int sira = rs.getInt("sıra");
               String isim = rs.getString("ad");
               String soyisim = rs.getString("soyad");
               String iletisim = rs.getString("iletisim");
               String yer = rs.getString("yer");
               String tarih = rs.getString("tarih");
               String guvence = rs.getString("güvence");
               String sicil = rs.getString("sicil");
               String kimlik = rs.getString("kimlik");
               
               cikti.add(new hasta_const(sira, isim, soyisim, iletisim, yer, tarih, guvence, sicil, kimlik));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    } 
    public ArrayList<hasta_const> hastalariGetir1(){
        ArrayList<hasta_const> cikti = new ArrayList<hasta_const>();
        
        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM hastalar";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               int sira = rs.getInt("sıra");
               String isim = rs.getString("ad");
               String soyisim = rs.getString("soyad");
               String iletisim = rs.getString("iletisim");
               String yer = rs.getString("yer");
               String tarih = rs.getString("tarih");
               String guvence = rs.getString("güvence");
               String sicil = rs.getString("sicil");
               String kimlik = rs.getString("kimlik");
               
               cikti.add(new hasta_const(sira, isim, soyisim, iletisim, yer, tarih, guvence, sicil, kimlik));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    public ArrayList<ServisSil> servisGetir(){
        ArrayList<ServisSil> cikti = new ArrayList<ServisSil>();

        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM servisekle";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               
               String servis = rs.getString("servis");
               
               
               cikti.add(new ServisSil(servis));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    public ArrayList<SORGULANOT> sorgula(){
        ArrayList<SORGULANOT> cikti = new ArrayList<SORGULANOT>();
        
        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM doktor_sira_ver";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               
               int sira = rs.getInt("sira");
               String tc = rs.getString("tc");
               String ad = rs.getString("adi_soyadi");
               String tarih = rs.getString("tarih");
               String ilac = rs.getString("ilac");
               String not = rs.getString("ek_not");
               
               
               cikti.add(new SORGULANOT(sira, tc, ad, tarih, ilac, not));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
    public void hastaekle(String ad,String soyad,String iletisim,String dogumyer,String dogumtarih,String sosyalguvence,String sosyalguvenceno,String tc){
        
        String sorgu = "Insert Into hastalar(ad,soyad,iletisim,yer,tarih,güvence,sicil,kimlik) VALUES(?,?,?,?,?,?,?,?)";

        try { 

             preparedStatement=con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad); 
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, iletisim);
            preparedStatement.setString(4, dogumyer);
            preparedStatement.setString(5, dogumtarih);
            preparedStatement.setString(6, sosyalguvence);  
            preparedStatement.setString(7, sosyalguvenceno);  
            preparedStatement.setString(8, tc);
            
            preparedStatement.executeUpdate();

        } 
        catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hastaekle1(String ad,String soyad,String iletisim,String dogumyer,String dogumtarih,String sosyalguvence,String sosyalguvenceno,String tc){
        
        String sorgu = "Insert Into hastalar(ad,soyad,iletisim,yer,tarih,güvence,sicil,kimlik) VALUES(?,?,?,?,?,?,?,?)";

        try { 

             preparedStatement=con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad); 
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, iletisim);
            preparedStatement.setString(4, dogumyer);
            preparedStatement.setString(5, dogumtarih);
            preparedStatement.setString(6, sosyalguvence);  
            preparedStatement.setString(7, sosyalguvenceno);  
            preparedStatement.setString(8, tc);
            
            preparedStatement.executeUpdate();

        } 
        catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void servisEkle(String servis){
        
        String sorgu = "Insert Into servisekle(servis) VALUES(?)";

        try { 

             preparedStatement=con.prepareStatement(sorgu);

            preparedStatement.setString(1, servis);
            
            preparedStatement.executeUpdate();

        } 
        catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sıraEkle(String tc,String ad,String soyad,String d_yeri,String d_tarihi,String guvence,String g_no,String tel, String tarih , String saat){
        
        String sorgu = "Insert Into siraver(tc,ad,soyad,dogumyeri,dogumtarihi,guvence,guvenceno,tel,servis,tarih,saat) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try { 

             preparedStatement=con.prepareStatement(sorgu);

            preparedStatement.setString(1, tc); 
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, d_yeri);
            preparedStatement.setString(5, d_tarihi);
            preparedStatement.setString(6, guvence);  
            preparedStatement.setString(7, g_no); 
            preparedStatement.setString(7, tel); 
            preparedStatement.setString(7, tarih); 
            preparedStatement.setString(8, saat);
            
            preparedStatement.executeUpdate();

        } 
        catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void servisSil(String servis){
        String sorgu = "Delete from servisekle where servis = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, servis);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<DoktorSorgula> doktorGetir(){
        ArrayList<DoktorSorgula> cikti = new ArrayList<DoktorSorgula>();
        
        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM doktorekle";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               int sira = rs.getInt("sira");
               String tur = rs.getString("perturu");
               String kimlik = rs.getString("tc");
               String isim = rs.getString("ad");
               String soyisim = rs.getString("soyad");
               String servis = rs.getString("servis");
               String iletisim = rs.getString("tel");
               String mail = rs.getString("email");
               String adres = rs.getString("adres");
              
               cikti.add(new DoktorSorgula(sira, tur, kimlik, isim, soyisim, servis, iletisim, mail, adres));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }public ArrayList<Sıra_Ver> siraVer(){
        ArrayList<Sıra_Ver> cikti = new ArrayList<Sıra_Ver>();
        
        try {
           statement = con.createStatement();
           String sorgu = "Select * FROM siraver";
           ResultSet rs = statement.executeQuery(sorgu);
           
           while(rs.next()){
               
               String tc = rs.getString("tc");
               String ad = rs.getString("ad");
               String soyad = rs.getString("soyad");
               String d_yeri = rs.getString("dogumyeri");
               String d_tarihi = rs.getString("dogumtarihi");
               String guvence = rs.getString("guvence");
               String g_no = rs.getString("guvenceno");
               String tel = rs.getString("tel");
               String servis = rs.getString("servis");
               String tarih = rs.getString("tarih");
               String saat = rs.getString("saat");
              
               cikti.add(new Sıra_Ver(tc, ad, soyad, d_yeri, d_tarihi, guvence, g_no, tel, servis,tarih,saat));
               
           }
           return cikti;
       } 
        catch (SQLException ex) {
        Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    }
        public void doktorEkle(String perturu,String tc,String ad,String soyad,String servis,String tel,String email,String adres){
            
            try { 
                    String sorgu = "Insert Into doktorekle(perturu,tc,ad,soyad,servis,tel,email,adres) VALUES(?,?,?,?,?,?,?,?)";
                 preparedStatement=con.prepareStatement(sorgu);

                preparedStatement.setString(1, perturu); 
                preparedStatement.setString(2, tc);
                preparedStatement.setString(3, ad);
                preparedStatement.setString(4, soyad);
                preparedStatement.setString(5, servis);
                preparedStatement.setString(6, tel);  
                preparedStatement.setString(7, email);  
                preparedStatement.setString(8, adres);

                preparedStatement.executeUpdate();

            } 
            catch (SQLException ex) {
                Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    public void ekle(String servis) 
        {
        try { 
                String sorgu = "Insert Into servisekle(servis) VALUES(?)";
             preparedStatement=con.prepareStatement(sorgu);


            preparedStatement.setString(1, servis); 

            preparedStatement.executeUpdate();


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "HATA");
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void siraekle(String tc,String adi,String soyadi,String dogumyeri,String dogumtarihi,String sosyalguvence,String sosyalguvenceno,String iletisim,String tarihi,String saati){
        try { 
             String sorgu = "Insert Into siraverme(tc,adi,soyadi,dogumyeri,dogumtarihi,sosyalguvence,sosyalguvenceno,iletisim,tarihi,saati) VALUES(?,?,?,?,?,?,?,?,?,?)";
             preparedStatement=con.prepareStatement(sorgu);


            preparedStatement.setString(1, tc); 
            preparedStatement.setString(2, adi);
            preparedStatement.setString(3, soyadi);
            preparedStatement.setString(4, dogumyeri);
            preparedStatement.setString(5, dogumtarihi);
            preparedStatement.setString(6, sosyalguvence);  
            preparedStatement.setString(7, sosyalguvenceno);  
             preparedStatement.setString(8, iletisim);
               preparedStatement.setString(9, tarihi);
                 preparedStatement.setString(10, saati);
            preparedStatement.executeUpdate();


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "HATA");
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }   
       }  

    public void doktor_sira_ver(String tc,String adi_soyadi,String tarih,String ilac,String ek_not){

        try { 
                String sorgu = "Insert Into doktor_sira_ver(tc,adi_soyadi,tarih,ilac,ek_not) VALUES(?,?,?,?,?)";
             preparedStatement=con.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, adi_soyadi);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, ilac);
            preparedStatement.setString(5, ek_not);  

            preparedStatement.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(Hastane.class.getName()).log(Level.SEVERE, null, ex);
        }   
       }   
}