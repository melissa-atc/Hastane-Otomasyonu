
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class sil extends javax.swing.JFrame {
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();
    
    public sil(java.awt.Frame parent, boolean modal) {
      super();
      initComponents();
      model = (DefaultTableModel)tablo_servis.getModel();
      HastaGoruntule();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sil = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_servis = new javax.swing.JTable();
        mesaj_yazisi = new javax.swing.JLabel();
        ara = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servis Sil :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 80, 170, 20);

        sil.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        jPanel1.add(sil);
        sil.setBounds(230, 130, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BAŞARI HASTANESİ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(790, 410, 150, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 170, 100, 30);

        tablo_servis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERVİS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo_servis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_servisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_servis);
        if (tablo_servis.getColumnModel().getColumnCount() > 0) {
            tablo_servis.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 80, 410, 270);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(500, 24, 400, 30);

        ara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                araKeyReleased(evt);
            }
        });
        jPanel1.add(ara);
        ara.setBounds(230, 80, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -30, 980, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        mesaj_yazisi.setText("");
        
        int selectedrow = tablo_servis.getSelectedRow();
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Servis Tablosu Şuan Boş...");      
            }
            else{
                mesaj_yazisi.setText("Lütfen Silinecek Servisi Seçiniz!");           
            }           
        }                                   
        else{
            String sira = (String) model.getValueAt(selectedrow , 0);
            hastaislem.servisSil(sira);
            HastaGoruntule();
            mesaj_yazisi.setText("Servis Başarıyla Silindi...");
        }
    }//GEN-LAST:event_silActionPerformed
    
    public void HastaGoruntule(){
        model.setRowCount(0);
        ArrayList<ServisSil> hastane = new ArrayList<ServisSil>();
        
        hastane = hastaislem.servisGetir();
        if(hastane !=null){
            for(ServisSil servis : hastane){
                Object[] eklenecek = {servis.getServis()};
                model.addRow(eklenecek);
            }
        }     
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        servis servis=new servis();
        setVisible(false);
        servis.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void araKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araKeyReleased
        
    }//GEN-LAST:event_araKeyReleased

    private void tablo_servisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_servisMouseClicked
        
    }//GEN-LAST:event_tablo_servisMouseClicked

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
            java.util.logging.Logger.getLogger(sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sil dialog = new sil(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField ara;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JTable tablo_servis;
    // End of variables declaration//GEN-END:variables
}
