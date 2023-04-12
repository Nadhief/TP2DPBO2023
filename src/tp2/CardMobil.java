/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tp2;

//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class CardMobil extends javax.swing.JPanel {

    private dbConnection db;
    private Boolean isUpdate = true;
    private int selectedID;
    private Home home;
    private String mobil;
    private String plat;
    private String merk;
    private String jenis;
    private File Putu;
 
    /**
     * Creates new form Card
     */
    public CardMobil(int id, String mobil, String plat, String merk, String jenis, Home homes){
        initComponents();
        db = new dbConnection();
        this.selectedID = id;
        this.home = homes;
        this.mobil = mobil;
        this.plat = plat;
        this.merk = merk;
        this.jenis = jenis;
        setDisplay();
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
        labelMobil = new javax.swing.JLabel();
        jb_Ubah = new javax.swing.JButton();
        jButton_Hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPlat = new javax.swing.JLabel();
        labelMerk = new javax.swing.JLabel();
        labelJenis = new javax.swing.JLabel();
        LabelGambar = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Mobil");

        labelMobil.setText("Nama Mobil");
        labelMobil.setName("nama Mobil"); // NOI18N

        jb_Ubah.setText("Ubah");
        jb_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_UbahActionPerformed(evt);
            }
        });

        jButton_Hapus.setText("Hapus");
        jButton_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusActionPerformed(evt);
            }
        });

        jLabel2.setText("Plat Nomer");

        jLabel3.setText("Merk Mobil");

        jLabel4.setText("Jenis Mobil");

        labelPlat.setText("Plat Nomer");
        labelPlat.setName("nama Mobil"); // NOI18N

        labelMerk.setText("Merk Mobil");
        labelMerk.setName("nama Mobil"); // NOI18N

        labelJenis.setText("Jenis Mobil");
        labelJenis.setName("nama Mobil"); // NOI18N

        LabelGambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jb_Ubah)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labelPlat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelMobil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Hapus)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelMobil))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlat)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelMerk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelJenis))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Ubah)
                    .addComponent(jButton_Hapus))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_UbahActionPerformed
        InsertMobil rg = new InsertMobil(this.isUpdate, this.selectedID, this.home);
         rg.setVisible(true);
         rg.pack();
         rg.setLocationRelativeTo(null);
         rg.setDefaultCloseOperation(InsertMobil.EXIT_ON_CLOSE);// TODO add your handling code here:
    }//GEN-LAST:event_jb_UbahActionPerformed

    // untuk menampilkan data yang ada dalam database
    public void setDisplay(){
        labelMobil.setText(mobil);
        labelPlat.setText(plat);
        labelMerk.setText(merk);
        labelJenis.setText(jenis);
        try{
            String sql = "SELECT * FROM mobil WHERE id_mobil = '"+this.selectedID+"'";
            ResultSet res = db.selectQuery(sql);
            while(res.next()){
                BufferedImage fileImg = null;
                this.Putu = new File("src/immmages/"+res.getString("gambar"));
                fileImg = ImageIO.read(this.Putu);
                Image dimg = fileImg.getScaledInstance(170, 120,Image.SCALE_SMOOTH);
                LabelGambar.setIcon(new javax.swing.ImageIcon(dimg));
            }            
        }catch(SQLException|IOException e){
            System.out.println(e.getMessage());
        }
    }
    

    // untuk delete data
    public void deleteData() {

            // Delete Data in Database
            String sql = "DELETE FROM mobil WHERE id_mobil=" + this.selectedID;
            if(Putu != null) Putu.delete();
            int affectedRow = db.updateQuery(sql);
            if (affectedRow > 0) {
                // Show Information
                JOptionPane.showMessageDialog(null, "data berhasil dihapus"); 
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus!");
            }
    }
    
    private void jButton_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusActionPerformed
        // TODO add your handling code here:
        deleteData();
        this.home.refreshpanel();
    }//GEN-LAST:event_jButton_HapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelGambar;
    private javax.swing.JButton jButton_Hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_Ubah;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelMerk;
    private javax.swing.JLabel labelMobil;
    private javax.swing.JLabel labelPlat;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

