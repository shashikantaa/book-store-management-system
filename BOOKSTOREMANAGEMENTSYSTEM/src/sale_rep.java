
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class sale_rep extends javax.swing.JFrame {
    int lastid;
    /**
     * Creates new form TOI
     */
    public sale_rep() {
        initComponents();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        jTextField2.setText(formatter.format(date) );
        getlastid();
        jPanel2.setVisible(false);
        
    }
    
     
      public void getlastid()
    {
          Connection con=null;
        String url="jdbc:mysql://localhost:3306/shi";
        String driver="com.mysql.jdbc.Driver";
               // "com.mysql.jdbc.Driver";
       // String dbname="sdb";
        String user="root";
        String pass="root";
       
         
         try {  
              Class.forName(driver);           
            con= DriverManager.getConnection(url,user,pass); 
           String retri = "Select (SALEID) from sell";
            Statement st = con.createStatement();
           
           ResultSet rs = st.executeQuery(retri);
            
            if(rs.next())
            {
                lastid = rs.getInt(1);
                System.out.print(lastid);
              
            }
          con.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SALES REPORTS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(jLabel2)
                .addContainerGap(519, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SALEID");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLICK HERE TO SHOW ALL DATA");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SALEID", "BOOK ID ", "BOOK NAME", "CUSTOMER NAME", "MOBILE", "DATE", "QUANTITY", "PRICE", "DISCOUNT", "BALANCE"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("SEARCH BY DATE");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("PRINT");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("CLOSE");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton5FocusGained(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jButton4)
                .addGap(439, 439, 439)
                .addComponent(jButton5))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton2)
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               Connection con=null;
        String url="jdbc:mysql://localhost:3306/shi";
        String driver="com.mysql.jdbc.Driver";
               // "com.mysql.jdbc.Driver";
       // String dbname="sdb";
        String user="root";
        String pass="root";
         if(jTextField1.getText().equals(""))
                 {
                     jLabel1.setText("Enter valid ID");
                 }
        int bid,c;
        bid= Integer.parseInt(jTextField1.getText());
         try {          
            Class.forName(driver);           
            con= DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            String sql="select * from sell where SALEID = '"+bid+"' ";
            ResultSet rs= st.executeQuery(sql);
            for(c=0;rs.next();c++);
            if (c==0)
            { 
                jLabel1.setText("Record Not Found...");           
            }
            else
            {
              rs= st.executeQuery(sql);
              //jTable1.;
            while(rs.next()){
                String SALEID= String.valueOf(rs.getInt("SALEID"));
                String BOOKID= String.valueOf(rs.getInt("BOOKID"));
                String BOOKNAME= rs.getString("BOOKNAME");
                 String CUSTOMERNAME= rs.getString("CUSTOMERNAME");
                 String MOBILE= rs.getString("MOBILE");
                 String DATE= rs.getString("DATE");               
                  String QUANTITY= String.valueOf(rs.getInt("QUANTITY"));
                  String PRICE= String.valueOf(rs.getInt("PRICE"));
                  String DISCOUNT= rs.getString("DISCOUNT");
                  String BALANCE= rs.getString("BALANCE");
                  
                String tbData[]={SALEID,BOOKID,BOOKNAME,CUSTOMERNAME,MOBILE,DATE,QUANTITY,PRICE,DISCOUNT,BALANCE};
                 DefaultTableModel tblModel= ( DefaultTableModel)jTable1.getModel();
                  tblModel.addRow(tbData);
                  jPanel2.setVisible(true);
                  
                 tblModel.setRowCount(lastid);
            }
             }
            con.close();
         }
        catch(Exception e){           
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
      jLabel1.setText(""); 
          DefaultTableModel tblModel= ( DefaultTableModel)jTable1.getModel();
          tblModel.setRowCount(0);   
    }//GEN-LAST:event_jTextField1FocusGained

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
     DefaultTableModel tbl1Model= ( DefaultTableModel)jTable1.getModel();
          tbl1Model.setRowCount(0);   
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                  Connection con=null;
        String url="jdbc:mysql://localhost:3306/shi";
        String driver="com.mysql.jdbc.Driver";
               // "com.mysql.jdbc.Driver";
       // String dbname="sdb";
        String user="root";
        String pass="root";
        int c;
        //jPanel2.setVisible(false);
        
         try {          
            Class.forName(driver);           
            con= DriverManager.getConnection(url,user,pass);
            //int c;
            Statement st = con.createStatement();
            String sql="select * from sell ";
            ResultSet rs1= st.executeQuery(sql);
             //.removeAll();
             
            while(rs1.next())
            {
                String SALEID= String.valueOf(rs1.getInt("SALEID"));
                String BOOKID= String.valueOf(rs1.getInt("BOOKID"));
                String BOOKNAME= rs1.getString("BOOKNAME");
                 String CUSTOMERNAME= rs1.getString("CUSTOMERNAME");
                 String MOBILE= rs1.getString("MOBILE");
                 String DATE= rs1.getString("DATE");               
                  String QUANTITY= String.valueOf(rs1.getInt("QUANTITY"));
                  String PRICE= String.valueOf(rs1.getInt("PRICE"));
                  String DISCOUNT= rs1.getString("DISCOUNT");
                  String BALANCE= rs1.getString("BALANCE");
                    
                String tblData[]={SALEID,BOOKID,BOOKNAME,CUSTOMERNAME,MOBILE,DATE,QUANTITY,PRICE,DISCOUNT,BALANCE};
                 DefaultTableModel tbleModel= ( DefaultTableModel)jTable1.getModel();
               //  tbleModel.setRowCount(0);
                 tbleModel.addRow(tblData);
                 jPanel2.setVisible(true);
             // jPanel2.resetKeyboardActions();
            }
             
            // tbleModel.addRow(tblData);
            
            con.close();
         }
        catch(Exception e){           
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
        DefaultTableModel tbleModel= ( DefaultTableModel)jTable1.getModel();
                 tbleModel.setRowCount(0); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               Connection con=null;
        String url="jdbc:mysql://localhost:3306/shi";
        String driver="com.mysql.jdbc.Driver";
               // "com.mysql.jdbc.Driver";
       // String dbname="sdb";
        String user="root";
        String pass="root";
         if(jTextField2.getText().equals(""))
                 {
                     jLabel1.setText("Enter valid ID");
                 }
        int c;
        //bid= IjTextField2.getText());
         try {          
            Class.forName(driver);           
            con= DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            String sql="select * from sell where DATE = '"+jTextField2.getText()+"'";
            ResultSet rs2= st.executeQuery(sql);
            for(c=0;rs2.next();c++);
            if (c==0)
            { 
                jLabel1.setText("Record Not Found...");           
            }
            else
            {
              rs2= st.executeQuery(sql);
             
            while(rs2.next()){
                String SALEID= String.valueOf(rs2.getInt("SALEID"));
                String BOOKID= String.valueOf(rs2.getInt("BOOKID"));
                String BOOKNAME= rs2.getString("BOOKNAME");
                 String CUSTOMERNAME= rs2.getString("CUSTOMERNAME");
                 String MOBILE= rs2.getString("MOBILE");
                 String DATE= rs2.getString("DATE");               
                  String QUANTITY= String.valueOf(rs2.getInt("QUANTITY"));
                  String PRICE= String.valueOf(rs2.getInt("PRICE"));
                  String DISCOUNT= rs2.getString("DISCOUNT");
                  String BALANCE= rs2.getString("BALANCE");
                  
                String tbbData[]={SALEID,BOOKID,BOOKNAME,CUSTOMERNAME,MOBILE,DATE,QUANTITY,PRICE,DISCOUNT,BALANCE};
                 DefaultTableModel tbl1Model= ( DefaultTableModel)jTable1.getModel();
                  tbl1Model.addRow(tbbData);
                  jPanel2.setVisible(true);
                  
            }
             }
            con.close();
         }
        catch(Exception e){           
            e.printStackTrace();
        }
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
     jLabel1.setText(""); 
     DefaultTableModel tbl1Model= ( DefaultTableModel)jTable1.getModel();
          tbl1Model.setRowCount(0);   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              try{
           jTable1.print();
       }
       catch(PrinterException ex)
       {
          jLabel1.setText("");
       }
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5FocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(sale_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sale_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sale_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sale_rep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sale_rep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
