
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Add_Flight_Details extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Add_Flight_Details
     */
    public Add_Flight_Details() {
        initComponents();
        conn=javaconnect.ConnectDb();
       // Show_flight_In_JTable();
        Random();
        fetch();
    }
    
    public void Random(){
        Random rd=new Random();
        fid.setText(""+rd.nextInt(1000+1));
        
    }
    public void fetch(){
        try{
            String sql="select * from flight ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel2 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        source = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dtime = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        Add_Flight = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        home = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Flight Id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, 87, 34));
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 97, 169, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Flight Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, -1, 34));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 149, 169, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Source:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, 87, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Destination:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 268, 87, 34));

        source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceActionPerformed(evt);
            }
        });
        getContentPane().add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 216, 169, 34));
        getContentPane().add(dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 268, 169, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 97, 112, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Arrival Time:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 149, 112, 34));
        getContentPane().add(atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 150, 170, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Departure Time:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 215, -1, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Flight price:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 267, 112, 34));
        getContentPane().add(dtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 215, 170, 34));
        getContentPane().add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 267, 170, 34));
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 97, 170, 34));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Id", "Flight Name", "Source", "Destination", "Date", "Arrival Time", "Departure Time", "Flight Price"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 97, 670, 205));

        Add_Flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_Flight.setText("Add");
        Add_Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_FlightActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, -1, -1));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Flight Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 221, 46));

        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }// </editor-fold>//GEN-END:initComponents

    private void Add_FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_FlightActionPerformed
        // TODO add your handling code here:
        DateFormat da=new SimpleDateFormat("yyy-MM-dd");
        String date=da.format(Date.getDate());
        {
        try{
            String sql="insert into flight(Flight_Id,Flight_Name,Source,Destination,Date,Arrival_Time,Departure_Time,Flight_Price)values(?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, fid.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, source.getText());
            pst.setString(4, dest.getText());
            pst.setString(5,date);
            pst.setString(6, atime.getText());
            pst.setString(7, dtime.getText());
            pst.setString(8, fprice.getText());
            
            
            
            pst.execute();
            fetch();
            
             
             
            JOptionPane.showMessageDialog(null, "registered");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }//GEN-LAST:event_Add_FlightActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String sql="DELETE FROM flight WHERE Flight_Id = ?";
        
        
         
        
            try {
                pst=conn.prepareStatement(sql);
                int id = Integer.parseInt(fid.getText());
                 
                    pst.setInt(1, id);
                    pst.executeUpdate();
                     fetch();
                    JOptionPane.showMessageDialog(null, "Flight Details Deleted");
                    
                //if(!fid.getText().equals("Flight_Id")){
                    
                    
                   
                
                 
                 
               
                //PreparedStatement pst = conn.prepareStatement("DELETE FROM flight WHERE Flight_Id = ?");
                //int id = Integer.parseInt(fid.getText());
                //pst.setInt(1, id);
                //pst.executeUpdate();
                
               // }
                //else{
                    //JOptionPane.showMessageDialog(null, "Product Not Deleted : No Id To Delete");
            
        //}
                
                
                
            } 
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            
            
        
        
            
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        DateFormat da=new SimpleDateFormat("yyy-MM-dd");
        String date=da.format(Date.getDate());
        try{
            String sql="update flight set Flight_Name=?, Source=?, Destination=?, Date=?, Arrival_Time=?, Departure_Time=?, Flight_Price=? where Flight_Id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(8, fid.getText());
            pst.setString(1, fname.getText());
            pst.setString(2, source.getText());
            pst.setString(3, dest.getText());
            pst.setString(4,date);
            pst.setString(5, atime.getText());
            pst.setString(6, dtime.getText());
            pst.setString(7, fprice.getText());
            pst.executeUpdate();
             fetch();
            JOptionPane.showMessageDialog(null,"Update Successful");
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String sql="select * from flight where Flight_Id=?";
        try{
             pst=conn.prepareStatement(sql);
             pst.setString(1, fid.getText());
             rs=pst.executeQuery();
             if(rs.next()){
                 String add1=rs.getString("Flight_Name");
                 fname.setText(add1);
                 String add2=rs.getString("Source");
                 source.setText(add2);
                 String add3=rs.getString("Destination");
                 dest.setText(add3);
                 String Dob=rs.getString("Date");
                java.util.Date date1 =   new SimpleDateFormat("yyyy-MM-dd").parse(Dob);
                Date.setDate(date1);
                String add5=rs.getString("Arrival_Time");
                atime.setText(add5);
                String add6=rs.getString("Departure_Time");
                dtime.setText(add6);
                String add7=rs.getString("Flight_Price");
                fprice.setText(add7);
             }else{
                JOptionPane.showMessageDialog(null, "This flght id not registered");

            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home ob=new Home();
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
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Flight_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Flight_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Flight;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JTextField atime;
    private javax.swing.JTextField dest;
    private javax.swing.JTextField dtime;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField source;
    // End of variables declaration//GEN-END:variables
}
