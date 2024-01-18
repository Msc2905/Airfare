
public class Payment_Option extends javax.swing.JFrame {

    
    public Payment_Option() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Debit_Card = new javax.swing.JButton();
        Credit_Card = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 330));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Debit_Card.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Debit_Card.setText("Debit Card");
        Debit_Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debit_CardActionPerformed(evt);
            }
        });
        jPanel2.add(Debit_Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 111, -1, 35));

        Credit_Card.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Credit_Card.setText("Credit Card");
        Credit_Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Credit_CardActionPerformed(evt);
            }
        });
        jPanel2.add(Credit_Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 111, -1, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Paytment Option");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 160, 34));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 520, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Credit_CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Credit_CardActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Credit_Card ob=new Credit_Card();
        ob.setVisible(true);
    }//GEN-LAST:event_Credit_CardActionPerformed

    private void Debit_CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debit_CardActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Debit_Card ob= new Debit_Card();
        ob.setVisible(true);
        
    }//GEN-LAST:event_Debit_CardActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Credit_Card;
    private javax.swing.JButton Debit_Card;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
