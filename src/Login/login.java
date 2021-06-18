package Login;

import Interfaces.IMC;
import javax.swing.JOptionPane;

/**
 *
 * @author BorD
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuário = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Senha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelGoogle = new javax.swing.JLabel();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelEntrarcom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabelEsqueci = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelUsuário.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelUsuário.setForeground(new java.awt.Color(0, 102, 102));
        jLabelUsuário.setText("Usuário");
        getContentPane().add(jLabelUsuário);
        jLabelUsuário.setBounds(90, 90, 70, 40);

        jLabelSenha.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(90, 140, 60, 40);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 340, 160, 20);

        Senha.setToolTipText("senha min. 8 caracteres");
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha);
        Senha.setBounds(90, 170, 160, 30);

        jButtonEntrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(120, 280, 90, 40);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(100, 490, 140, 40);

        jLabelGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/google.png"))); // NOI18N
        getContentPane().add(jLabelGoogle);
        jLabelGoogle.setBounds(100, 400, 90, 50);

        jLabelFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facebook.png"))); // NOI18N
        getContentPane().add(jLabelFacebook);
        jLabelFacebook.setBounds(190, 400, 70, 50);

        jLabelEntrarcom.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        jLabelEntrarcom.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEntrarcom.setText("Entrar com:");
        getContentPane().add(jLabelEntrarcom);
        jLabelEntrarcom.setBounds(130, 370, 80, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/logoComNomePequena.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, -10, 90, 130);

        Usuario.setToolTipText("usuário@email.com");
        Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario);
        Usuario.setBounds(90, 120, 160, 30);

        jLabelEsqueci.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabelEsqueci.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEsqueci.setText("Esqueci minha senha");
        getContentPane().add(jLabelEsqueci);
        jLabelEsqueci.setBounds(100, 240, 140, 20);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teladeFndo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 320, 569);

        setSize(new java.awt.Dimension(336, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // Receber o campo senhaUsuario
    }//GEN-LAST:event_SenhaActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            cadastro tela = new cadastro();
            tela.setVisible(true);         
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
    // Receber o campo entradaUsuario
    }//GEN-LAST:event_UsuarioActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String validarUsuario;
        String validarSenha;
        StringBuilder mensagem = new StringBuilder();
        
        validarUsuario = Usuario.getText();
        validarSenha = Senha.getText();
        
        if (validarUsuario.equals("") && validarSenha.equals("")) {
           mensagem.append("Você deve informar o USUÁRIO e a SENHA!");
           JOptionPane.showMessageDialog(null, mensagem);
        } else 
           if (validarUsuario.equals("")){
           mensagem.append("Você deve informar o USUÁRIO!");
           JOptionPane.showMessageDialog(null, mensagem);
        } else 
           if (validarSenha.equals("")) {
           mensagem.append("Você deve informar a SENHA!");
           JOptionPane.showMessageDialog(null, mensagem);
        }
        
        if(!"".equals(validarUsuario) && !"".equals(validarSenha)){
            IMC calcimc = new IMC();
            calcimc.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField Usuario;
    public javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEntrarcom;
    private javax.swing.JLabel jLabelEsqueci;
    public javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelGoogle;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
