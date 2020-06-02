import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class personalkayıt2 extends javax.swing.JFrame {
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();
    
    
    public personalkayıt2(java.awt.Frame parent, boolean modal) {
        super();
      initComponents();
      model = (DefaultTableModel)tablo.getModel();
      HastaGoruntule();
    
    }

    personalkayıt2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tc = new javax.swing.JTextField();
        Adı = new javax.swing.JTextField();
        Soyadı = new javax.swing.JTextField();
        Telefon = new javax.swing.JTextField();
        Eposta = new javax.swing.JTextField();
        Unvan = new javax.swing.JTextField();
        Adres = new javax.swing.JTextField();
        Personelturu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        Servis = new javax.swing.JComboBox<>();
        Kaydet = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERSONEL KAYDI");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 370, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Personel Türü :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 90, 150, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TC :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 130, 50, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-Posta :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 320, 130, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefon :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 290, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adı :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 170, 40, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Servis :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 250, 80, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Soyadı :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(180, 200, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Adres :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(190, 350, 70, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ünvan :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(590, 90, 70, 22);

        Tc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Tc);
        Tc.setBounds(260, 130, 170, 30);

        Adı.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Adı);
        Adı.setBounds(260, 170, 170, 30);

        Soyadı.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Soyadı);
        Soyadı.setBounds(260, 210, 170, 30);

        Telefon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Telefon);
        Telefon.setBounds(260, 280, 170, 30);

        Eposta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Eposta);
        Eposta.setBounds(260, 320, 170, 30);

        Unvan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Unvan);
        Unvan.setBounds(670, 90, 180, 30);

        Adres.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Adres);
        Adres.setBounds(260, 360, 170, 70);

        Personelturu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Personelturu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçiniz...", "Adli Tıp Teknissyeni", "Bilgi İşlem", "Doktor", "Hemşire", "Paramedik", "Sekreter", "Diğer" }));
        Personelturu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelturuActionPerformed(evt);
            }
        });
        jPanel1.add(Personelturu);
        Personelturu.setBounds(260, 90, 170, 23);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Ünvan", "", "Ad", "Soyad", "Servis", "Telefon", "e-posta", "Adres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(2).setHeaderValue("");
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(4).setResizable(false);
            tablo.getColumnModel().getColumn(5).setResizable(false);
            tablo.getColumnModel().getColumn(6).setResizable(false);
            tablo.getColumnModel().getColumn(7).setResizable(false);
            tablo.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(460, 280, 600, 150);

        Servis.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Servis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçiniz...", "Acil Servis", "Ağız ve Diş Sağlığı", "Beslenme  ve Diyetetik", "Beyin ve Sinir Cerrahisi(Nöroloji)", "Çocuk Göğüs Hastalıkları", "Dermotoloji", "Dahiliye", "Estetik Cerrahi", "Fizik Tedavi ve Rehabilitasyon", "Genel Cerrahi", "Göğüs Cerrahi", "Göz Hastalıkları", "Kadın Hastalıkları ve Doğum", "Kalp ve Damar Cerrahisi", "Ortopedi", "Psikoloji", "Radyoloji", "Uroloji" }));
        jPanel1.add(Servis);
        Servis.setBounds(260, 250, 170, 23);

        Kaydet.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Kaydet.setText("Kaydet");
        Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydetActionPerformed(evt);
            }
        });
        jPanel1.add(Kaydet);
        Kaydet.setBounds(670, 140, 180, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Yeni Personal Kaydet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(670, 190, 180, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("İşlem Sayfası");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(670, 240, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("BAŞARI HASTANESİ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(910, 430, 160, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jLabel12.setText("Başarı Hastanesi");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-40, 0, 1120, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PersonelturuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelturuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelturuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 işlem işlem=new işlem();
        setVisible(false);
        işlem.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydetActionPerformed
                                    
        String personelturu =Personelturu.getSelectedItem().toString();
        String tc=Tc.getText();
        String adi =Adı.getText();
        String soyadi =Soyadı.getText();
        String servis =Servis.getSelectedItem().toString();
        String telefon =Telefon.getText();
        String eposta =Eposta.getText();
        String adres =Adres.getText();

        hastaislem.doktorEkle(personelturu,tc,adi,soyadi,servis,telefon,eposta,adres);
        HastaGoruntule();
    }//GEN-LAST:event_KaydetActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int selectedrow = tablo.getSelectedRow();
        Tc.setText(model.getValueAt(selectedrow, 2).toString());
        Adı.setText(model.getValueAt(selectedrow, 3).toString());
        Soyadı.setText(model.getValueAt(selectedrow, 4).toString());
        Telefon.setText(model.getValueAt(selectedrow, 6).toString());
        Eposta.setText(model.getValueAt(selectedrow, 7).toString());
        Adres.setText(model.getValueAt(selectedrow, 8).toString());
       
    }//GEN-LAST:event_tabloMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void HastaGoruntule(){
        model.setRowCount(0);
        ArrayList<DoktorSorgula> hastane = new ArrayList<DoktorSorgula>();
        
        hastane = hastaislem.doktorGetir();
        if(hastane !=null){
            for(DoktorSorgula doktor : hastane){
                Object[] eklenecek = {doktor.getSira(),doktor.getPertur(),doktor.getTc(),doktor.getAd(),doktor.getSoyad(),doktor.getServis(),doktor.getTel(),doktor.getEmail(),doktor.getAdres()};
                model.addRow(eklenecek);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                personalkayıt2 dialog = new personalkayıt2(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Adres;
    private javax.swing.JTextField Adı;
    private javax.swing.JTextField Eposta;
    private javax.swing.JButton Kaydet;
    private javax.swing.JComboBox<String> Personelturu;
    private javax.swing.JComboBox<String> Servis;
    private javax.swing.JTextField Soyadı;
    private javax.swing.JTextField Tc;
    private javax.swing.JTextField Telefon;
    private javax.swing.JTextField Unvan;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
