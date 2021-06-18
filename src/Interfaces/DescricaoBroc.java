/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Julio
 */
public class DescricaoBroc extends javax.swing.JFrame {

    /**
     * Creates new form Descricao
     */
    public DescricaoBroc() {
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
        Texto = new javax.swing.JLabel();
        ExcTXT = new javax.swing.JLabel();
        ExecucaoTXT = new javax.swing.JLabel();
        Execucao = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Texto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Texto.setText("<html>\n• Diminui inflamações<br>\n• Ajuda no controle de glicemia<br>\n• Faz bem para o coração<br>\n• Melhora a função cerebral<br>\n• Fortalece os ossos<br>\n• Combate o envelhecimento<br>");
        Texto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TextoPropertyChange(evt);
            }
        });
        getContentPane().add(Texto);
        Texto.setBounds(30, 60, 210, 110);

        ExcTXT.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        ExcTXT.setText("Brócolis");
        getContentPane().add(ExcTXT);
        ExcTXT.setBounds(70, 30, 130, 25);

        ExecucaoTXT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExecucaoTXT.setText("<html>\nCalorias-----------------2,50kcal<br>\nCarb. Líquidos-------------0,10g<br>\nCarboidratos---------------0,44g<br>\nProteínas-------------------0,21g<br>\nGorduras Totais------------0,05g<br>\nGordutas Saturadas-------0,01g<br>\nFibra Alimentar------------0,34g<br>\nSódio-------------------------0,20g<br>");
        getContentPane().add(ExecucaoTXT);
        ExecucaoTXT.setBounds(30, 220, 220, 170);

        Execucao.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        Execucao.setText("Informações Nutricionais");
        getContentPane().add(Execucao);
        Execucao.setBounds(30, 190, 210, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teladeFndo1.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 256, 410);

        setSize(new java.awt.Dimension(272, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TextoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPropertyChange

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
            java.util.logging.Logger.getLogger(DescricaoBroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescricaoBroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescricaoBroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescricaoBroc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescricaoBroc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExcTXT;
    private javax.swing.JLabel Execucao;
    private javax.swing.JLabel ExecucaoTXT;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}