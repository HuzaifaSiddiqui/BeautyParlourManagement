/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beauty_Parlour;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Huzzu
 */
public class Customer_Report extends javax.swing.JFrame {

    Connection con=null;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    public Customer_Report() {
        initComponents();
        
        this.setLocationRelativeTo(null);
         
        table.getTableHeader().setFont(new Font("Calibari", Font.BOLD, 18));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(51,204,255));
        table.getTableHeader().setForeground(new Color(36,47,65));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        combo = new javax.swing.JComboBox<>();
        d = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));

        table.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setFocusable(false);
        table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table.setRowHeight(26);
        table.setSelectionBackground(new java.awt.Color(255, 102, 102));
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        combo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        combo.setForeground(new java.awt.Color(36, 47, 65));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Customer ID", "Full Name", "Age", " " }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(214, 217, 223));
        d.setFont(new java.awt.Font("Calibri", 0, 23)); // NOI18N
        d.setForeground(new java.awt.Color(36, 47, 65));
        d.setBorder(null);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View by:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Value to Serach:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CUSTOMER  REPORT");

        jButton18.setBackground(new java.awt.Color(36, 47, 65));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_25px.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton18.setPreferredSize(new java.awt.Dimension(35, 27));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(36, 47, 65));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Undo_125px.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton19.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Back:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(139, 139, 139)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton17.setBackground(new java.awt.Color(36, 47, 65));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_25px.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton17.setPreferredSize(new java.awt.Dimension(35, 27));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(636, 636, 636)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillByID (JTable table, String ValueToSearch)
    {
        con=connectClass.ConnectDb();
        try{
        
        ps=con.prepareStatement("Select * from Customers where (Customer_ID || First_Name || Last_Name || Contact_No || Age || Email || Address || Comments) like '%"+ValueToSearch+"%'");
        rs=ps.executeQuery();
        
        DefaultTableModel dm=(DefaultTableModel)table.getModel();
        
        Object[] row;
        
        while(rs.next()){
            row=new Object[7];
            row[0]=rs.getInt(1);
            row[1]=rs.getString(2)+" "+rs.getString(3);
            row[2]=rs.getString(4);
            row[3]=rs.getInt(5);
            row[4]=rs.getString(6);
            row[5]=rs.getString(7);
            row[6]=rs.getString(8);
            
            dm.addRow(row);
        }
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void fillByFullName (JTable table, String ValueToSearch)
    {
        con=connectClass.ConnectDb();
        try{
        
        ps=con.prepareStatement("Select * from Customers where (Customer_ID || First_Name || Last_Name || Contact_No || Age || Email || Address || Comments) like '%"+ValueToSearch+"%' order by First_Name");
        rs=ps.executeQuery();
        
        DefaultTableModel dm=(DefaultTableModel)table.getModel();
        
        Object[] row;
        
        while(rs.next()){
            row=new Object[7];
            row[0]=rs.getString(2)+" "+rs.getString(3);
            row[1]=rs.getInt(1);
            
            row[2]=rs.getString(4);
            row[3]=rs.getInt(5);
            row[4]=rs.getString(6);
            row[5]=rs.getString(7);
            row[6]=rs.getString(8);
            
            dm.addRow(row);
        }
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void fillByAge (JTable table, String ValueToSearch)
    {
        con=connectClass.ConnectDb();
        try{
        
        ps=con.prepareStatement("Select * from Customers where (Customer_ID || First_Name || Last_Name || Contact_No || Age || Email || Address || Comments) like '%"+ValueToSearch+"%' order by Age");
        rs=ps.executeQuery();
        
        DefaultTableModel dm=(DefaultTableModel)table.getModel();
        
        Object[] row;
        
        while(rs.next()){
            row=new Object[7];
           
            
           row[0]=rs.getInt(5);
            row[1]=rs.getInt(5);
            row[2]=rs.getString(2)+" "+rs.getString(3);
            row[3]=rs.getString(4);
            row[4]=rs.getString(6);
            row[5]=rs.getString(7);
            row[6]=rs.getString(8);
            
            dm.addRow(row);
        }
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        if(combo.getSelectedItem()=="-Select-")
        {
            d.setText(null);
            d.setEnabled(false);
            DefaultTableModel dm= (DefaultTableModel)table.getModel();
            dm.setColumnCount(0);
            dm.setRowCount(0);
        }
        if(combo.getSelectedItem()=="Customer ID")
        {
            d.setText(null);
            d.setEnabled(true);
            DefaultTableModel dm= (DefaultTableModel)table.getModel();

            dm.setColumnCount(0);
            dm.setRowCount(0);
            dm.addColumn("Customer ID");
            dm.addColumn("Full Name");
            dm.addColumn("Contact No");
            dm.addColumn("Age");
            dm.addColumn("Email");
            dm.addColumn("Address");
            dm.addColumn("Comment");

            fillByID(table, "");

            TableRowSorter<DefaultTableModel> sort=new TableRowSorter<DefaultTableModel>(dm);
            table.setRowSorter(sort);

        }
        if(combo.getSelectedItem()=="Full Name")
        {

            d.setText(null);
            d.setEnabled(true);
            DefaultTableModel dm= (DefaultTableModel)table.getModel();
            dm.setColumnCount(0);
            dm.setRowCount(0);
            dm.addColumn("Full Name");
            dm.addColumn("Customer ID");
            dm.addColumn("Contact No");
            dm.addColumn("Age");
            dm.addColumn("Email");
            dm.addColumn("Address");
            dm.addColumn("Comment");

            fillByFullName(table, "");

            TableRowSorter<DefaultTableModel> sort=new TableRowSorter<DefaultTableModel>(dm);
            table.setRowSorter(sort);

        }
        if(combo.getSelectedItem()=="Age")
        {
            d.setText(null);d.setEnabled(true);
            DefaultTableModel dm= (DefaultTableModel)table.getModel();
            dm.setColumnCount(0);
            dm.setRowCount(0);
            dm.addColumn("Age");
            dm.addColumn("Full Name");
            dm.addColumn("Customer ID");
            dm.addColumn("Contact No");
            dm.addColumn("Email");
            dm.addColumn("Address");
            dm.addColumn("Comment");

            fillByAge(table, "");

            TableRowSorter<DefaultTableModel> sort=new TableRowSorter<DefaultTableModel>(dm);
            table.setRowSorter(sort);

        }
        
    }//GEN-LAST:event_comboActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void dKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyPressed

    }//GEN-LAST:event_dKeyPressed

    private void dKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyReleased
        DefaultTableModel tab=(DefaultTableModel)table.getModel();
        String q=d.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tab);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(q));

        //table.setModel(new DefaultTableModel());
        //fill(table, d.getText());

    }//GEN-LAST:event_dKeyReleased

    private void dKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyTyped

    }//GEN-LAST:event_dKeyTyped

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        dispose();
        Main_Module mm=new Main_Module();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField d;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
