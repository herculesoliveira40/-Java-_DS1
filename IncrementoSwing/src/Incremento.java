/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Your
 */
public class Incremento extends javax.swing.JFrame {

    /**
     * Creates new form Incremento
     */
    public Incremento() {
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
        btnIncremento = new javax.swing.JButton();
        btnDecremento = new javax.swing.JButton();
        btnZerar = new javax.swing.JButton();
        lblNum = new javax.swing.JLabel();
        cbIncremento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Numero +-:");

        btnIncremento.setBackground(new java.awt.Color(204, 255, 204));
        btnIncremento.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnIncremento.setForeground(new java.awt.Color(51, 255, 0));
        btnIncremento.setText("+");
        btnIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncrementoActionPerformed(evt);
            }
        });

        btnDecremento.setBackground(new java.awt.Color(255, 204, 204));
        btnDecremento.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnDecremento.setForeground(new java.awt.Color(255, 0, 0));
        btnDecremento.setText("-");
        btnDecremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecrementoActionPerformed(evt);
            }
        });

        btnZerar.setBackground(new java.awt.Color(0, 204, 204));
        btnZerar.setForeground(new java.awt.Color(0, 0, 255));
        btnZerar.setText("Zerar");
        btnZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarActionPerformed(evt);
            }
        });

        lblNum.setBackground(new java.awt.Color(255, 255, 204));
        lblNum.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        lblNum.setForeground(new java.awt.Color(255, 153, 0));
        lblNum.setText("0");

        cbIncremento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIncrementoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Contador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnZerar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnZerar))
                    .addComponent(btnDecremento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int Num =0;
    
    private void btnIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncrementoActionPerformed

        
     //   Num++;
    //     lblNum.setText(""+Num);
     Incremento();
    }//GEN-LAST:event_btnIncrementoActionPerformed

    private void btnDecrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecrementoActionPerformed
 
   //     Num--;
   //     lblNum.setText(""+Num);
   Decremento();
    }//GEN-LAST:event_btnDecrementoActionPerformed

    private void btnZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarActionPerformed

   //     Num= 0; 
     //   lblNum.setText(""+Num);
     Zerar();
     
    }//GEN-LAST:event_btnZerarActionPerformed

    private void cbIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIncrementoActionPerformed
        // TODO add your handling code here:
      
      //   Num = Num + Integer.parseInt((String) cbIncremento.getSelectedItem()); 
     //   lblNum.setText(""+Num);   
      
    }//GEN-LAST:event_cbIncrementoActionPerformed

    public void Incremento() 
        {       
         Num = Num + Integer.parseInt((String) cbIncremento.getSelectedItem()); 
         lblNum.setText(""+Num);  
        }
   public void Decremento()
        {       
         Num = Num - Integer.parseInt((String) cbIncremento.getSelectedItem()); 
         lblNum.setText(""+Num); 
        }
      public void Zerar()
        {       
         Num=0;
        lblNum.setText(""+Num);
        }                   ////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(Incremento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incremento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incremento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incremento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incremento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecremento;
    private javax.swing.JButton btnIncremento;
    private javax.swing.JButton btnZerar;
    private javax.swing.JComboBox<String> cbIncremento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNum;
    // End of variables declaration//GEN-END:variables
}
