/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mon_aigle;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Hoang Phuc
 */
public class QuanLySach extends javax.swing.JFrame {

    /**
     * Creates new form ThemSach
     */
    String sqlServer = "localhost";
    String port = "1433";
    String user = "sa1";
    String passWord = "123";
    String database = "QuanLyThuVien";
    String url = "jdbc:sqlserver://" + sqlServer + ":" + port + ";user=" + user + ";password=" + passWord + ";databaseName=" + database + ";encrypt=false";

    public QuanLySach() {
        setTitle("Quản lý sách");
        setLocation(400, 100);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDsach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtGiaSach = new javax.swing.JTextField();
        txtNamPH = new javax.swing.JTextField();
        btnThemSach = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSLsach = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnXoaSach = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimSach = new javax.swing.JButton();
        txtTheLoai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID sách");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên sách");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Giá mượn sách");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Năm xuất bản");

        txtIDsach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTenSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtGiaSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNamPH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNamPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamPHActionPerformed(evt);
            }
        });

        btnThemSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThemSach.setText("Thêm sách");
        btnThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSachActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Số lượng sách");

        txtSLsach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Thể loại sách");

        btnXoaSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoaSach.setText("Xóa sách");
        btnXoaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSachActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimSach.setText("Tìm sách");
        btnTimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSachActionPerformed(evt);
            }
        });

        txtTheLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTheLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDsach)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTheLoai)
                            .addComponent(txtSLsach)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(txtGiaSach, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamPH, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDsach, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(btnThemSach, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGiaSach, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNamPH)
                    .addComponent(btnTimSach, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSLsach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateForm() {
        if (txtIDsach.getText().equals("")) {
            System.out.println("id ko để trống");
            return false;
        }
        if (txtTenSach.getText().equals("")) {
            System.out.println("tên ko để trống");
            return false;
        }
        if (txtGiaSach.getText().equals("")) {
            System.out.println("giá ko để trống");
            return false;
        }
        try {
            int x = Integer.parseInt(txtGiaSach.getText());
            if (x < 1000) {
                System.out.println("giá trên 1000");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("giá là số");
            return false;
        }
        if (txtNamPH.getText().equals("")) {
            System.out.println("năm phát hành ko để trống");
            return false;
        }
        try {
            int x = Integer.parseInt(txtNamPH.getText());
            if (x < 0) {
                System.out.println("năm phát hành số dương");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("năm phát hành là số");
            return false;
        }
        if (txtSLsach.getText().equals("")) {
            System.out.println("số lượng trống");
            return false;
        }
        try {
            int x = Integer.parseInt(txtSLsach.getText());
            if (x < 0) {
                System.out.println("số lượng phải là số dương");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("số lượng là số");
            return false;
        }
        if (txtTheLoai.getText().equals("")) {
            System.out.println("Thể loại trống");
            return false;
        }
        return true;
    }

    private String timTheoID(String ID) throws SQLException {
        // 2. Open connection
        String idSach = "";
        try (Connection con = DriverManager.getConnection(url)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlSelect = "SELECT * FROM [QuanLyThuVien].[dbo].[QuanLySach] where IDsach='" + ID + "'";
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                idSach = rs.getString("IDsach");
                // print the results
                System.out.format("%s\n", idSach);
            }
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
        if (idSach.equals("")) {
            return null;
        } else {
            return idSach;
        }
    }

    void ThemSach() throws SQLException {
        String idSach = txtIDsach.getText();
        String tenSach = txtTenSach.getText();
        String giaMuon = txtGiaSach.getText();
        String namPhatHanh = txtNamPH.getText();
        String soLuong = txtSLsach.getText();
        String theLoai = txtTheLoai.getText();
        // 2. Open connection
        try (Connection con = DriverManager.getConnection(url)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlInsert = "INSERT INTO QuanLySach(IDsach, TenSach, GiaMuon, NamXuatBan, SoLuong, TheLoai) VALUES ('" + idSach + "', N'" + tenSach + "', '" + giaMuon + "', '" + namPhatHanh + "', '" + soLuong + "', N'" + theLoai + "')";
            ResultSet rs = st.executeQuery(sqlInsert);
            while (rs.next()) {

            }
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
    }

    void xoaSach(String ID) throws SQLException {
        // 2. Open connection
        try (Connection con = DriverManager.getConnection(url)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlDelete = "DELETE FROM QuanLySach WHERE IDsach ='" + ID + "'";
            ResultSet rs = st.executeQuery(sqlDelete);
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
            clearForm();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
    }

    void loadDataToForm(String ID) throws SQLException {
        // 2. Open connection
        try (Connection con = DriverManager.getConnection(url)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlSelect = "SELECT * FROM QuanLySach WHERE IDsach='" + ID + "'";
            ResultSet rs = st.executeQuery(sqlSelect);
            while (rs.next()) {
                txtIDsach.setText(rs.getString("IDsach"));
                txtTenSach.setText(rs.getString("TenSach"));
                txtGiaSach.setText(rs.getString("GiaMuon"));
                txtNamPH.setText(rs.getString("NamXuatBan"));
                txtSLsach.setText(rs.getString("SoLuong"));
                txtTheLoai.setText(rs.getString("TheLoai"));
            }
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
    }

    void update(String ID) throws SQLException {
        String tenSach = txtTenSach.getText();
        String giaMuon = txtGiaSach.getText();
        String namPhatHanh = txtNamPH.getText();
        String soLuong = txtSLsach.getText();
        String theLoai = txtTheLoai.getText();
        // 2. Open connection
        try (Connection con = DriverManager.getConnection(url)) {
            // 3. Create Statement
            Statement st = con.createStatement();
            // 4. Execute query
            String sqlUpdate = "UPDATE QuanLySach SET TenSach=N'" + tenSach + "', GiaMuon='" + giaMuon + "', NamXuatBan='" + namPhatHanh + "', SoLuong='" + soLuong + "', TheLoai=N'" + theLoai + "' WHERE IDsach='" + ID + "'";
            ResultSet rs = st.executeQuery(sqlUpdate);
            rs.close();
            st.close();
            // 5. Close connection
            con.close();
        } catch (SQLServerException e) {
            System.out.println(e);
        }
    }

    private void clearForm() {
        txtIDsach.setText("");
        txtTenSach.setText("");
        txtGiaSach.setText("");
        txtNamPH.setText("");
        txtTheLoai.setText("");
        txtSLsach.setText("");
    }
    private void txtNamPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamPHActionPerformed

    }//GEN-LAST:event_txtNamPHActionPerformed

    private void btnThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSachActionPerformed
        if (validateForm()) {
            try {
                if (timTheoID(txtIDsach.getText()) == null) {
                    ThemSach();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemSachActionPerformed

    private void txtTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTheLoaiActionPerformed

    private void btnTimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSachActionPerformed
        String x = JOptionPane.showInputDialog("Nhập ID sách: ");
        try {
            if (timTheoID(x) == null) {
                System.out.println("ko tìm thấy sách");
            } else {
                loadDataToForm(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimSachActionPerformed

    private void btnXoaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSachActionPerformed
        String x = JOptionPane.showInputDialog("Nhập ID sách");
        try {
            if (timTheoID(x) != null) {
                xoaSach(x);
            } else {
                System.out.println("ko tìm thấy sách");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaSachActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (validateForm()) {
            try {
                if (timTheoID(txtIDsach.getText()) != null) {
                    update(txtIDsach.getText());
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        new MenuThuThu().show();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimSach;
    private javax.swing.JButton btnXoaSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtGiaSach;
    private javax.swing.JTextField txtIDsach;
    private javax.swing.JTextField txtNamPH;
    private javax.swing.JTextField txtSLsach;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
