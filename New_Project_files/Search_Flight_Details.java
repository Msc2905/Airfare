import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.JFrame;

public class Search_Flight_Details extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    
    public Search_Flight_Details() {
        initComponents();
        conn=javaconnect.ConnectDb();
        Random();
        Color col=new Color(52,102,255);
        getContentPane().setBackground(col);
        
        
    }
    
     public void Random(){
        Random rd=new Random();
        tno.setText(""+rd.nextInt(1000+1));
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsource = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdestination = new javax.swing.JTextField();
        search_flight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        source = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dtime = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seats = new javax.swing.JSpinner();
        tarea = new java.awt.TextArea();
        home = new javax.swing.JButton();
        bticket = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search Flight Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 18, -1, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Source:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, -1, 39));

        txtsource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsourceActionPerformed(evt);
            }
        });
        getContentPane().add(txtsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 72, 133, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Destination:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 71, 84, 39));

        txtdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinationActionPerformed(evt);
            }
        });
        getContentPane().add(txtdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 72, 137, 39));

        search_flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_flight.setText("Search");
        search_flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_flightActionPerformed(evt);
            }
        });
        getContentPane().add(search_flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 71, -1, 42));

        jTable.setBackground(new java.awt.Color(102, 204, 255));
        jTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight_Id", "Flight_Name", "Source", "Destination", "Date", "Arrival_Time", "Departure_Time", "Flight_Price"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 152, 830, 363));
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 71, 138, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 72, 63, 41));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Flight Id:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 131, 109, 34));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 131, 200, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Flight Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 183, 109, 34));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 183, 200, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Source:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 235, 109, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Destination:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 287, 109, 34));
        getContentPane().add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 235, 200, 34));
        getContentPane().add(dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 287, 200, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 345, 109, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Arrival Time:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 405, 109, -1));
        getContentPane().add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 397, 200, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Departure Time:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 438, -1, 34));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Price:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 485, -1, 34));
        getContentPane().add(dtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 438, 200, 34));
        getContentPane().add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 486, 56, 34));
        getContentPane().add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 345, 200, 34));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Customer Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 594, -1, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ticket No:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 75, 109, 34));
        getContentPane().add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 71, 200, 34));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Seats:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 541, 112, 34));

        seats.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                seatsStateChanged(evt);
            }
        });
        getContentPane().add(seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 542, 200, 34));
        getContentPane().add(tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 594, 200, 62));

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 626, 82, 36));

        bticket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bticket.setText("Book Ticket");
        bticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bticketActionPerformed(evt);
            }
        });
        getContentPane().add(bticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 626, 117, 36));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Total Price:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1104, 485, -1, 34));
        getContentPane().add(tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 486, 96, 34));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Ticket Booking Form");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 22, 192, 39));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 625, -1, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsourceActionPerformed

    private void txtdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinationActionPerformed

    private void search_flightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_flightActionPerformed
        // TODO add your handling code here:
       
       String source=txtsource.getText().toString();
       String destination=txtdestination.getText().toString();
       DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
        String date=da.format(Date.getDate());
       String sql="select * from flight where Source=? and Destination=? and Date=? ";
       try{
           pst=conn.prepareStatement(sql);
            pst.setString(1,source);
             pst.setString(2,destination);
             pst.setString(3,date);
             ResultSet rs=pst.executeQuery();
             
             ResultSetMetaData rsm=rs.getMetaData();
             int c;
             c=rsm.getColumnCount();
             DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
             Df.setRowCount(0);
             while(rs.next()){
                 Vector v2=new Vector();
                 for(int i=1; i<=c; i++){
                     v2.add(rs.getString("Flight_Id"));
                     v2.add(rs.getString("Flight_Name"));
                     v2.add(rs.getString("Source"));
                     v2.add(rs.getString("Destination"));
                     v2.add(rs.getString("Date"));
                     v2.add(rs.getString("Arrival_Time"));
                     v2.add(rs.getString("Departure_Time"));
                     
                     v2.add(rs.getString("Flight_Price"));
                     
                 }
                 Df.addRow(v2);
                 
                 
             }
             
       }
           
       
       catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
        
       
        
    }//GEN-LAST:event_search_flightActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try {
            // TODO add your handling code here:
            
            DefaultTableModel Df=(DefaultTableModel)jTable.getModel();
            int selectIndex=jTable.getSelectedRow();
            fid.setText(Df.getValueAt(selectIndex,0).toString());
            fname.setText(Df.getValueAt(selectIndex,1).toString());
            source.setText(Df.getValueAt(selectIndex,2).toString());
            dest.setText(Df.getValueAt(selectIndex,3).toString());
            java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(Df.getValueAt(selectIndex, 4).toString());
            Date1.setDate(date);
            atime.setText(Df.getValueAt(selectIndex,5).toString());
            dtime.setText(Df.getValueAt(selectIndex,6).toString());
            fprice.setText(Df.getValueAt(selectIndex,7).toString());
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(Search_Flight_Details.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jTableMouseClicked

    private void seatsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_seatsStateChanged
        // TODO add your handling code here:
        int price = Integer.parseInt(fprice.getText());
        
        int qty = Integer.parseInt(seats.getValue().toString()); 
        int tot=price *qty;
        tprice.setText(String.valueOf(tot));
        
        
    }//GEN-LAST:event_seatsStateChanged

    private void bticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bticketActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Payment_Option ob=new Payment_Option();
        ob.setVisible(true);
        DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
        String date=da.format(Date1.getDate());
        String seat=seats.getValue().toString();
                
        try {
            String sql="insert into book_ticket(Ticket_No,Flight_Id,Flight_Name,Source,Destination,Date,Arrival_Time,Departure_Time,Total_Price,Seats,C_Name)values(?,?,?,?,?,?,?,?,?,?,?)";
            
            pst=conn.prepareStatement(sql);
            pst.setString(1, tno.getText());
            pst.setString(2, fid.getText());
            pst.setString(3, fname.getText());
            pst.setString(4, source.getText());
            pst.setString(5, dest.getText());
            pst.setString(6,date);
            pst.setString(7, atime.getText());
            pst.setString(8, dtime.getText());
            pst.setString(9, tprice.getText());
            pst.setString(10,seat);
            pst.setString(11, tarea.getText());
           
            pst.execute();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bticketActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        UserHome ob=new UserHome();
        ob.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Flight_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField atime;
    private javax.swing.JButton bticket;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField dtime;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton search_flight;
    private javax.swing.JSpinner seats;
    private javax.swing.JTextField source;
    private java.awt.TextArea tarea;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField txtdestination;
    private javax.swing.JTextField txtsource;
    // End of variables declaration//GEN-END:variables
}
