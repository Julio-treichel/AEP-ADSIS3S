package Login;

import javax.swing.JOptionPane;

public class cadastro extends javax.swing.JFrame {

    public cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelSenha2 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldSenha2 = new javax.swing.JPasswordField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLogoCadastro = new javax.swing.JLabel();
        jLabelFundoCadastro = new javax.swing.JLabel();

        jDialog1.setTitle("Cadastro efetuado com sucesso!");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextFieldNome.setToolTipText("digite o seu primeiro nome");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(60, 100, 210, 30);

        jTextFieldSobrenome.setToolTipText("digite seu sobrenome");
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome);
        jTextFieldSobrenome.setBounds(60, 150, 210, 30);

        jTextFieldEmail.setToolTipText("digite seu e-mail");
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(60, 320, 210, 30);

        jLabelCadastro.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(0, 102, 102));
        jLabelCadastro.setText("Cadastro");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(100, 30, 130, 40);

        jLabelSobrenome.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSobrenome.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSobrenome.setText("Sobrenome");
        getContentPane().add(jLabelSobrenome);
        jLabelSobrenome.setBounds(60, 130, 140, 20);

        jLabelNome.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 102, 102));
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(60, 70, 110, 25);

        jLabelDN.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelDN.setText("Data de nascimento");
        getContentPane().add(jLabelDN);
        jLabelDN.setBounds(40, 190, 200, 25);

        jLabelEmail.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(60, 290, 60, 30);

        jLabelSenha.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha.setText("Confirme a senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(60, 410, 200, 25);

        jLabelSenha2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSenha2.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha2.setText("Senha");
        getContentPane().add(jLabelSenha2);
        jLabelSenha2.setBounds(60, 350, 80, 25);

        jComboBoxDia.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(40, 220, 60, 20);

        jComboBoxMes.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO", " " }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(100, 220, 100, 20);

        jComboBoxAno.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2021", "2020", "2019", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2007", "2006", "2004", "2003", "2002", "2001", "2000", "1998", "1997", "1995", "1994", "1992", "1991", "1989", "1987", "1985", "1984", "1982", "1980", "1979", "1976", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1965", "1964", "1963", "1962", "1960", "1959", "1958", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", " " }));
        jComboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAno);
        jComboBoxAno.setBounds(200, 220, 90, 20);

        jPasswordFieldSenha.setToolTipText("digite a senha novamente");
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(60, 440, 210, 30);

        jPasswordFieldSenha2.setToolTipText("digite sua senha");
        getContentPane().add(jPasswordFieldSenha2);
        jPasswordFieldSenha2.setBounds(60, 380, 210, 30);

        jButtonVoltar.setBackground(new java.awt.Color(0, 204, 204));
        jButtonVoltar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/seta.png"))); // NOI18N
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(10, 10, 20, 30);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCadastrar.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(80, 500, 160, 35);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(60, 260, 200, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 550, 200, 20);

        jLabelLogoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/logoSemNome_1.png"))); // NOI18N
        getContentPane().add(jLabelLogoCadastro);
        jLabelLogoCadastro.setBounds(230, 0, 85, 70);

        jLabelFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teladeFndo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoCadastro);
        jLabelFundoCadastro.setBounds(0, 0, 320, 569);

        setSize(new java.awt.Dimension(336, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
       // Enviar ao banco o mesNascUsuario
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jComboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoActionPerformed
       // Enviar ao banco o anoNascUsuario
    }//GEN-LAST:event_jComboBoxAnoActionPerformed
    
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
           StringBuilder mensagem = new StringBuilder();
           mensagem.append("Cadastrado com sucesso!");
           JOptionPane.showMessageDialog(null, mensagem);
           // enviar ao banco o cadastro
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // Obter o Nome do usuario
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed
        // Obter o Sobrenome do usuario
    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        login back = new login();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelEmail;
    public javax.swing.JLabel jLabelFundoCadastro;
    private javax.swing.JLabel jLabelLogoCadastro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenha2;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
