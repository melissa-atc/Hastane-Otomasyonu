import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class sorgula extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();

    public sorgula(java.awt.Frame parent, boolean modal) { 
      super();
      initComponents();
      model = (DefaultTableModel)tablo.getModel();
      HastaGoruntule();
      
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tc = new javax.swing.JTextField();
        Adi_soyadi = new javax.swing.JTextField();
        Ek_not = new javax.swing.JTextField();
        İlac = new javax.swing.JTextField();
        Tarih = new javax.swing.JTextField();
        ekle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TC :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 90, 40, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ad -Soyad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 130, 100, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarih :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 170, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Verilen İlaçlar :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 210, 150, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ek Notlar :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 310, 100, 22);

        Tc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Tc);
        Tc.setBounds(200, 90, 180, 30);

        Adi_soyadi.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Adi_soyadi);
        Adi_soyadi.setBounds(200, 130, 180, 30);

        Ek_not.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Ek_not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ek_notActionPerformed(evt);
            }
        });
        jPanel1.add(Ek_not);
        Ek_not.setBounds(200, 310, 180, 80);

        İlac.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(İlac);
        İlac.setBounds(200, 210, 180, 80);

        Tarih.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(Tarih);
        Tarih.setBounds(200, 170, 180, 30);

        ekle.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ekle.setText("EKLE");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });
        jPanel1.add(ekle);
        ekle.setBounds(470, 80, 150, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BAŞARI HASTANESİ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 420, 150, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText("SEÇENEKLER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(470, 130, 150, 30);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sira", "Tc", "adi-soyadi", "tarih", "ilaç", "notlar"
            }
        ));
        tablo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabloAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 260, 490, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-40, 0, 1580, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ek_notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ek_notActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ek_notActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        doktor1 doktor1=new doktor1();
        setVisible(false);
        doktor1.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        
        String tc =Tc.getText();
        String adi_soyadi=Adi_soyadi.getText();
        String tarih=Tarih.getText();
        String ilac=İlac.getText();
        String ek_not =Ek_not.getText();
       
        hastaislem.doktor_sira_ver(tc,adi_soyadi,tarih,ilac,ek_not);
        HastaGoruntule();

    }//GEN-LAST:event_ekleActionPerformed

    private void tabloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabloAncestorAdded
       
    }//GEN-LAST:event_tabloAncestorAdded

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int selectedrow = tablo.getSelectedRow();
        Tc.setText(model.getValueAt(selectedrow, 1).toString());
        Adi_soyadi.setText(model.getValueAt(selectedrow, 2).toString());
        Tarih.setText(model.getValueAt(selectedrow, 3).toString());
        İlac.setText(model.getValueAt(selectedrow, 4).toString());
        Ek_not.setText(model.getValueAt(selectedrow, 4).toString());
    }//GEN-LAST:event_tabloMouseClicked
 public void HastaGoruntule(){
        model.setRowCount(0);
        ArrayList<SORGULANOT> hastane = new ArrayList<SORGULANOT>();
        
        hastane = hastaislem.sorgula();
        if(hastane !=null){
            for(SORGULANOT sorgula : hastane){
                Object[] eklenecek = {sorgula.getSira(),sorgula.getTc(),sorgula.getAd(),sorgula.getTarih(),sorgula.getIlac(),sorgula.getNot()};
                model.addRow(eklenecek);
            }
        }     
    } 
  
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
            java.util.logging.Logger.getLogger(sorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sorgula dialog = new sorgula(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Adi_soyadi;
    private javax.swing.JTextField Ek_not;
    private javax.swing.JTextField Tarih;
    private javax.swing.JTextField Tc;
    private javax.swing.JButton ekle;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField İlac;
    // End of variables declaration//GEN-END:variables

 
}
