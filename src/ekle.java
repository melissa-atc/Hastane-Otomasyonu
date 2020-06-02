
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ekle extends javax.swing.JFrame {
    DefaultTableModel model;
    Hastane hastaislem= new Hastane();
    
    public ekle(java.awt.Frame parent, boolean modal) {
      super();
      initComponents();
      model = (DefaultTableModel)tablo_ekle.getModel();
      HastaGoruntule();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ara = new javax.swing.JTextField();
        Ekle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_ekle = new javax.swing.JTable();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servis Ekle :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 80, 110, 22);

        ara.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });
        ara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                araKeyReleased(evt);
            }
        });
        jPanel1.add(ara);
        ara.setBounds(210, 80, 190, 30);

        Ekle.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Ekle.setText("Ekle");
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });
        jPanel1.add(Ekle);
        Ekle.setBounds(270, 140, 100, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BAŞARI HASTANESİ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(780, 410, 150, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 180, 100, 30);

        message.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(message);
        message.setBounds(410, 87, 170, 20);

        tablo_ekle.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_ekle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablo_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_ekleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_ekle);
        if (tablo_ekle.getColumnModel().getColumnCount() > 0) {
            tablo_ekle.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 80, 452, 240);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(460, 34, 440, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-50, -100, 1000, 550);
        jLabel1.getAccessibleContext().setAccessibleParent(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        
    }//GEN-LAST:event_araActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        servis servis=new servis();
        setVisible(false);
        servis.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
    
        mesaj_yazisi.setText("");
        String arama =ara.getText();
        hastaislem.ekle(arama);
        HastaGoruntule();
        mesaj_yazisi.setText("Ekleme BAŞARILI!");
    }//GEN-LAST:event_EkleActionPerformed

    private void araKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araKeyReleased

    }//GEN-LAST:event_araKeyReleased

    private void tablo_ekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_ekleMouseClicked
        
    }//GEN-LAST:event_tablo_ekleMouseClicked

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ekle dialog = new ekle(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Ekle;
    private javax.swing.JTextField ara;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel message;
    private javax.swing.JTable tablo_ekle;
    // End of variables declaration//GEN-END:variables
}
