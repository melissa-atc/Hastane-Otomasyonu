import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class sıra extends javax.swing.JFrame {
   Hastane hastaislem= new Hastane();
   
   public sıra(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
         
   }

    sıra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Tc = new javax.swing.JTextField();
        Ad = new javax.swing.JTextField();
        Soyad = new javax.swing.JTextField();
        Dogumyeri = new javax.swing.JTextField();
        Dogumtarihi = new javax.swing.JTextField();
        Guvence = new javax.swing.JComboBox<>();
        No = new javax.swing.JTextField();
        İletisim = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Servis = new javax.swing.JComboBox<>();
        Tarih = new javax.swing.JTextField();
        ekle = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Saat = new javax.swing.JTextField();
        mesajyazisi = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TC :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 60, 35, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ad :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 100, 35, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Soyad :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 140, 80, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Doğum Yeri :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 180, 130, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doğum Tarihi :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 220, 140, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sosyal Güvence :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 260, 160, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("İletişim :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 330, 80, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sosyal Güvence No :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 290, 190, 22);

        Tc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Tc);
        Tc.setBounds(270, 60, 150, 23);

        Ad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdActionPerformed(evt);
            }
        });
        jPanel1.add(Ad);
        Ad.setBounds(270, 100, 150, 23);

        Soyad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Soyad);
        Soyad.setBounds(270, 140, 150, 23);

        Dogumyeri.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Dogumyeri);
        Dogumyeri.setBounds(270, 180, 150, 23);

        Dogumtarihi.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Dogumtarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogumtarihiActionPerformed(evt);
            }
        });
        jPanel1.add(Dogumtarihi);
        Dogumtarihi.setBounds(270, 220, 150, 23);

        Guvence.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Guvence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçiniz..", "Emekli Sandığı", "BAKUR", "GSS", "SSK" }));
        jPanel1.add(Guvence);
        Guvence.setBounds(270, 260, 150, 23);

        No.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(No);
        No.setBounds(270, 290, 150, 23);

        İletisim.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(İletisim);
        İletisim.setBounds(270, 330, 150, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Servis:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 70, 80, 22);

        Servis.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Servis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Acil Servis", "Ağız ve Diş Sağlığı", "Beslenme ve Diyetetik", "Beyin ve Sinir Cerrahisi( Nöroloji)", "Çocuk Ergen ve Ruh Sağlığı", "Çocuk Göğüs Hastalıkları", "Dermotoloji", "Dahiliye", "Estetik Cerrahi", "Fizik Tedavi ve Rehabilitasyon", "Genel Cerrahi", "Göğüs Cerrahisi", "Göz Hastalıkları", "Kadın Jastalıkları ve Doğum7Kalp ve Damar Cerrahisi", "Ortapedi", "Psikoloji", "Radyoloji", "Uroloji", " " }));
        jPanel1.add(Servis);
        Servis.setBounds(630, 70, 170, 23);

        Tarih.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Tarih);
        Tarih.setBounds(630, 110, 170, 23);

        ekle.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ekle.setText("SIRA VER");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });
        jPanel1.add(ekle);
        ekle.setBounds(630, 190, 170, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("İŞLEM SAYFASI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(630, 240, 170, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Randevu Tarihi :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(460, 110, 200, 14);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Randevu Saati :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(470, 150, 150, 22);

        Saat.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Saat);
        Saat.setBounds(630, 150, 170, 23);
        jPanel1.add(mesajyazisi);
        mesajyazisi.setBounds(630, 330, 170, 0);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(510, 300, 410, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, -120, 980, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdActionPerformed

    private void DogumtarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogumtarihiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogumtarihiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        işlem giriş=new işlem();
        setVisible(false);
        giriş.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
   
        mesaj_yazisi.setText("");
        String tc =Tc.getText();
        String ad =Ad.getText();
        String soyad =Soyad.getText();
        String d_yeri =Dogumyeri.getText();
        String d_tarihi =Dogumtarihi.getText();
        String guvence =Guvence.getSelectedItem().toString();
        String g_no =No.getText();
        String tel =İletisim.getText();
        String servis=Servis.getSelectedItem().toString();
        String tarih =Tarih.getText();
        String saat =Saat.getText();
        
        hastaislem.siraekle(tc,ad,soyad,d_yeri,d_tarihi,guvence,g_no,tel,tarih,saat);
        mesaj_yazisi.setText("Sıra Alma İşlemi Başarıyla Oluşturuldu...");
        
    }//GEN-LAST:event_ekleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sıra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sıra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sıra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sıra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sıra dialog = new sıra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e){
                    System.exit(0);
                }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ad;
    private javax.swing.JTextField Dogumtarihi;
    private javax.swing.JTextField Dogumyeri;
    private javax.swing.JComboBox<String> Guvence;
    private javax.swing.JTextField No;
    private javax.swing.JTextField Saat;
    private javax.swing.JComboBox<String> Servis;
    private javax.swing.JTextField Soyad;
    private javax.swing.JTextField Tarih;
    private javax.swing.JTextField Tc;
    private javax.swing.JButton ekle;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel mesajyazisi;
    private javax.swing.JTextField İletisim;
    // End of variables declaration//GEN-END:variables
}
