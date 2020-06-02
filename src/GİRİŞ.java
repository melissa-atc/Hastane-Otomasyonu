
import javax.swing.JOptionPane;

public class GİRİŞ extends javax.swing.JFrame {
    public GİRİŞ() {
        initComponents();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        adı = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        şifre = new javax.swing.JPasswordField();
        parola = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("GİRİŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(240, 160, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BAŞARI HASTANESİ SAĞLIKLI GÜNLER DİLER...");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(640, 380, 290, 40);

        adı.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        adı.setForeground(new java.awt.Color(255, 255, 255));
        adı.setText("Kullanıcı Adı:");
        jPanel7.add(adı);
        adı.setBounds(50, 50, 120, 20);

        ad.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        jPanel7.add(ad);
        ad.setBounds(190, 50, 220, 30);

        şifre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        şifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                şifreActionPerformed(evt);
            }
        });
        jPanel7.add(şifre);
        şifre.setBounds(190, 110, 220, 30);

        parola.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        parola.setForeground(new java.awt.Color(255, 255, 255));
        parola.setText("Şifre :");
        jPanel7.add(parola);
        parola.setBounds(120, 110, 140, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("GERİ DÖN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(240, 210, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Melisa\\Desktop\\qweqwe_1609\\en-tehlikeli-4-damar-hastaligi-12585100_3333_amp.jpg")); // NOI18N
        jPanel7.add(jLabel5);
        jLabel5.setBounds(-20, 0, 1010, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String adı=ad.getText();
        String parola=new String (şifre.getPassword());
        String message;
        if(adı.equals("Sekreter")&& parola.equals("12345")){
            message="Hoşgeldiniz ";
             
        bilgiişlem bilgiişlem=new bilgiişlem();
        setVisible(false);
        bilgiişlem.setVisible(true);
        }      else {
            message="Hatalı giriş";
                    
        }
        JOptionPane.showMessageDialog(this, message);
        

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void şifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_şifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_şifreActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
giriş1 giriş1=new giriş1();
        setVisible(false);
        giriş1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
  
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GİRİŞ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JLabel adı;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel parola;
    private javax.swing.JPasswordField şifre;
    // End of variables declaration//GEN-END:variables
}
