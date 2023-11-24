/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author Tama
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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

        imagePanel = new javax.swing.JPanel();
        lblglassfish = new javax.swing.JLabel();
        lbljavaee = new javax.swing.JLabel();
        lblpostgresql = new javax.swing.JLabel();
        ComboBoxPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihanpilihCard = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblglassfish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblglassfish.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tama\\Music\\glassfish.jpg")); // NOI18N
        imagePanel.add(lblglassfish, "0");

        lbljavaee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljavaee.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tama\\Music\\javaee.jpg")); // NOI18N
        imagePanel.add(lbljavaee, "1");

        lblpostgresql.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpostgresql.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tama\\Music\\postgresql.jpg")); // NOI18N
        imagePanel.add(lblpostgresql, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Pilih Gambar");
        ComboBoxPanel.add(jLabel1);

        pilihanpilihCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glassfish", "JavaEE", "PostgreSQL" }));
        pilihanpilihCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanpilihCardItemStateChanged(evt);
            }
        });
        pilihanpilihCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanpilihCardActionPerformed(evt);
            }
        });
        ComboBoxPanel.add(pilihanpilihCard);

        getContentPane().add(ComboBoxPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanpilihCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanpilihCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanpilihCardActionPerformed

    private void pilihanpilihCardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanpilihCardItemStateChanged
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, String.valueOf(pilihanpilihCard.getSelectedIndex()));
    }//GEN-LAST:event_pilihanpilihCardItemStateChanged

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
                    break;}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboBoxPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblglassfish;
    private javax.swing.JLabel lbljavaee;
    private javax.swing.JLabel lblpostgresql;
    private javax.swing.JComboBox<String> pilihanpilihCard;
    // End of variables declaration//GEN-END:variables
}
