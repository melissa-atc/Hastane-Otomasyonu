import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class hasta extends javax.swing.JFrame {
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();

   public hasta(java.awt.Frame parent, boolean modal) {
      super();
      initComponents();
      model = (DefaultTableModel)tablo.getModel();
      HastaGoruntule();
        setResizable(false);
    }   

    hasta() {
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
        TC = new javax.swing.JTextField();
        Ad = new javax.swing.JTextField();
        Soyad = new javax.swing.JTextField();
        dogumyeri = new javax.swing.JTextField();
        dogumtarihi = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        sosyalgüvence = new javax.swing.JComboBox<>();
        tel = new javax.swing.JTextField();
        kaydet = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HASTA KAYIT EKRANI");
        setLocation(new java.awt.Point(520, 200));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TC :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 70, 35, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ad :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 110, 35, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Soyad :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 140, 70, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doğum Yeri :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 190, 120, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Doğum Tarihi :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 230, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sosyal Güvence :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 160, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("İletişim :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 370, 90, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sosyal Güvence No :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 320, 190, 22);

        TC.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(TC);
        TC.setBounds(200, 60, 170, 30);

        Ad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Ad);
        Ad.setBounds(200, 100, 170, 30);

        Soyad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Soyad);
        Soyad.setBounds(200, 140, 170, 30);

        dogumyeri.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(dogumyeri);
        dogumyeri.setBounds(200, 180, 170, 30);

        dogumtarihi.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(dogumtarihi);
        dogumtarihi.setBounds(200, 220, 170, 30);

        no.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(no);
        no.setBounds(200, 320, 170, 30);

        sosyalgüvence.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sosyalgüvence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "BAĞKUR", "Emekli Sandığı", "GSS", "SSK" }));
        jPanel1.add(sosyalgüvence);
        sosyalgüvence.setBounds(200, 280, 170, 30);

        tel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(200, 370, 170, 30);

        kaydet.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        kaydet.setText(" KAYDET");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });
        jPanel1.add(kaydet);
        kaydet.setBounds(570, 70, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BAŞARI HASTANESİ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(780, 410, 150, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("YENİ HASTA GİRİŞİ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 130, 190, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("İŞLEM SAYFASI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 190, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("HASTA KAYIT");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 30, 220, 29);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(390, 230, 530, 30);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Ad", "Soyad", "Telefon", "Doğum Yeri", "Doğum Trarihi", "Sosyal Güvence", "Sosyal Güvence No", "T.C:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane3.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(2).setResizable(false);
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(4).setResizable(false);
            tablo.getColumnModel().getColumn(5).setResizable(false);
            tablo.getColumnModel().getColumn(6).setResizable(false);
            tablo.getColumnModel().getColumn(7).setResizable(false);
            tablo.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(392, 270, 660, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, 0, 1090, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        işlem işlem = new işlem();
        setVisible(false);
        işlem.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         setVisible(false);
         setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed
        mesaj_yazisi.setText("");
        String ad =Ad.getText();
        String soyad=Soyad.getText();
        String iletisim =tel.getText();
        String dogumyer =dogumyeri.getText();
        String dogumtarih =dogumtarihi.getText();
        String sosyalguvence =sosyalgüvence.getSelectedItem().toString();
        String sosyalguvenceno =no.getText();
        String tc =TC.getText();
        hastaislem.hastaekle(ad,soyad,iletisim,dogumyer,dogumtarih,sosyalguvence,sosyalguvenceno,tc);
        HastaGoruntule();
        mesaj_yazisi.setText("Ekleme BAŞARILI!");
    }//GEN-LAST:event_kaydetActionPerformed
    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int selectedrow = tablo.getSelectedRow();
        Ad.setText(model.getValueAt(selectedrow, 1).toString());
        Soyad.setText(model.getValueAt(selectedrow, 2).toString());
        tel.setText(model.getValueAt(selectedrow, 3).toString());
        dogumyeri.setText(model.getValueAt(selectedrow, 4).toString());
        dogumtarihi.setText(model.getValueAt(selectedrow, 5).toString());
        sosyalgüvence.setSelectedItem(model.getValueAt(selectedrow, 6).toString());
        no.setText(model.getValueAt(selectedrow, 7).toString());
        TC.setText(model.getValueAt(selectedrow, 8).toString());
    }//GEN-LAST:event_tabloMouseClicked
    public void HastaGoruntule(){
        model.setRowCount(0);
        ArrayList<hasta_const> hastane = new ArrayList<hasta_const>();
        
        hastane = hastaislem.hastalariGetir();
        if(hastane !=null){
            for(hasta_const hasta : hastane){
                Object[] eklenecek = {hasta.getSira(),hasta.getAd(),hasta.getSoyad(),hasta.getIletisim(),hasta.getYer(),hasta.getTarih(),hasta.getGuvence(),hasta.getSicil(),hasta.getKimlik()};
                model.addRow(eklenecek);
            }
        }     
    }    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hasta dialog = new hasta(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Soyad;
    private javax.swing.JTextField TC;
    private javax.swing.JTextField dogumtarihi;
    private javax.swing.JTextField dogumyeri;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton kaydet;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField no;
    private javax.swing.JComboBox<String> sosyalgüvence;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables

    
}
