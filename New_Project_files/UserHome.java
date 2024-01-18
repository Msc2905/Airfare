
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public UserHome() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        mbMain = new JMenuBar();
        
        mnuUser = new JMenu("User");
        
        miSearchFlight = new JMenuItem("Search Flight");
        miBookTicket = new JMenuItem("Book Ticket");
        miCancelTicket = new JMenuItem("Cancel Ticket");
        miViewTickets = new JMenuItem("View Tickets");
        miDeletedTickets = new JMenuItem("Deleted Tickets");;
        miPrintTicket = new JMenuItem("Print Ticket");
        miBackToLogin = new JMenuItem("Back to Login");
        miExit = new JMenuItem("Exit");

        mnuUser.add(miSearchFlight);
        mnuUser.add(miBookTicket);
        mnuUser.add(miCancelTicket);
        mnuUser.add(miViewTickets);
        mnuUser.add(miDeletedTickets);
        mnuUser.add(miPrintTicket);
        mnuUser.add(miBackToLogin);
        mnuUser.addSeparator();
        mnuUser.add(miExit);
        
        mbMain.add(mnuUser);
        
        jLabel1 = new javax.swing.JLabel();
        Add_Flight = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Ticket_Cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        search_flight = new javax.swing.JButton();
        back_to_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airp (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        setJMenuBar(mbMain);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
/*
        Add_Flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_Flight.setText("Add Flight");
        Add_Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_FlightActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 102, -1, 32));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Book Ticket");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 102, -1, 32));

        Ticket_Cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ticket_Cancel.setText("Ticket Cancel");
        Ticket_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ticket_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Ticket_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 102, -1, 32));

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 166, -1, 32));

        search_flight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_flight.setText("Search Flight Details");
        search_flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_flightActionPerformed(evt);
            }
        });
        getContentPane().add(search_flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 166, -1, 32));

        back_to_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_to_login.setText("Back to login page");
        back_to_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_loginActionPerformed(evt);
            }
        });
        getContentPane().add(back_to_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 166, -1, 32));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("View Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 244, 120, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("View Deleted Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 244, 190, -1));
*/
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Welcome To Airfare !!!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 13, 411, 32));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(2000, 800));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 2500, 800));

        pack();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		
		miSearchFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jButton5ActionPerformed(ae);
			}
		});

		miBookTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jButton5ActionPerformed(ae);
			}
		});

		miCancelTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Ticket_CancelActionPerformed(ae);
			}
		});

		miViewTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jButton1ActionPerformed(ae);
			}
		});
		
		miDeletedTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jButton2ActionPerformed(ae);
			}
		});
		
		miBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				back_to_loginActionPerformed(ae);
			}
		});

		miPrintTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new ViewTicket(Integer.parseInt(JOptionPane.showInputDialog("Enter Ticket No:")));
			}
		});

    }// </editor-fold>//GEN-END:initComponents

    private void Add_FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_FlightActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Add_Flight_Details ob=new Add_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_Add_FlightActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Search_Flight_Details ob=new Search_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Ticket_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ticket_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Cancel_Flight_Ticket ob=new Cancel_Flight_Ticket();
        ob.setVisible(true);
    }//GEN-LAST:event_Ticket_CancelActionPerformed

    private void back_to_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_loginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_back_to_loginActionPerformed

    private void search_flightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_flightActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Search_Flight_Details ob=new Search_Flight_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_search_flightActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

new viewtickets().setVisible(true);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Deletedtickets().setVisible(true);
        

   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Flight;
    private javax.swing.JButton Ticket_Cancel;
    private javax.swing.JButton back_to_login;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton search_flight;
    // End of variables declaration//GEN-END:variables
    private JMenuBar mbMain;
    private JMenuItem miSearchFlight,miBookTicket,miCancelTicket,miViewTickets,miDeletedTickets,miPrintTicket;
    private JMenuItem miBackToLogin;
    private JMenuItem miExit;
    private JMenu mnuUser;
}
