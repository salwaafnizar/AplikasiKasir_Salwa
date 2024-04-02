/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author OWNER
 */
public class FormProduk extends javax.swing.JFrame {
Connection koneksi;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form FormProduk
     */
    public FormProduk() {
        initComponents() ;
       koneksi = Koneksi.koneksiDB();
       mulai();
       updateTabel();
}

    public void mulai() {
      txtidproduk.setText("");
      txtnmproduk.setText("");
      txtharga.setText("");
      txtstok.setText("");
}
     public void updateTabel(){
        try{
            String sql = "select * from produk";
             pst = koneksi.prepareStatement(sql);
             rst = pst.executeQuery();
             tblproduk.setModel(DbUtils.resultSetToTableModel(rst));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke tabel di database");
        }
    }
     
      private void simpan() {
         try{
             String sql ="insert into produk (ProdukID,NamaProduk,Harga,Stok) value (?,?,?,?)";
             pst = koneksi.prepareStatement(sql);
             pst.setString(1, txtidproduk.getText());
             pst.setString(2,txtnmproduk.getText());
             pst.setString(3, txtharga.getText());
             pst.setString(4,txtstok.getText ());
             pst.execute();
             JOptionPane.showMessageDialog(null, "Data Tersimpan");
         }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
         }
         updateTabel();
        }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnmproduk = new javax.swing.JTextField();
        txtidproduk = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduk = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        txttanggal = new javax.swing.JTextField();
        txtwaktu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-product-70.png"))); // NOI18N
        jLabel1.setText("INPUT PRODUK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        txtnmproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmprodukActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Produk");

        jLabel3.setText("Nama Produk");

        jLabel4.setText("Harga");

        jLabel5.setText("Stok");

        tblproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblproduk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblprodukAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproduk);

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-20.png"))); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-20.png"))); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-20.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-move-out-20.png"))); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnedit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnmproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidproduk, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkeluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnmproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsimpan)
                            .addComponent(btnedit)
                            .addComponent(btnhapus)
                            .addComponent(btnkeluar))
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnmprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmprodukActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtnmprodukActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
simpan();
mulai();
// TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
try{
    String sql = "delete from produk where ProdukID=?";
    pst = koneksi.prepareStatement(sql);
    pst.setString(1,txtidproduk.getText());
    pst.execute();
     JOptionPane.showMessageDialog(null, "data Berhasil Dihapus");
}catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }  
updateTabel();
mulai(); // TODO add your handling code here:
   //buat prosedur hapus data
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
try{
    String idproduk =txtidproduk.getText();
    String NamaProduk =txtnmproduk.getText();
    String Harga =txtharga.getText();
    String Stok =txtstok.getText();
    
    String sql ="update produk set ProdukID='"+idproduk+"', NamaProduk='"+NamaProduk+"', Harga='"+Harga+"', Stok='"+Stok+"'";
    pst = koneksi.prepareStatement(sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "data Berhasil Diupdate");
}catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate");
        }
updateTabel();
mulai();       // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void tblprodukAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblprodukAncestorAdded
      
// TODO add your handling code here:
    }//GEN-LAST:event_tblprodukAncestorAdded

    private void tblprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprodukMouseClicked
  try{ 
    int baris = tblproduk.getSelectedRow();
    String tabelKlik =(tblproduk.getModel().getValueAt(baris,0).toString());
    String sql = "select * from produk where ProdukID='"+tabelKlik+"'";
    pst = koneksi.prepareStatement(sql);
    rst = pst.executeQuery();
    if (rst.next()){
        String dataidproduk=rst.getString(("ProdukID"));
        txtidproduk.setText(dataidproduk);
        String datanamaproduk =rst.getString(("NamaProduk"));
        txtnmproduk.setText(datanamaproduk);
        String dataharga =rst.getString(("Harga"));
        txtharga.setText(dataharga);
        String datastok =rst.getString(("Stok"));
        txtstok.setText(datastok);
    }
}catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke Tabel di Database");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_tblprodukMouseClicked

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
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblproduk;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidproduk;
    private javax.swing.JTextField txtnmproduk;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}
