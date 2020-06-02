
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewClass {
    private String kullanici_adi="root";
    private String parola=" ";
    private String db_ismi="hastane";
    private  String host="localhost";
    private int port =3306;
    private Connection con =null;
    public NewClass(){
        String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch ( ClassNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("Driver bulunamadı...");
        }
        try 
        {
        con =DriverManager.getConnection(url, kullanici_adi, parola);
       
            System.out.println("Bağlantı Başaralı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

         
















