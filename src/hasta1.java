
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class hasta1 extends javax.swing.JFrame {
 
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();
    public hasta1() {
          super();
      initComponents();
      model = (DefaultTableModel)tablo.getModel();
      HastaGoruntule();
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TC :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 40, 50, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(80, 40, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HASTA LİSTE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 10, 130, 22);

        tablo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "T.C.", "Ad   Soyad", "Tarih", "İlaçlar", "Ek Notlar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabloAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(2).setResizable(false);
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(4).setResizable(false);
            tablo.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 920, 230);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("ARA");
        jButton1.setToolTipText("");
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 40, 73, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("SEÇENEKLER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 40, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, -10, 970, 460);

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
doktor1 doktor1=new doktor1();
        setVisible(false);
        doktor1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabloAncestorAdded
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
            java.util.logging.Logger.getLogger(hasta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
