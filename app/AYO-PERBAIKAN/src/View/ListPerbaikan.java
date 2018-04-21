/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inialdan
 */
public class ListPerbaikan extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = Koneksi.KoneksiDB.getkoneksi();
    
    public ListPerbaikan() throws SQLException{
        initComponents();
        judul();
        tampilData();
        setLocationRelativeTo(null);
        btnSelesai.setEnabled(false);
        tbId.setEnabled(false);
        tbMataPelajaran.setEnabled(false);
        tbJenisPerbaikan.setEnabled(false);
        tbKegiatanPerbaikan.setEnabled(false);
        tbStatus.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelPerbaikan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerbaikan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tbId = new javax.swing.JTextField();
        tbMataPelajaran = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tbJenisPerbaikan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbKegiatanPerbaikan = new javax.swing.JTextField();
        tbStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSelesai = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPerbaikan = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("SMK Wikrama Bogor T.P 2016/2017");

        jLabel1.setText("JURNAL KEGIATAN PROSES PERBAIKAN NILAI AKADEMIK DAN NON AKADEMIK");

        panelPerbaikan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "List Perbaikan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tblPerbaikan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPerbaikan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerbaikanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerbaikan);

        javax.swing.GroupLayout panelPerbaikanLayout = new javax.swing.GroupLayout(panelPerbaikan);
        panelPerbaikan.setLayout(panelPerbaikanLayout);
        panelPerbaikanLayout.setHorizontalGroup(
            panelPerbaikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerbaikanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPerbaikanLayout.setVerticalGroup(
            panelPerbaikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerbaikanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Id");

        jLabel4.setText("Mata Pelajaran");

        jLabel5.setText("Jenis Perbaikan");

        jLabel6.setText("Kegiatan Perbaikan");

        tbKegiatanPerbaikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKegiatanPerbaikanActionPerformed(evt);
            }
        });

        jLabel7.setText("Status");

        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuPerbaikan.setText("Perbaikan");
        menuPerbaikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerbaikanActionPerformed(evt);
            }
        });
        jMenu1.add(menuPerbaikan);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        menubar.add(jMenu1);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbMataPelajaran, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbJenisPerbaikan)
                                    .addComponent(tbId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tbKegiatanPerbaikan))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPerbaikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelPerbaikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbMataPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbJenisPerbaikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbKegiatanPerbaikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSelesai)
                                .addComponent(btnRefresh))
                            .addComponent(btnReset))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void judul(){
        Object[] judul = {"Id", "Mata Pelajaran","Jenis Perbaikan","Kegiatan Perbaikan","Status"};
        tabModel = new DefaultTableModel(null, judul);
        tblPerbaikan.setModel(tabModel);
    }
    public void reset(){
        tbId.setText("");
        tbMataPelajaran.setText("");
        tbJenisPerbaikan.setText("");
        tbKegiatanPerbaikan.setText("");
        tbStatus.setText("");
        btnSelesai.setEnabled(false);
        btnReset.setEnabled(false);
    }
    
    public void tampilData() throws SQLException{
        try{
            st = cn.createStatement();
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        rs = st.executeQuery("Select * from tbPerbaikan");
        
            while(rs.next()){
                Object[] data = {
                rs.getString("id"),
                rs.getString("matapelajaran"),
                rs.getString("jenisperbaikan"),
                rs.getString("kegiatanperbaikan"),
                rs.getString("status")
            };
                tabModel.addRow(data);
            }
        } catch(Exception e){
            e.printStackTrace();
        }    
    }
    
    private void tbKegiatanPerbaikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKegiatanPerbaikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbKegiatanPerbaikanActionPerformed

    private void tblPerbaikanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerbaikanMouseClicked
        // TODO add your handling code here:
        tbId.setText(tabModel.getValueAt
        (tblPerbaikan.getSelectedRow(), 0) + "");

        tbMataPelajaran.setText(tabModel.getValueAt
        (tblPerbaikan.getSelectedRow(), 1) + "");
        
        tbJenisPerbaikan.setText(tabModel.getValueAt
        (tblPerbaikan.getSelectedRow(), 2) + "");
        
        tbKegiatanPerbaikan.setText(tabModel.getValueAt
        (tblPerbaikan.getSelectedRow(), 3) + "");
        
        tbStatus.setText(tabModel.getValueAt
        (tblPerbaikan.getSelectedRow(), 3) + "");

        
        btnSelesai.setEnabled(true);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_tblPerbaikanMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement();
            st.executeUpdate("UPDATE tbPerbaikan set "
                + "status='Selesai'"
                + "WHERE id='" + tabModel.getValueAt
                (tblPerbaikan.getSelectedRow(), 0) + "'");
            tampilData();
            reset();
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_exitActionPerformed

    private void menuPerbaikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerbaikanActionPerformed
        // TODO add your handling code here:
        try {
            FormUtama pindah = new FormUtama();
            pindah.setVisible(true);
            //this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(ListPerbaikan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuPerbaikanActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            tampilData();
        } catch (SQLException ex) {
            Logger.getLogger(ListPerbaikan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(ListPerbaikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPerbaikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPerbaikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPerbaikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListPerbaikan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListPerbaikan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuPerbaikan;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JPanel panelPerbaikan;
    private javax.swing.JTextField tbId;
    private javax.swing.JTextField tbJenisPerbaikan;
    private javax.swing.JTextField tbKegiatanPerbaikan;
    private javax.swing.JTextField tbMataPelajaran;
    private javax.swing.JTextField tbStatus;
    private javax.swing.JTable tblPerbaikan;
    // End of variables declaration//GEN-END:variables
}
