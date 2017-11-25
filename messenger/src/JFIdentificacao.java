public class JFIdentificacao extends javax.swing.JFrame {
    
    public JFIdentificacao() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSeuNome = new javax.swing.JTextField();
        txtSeuNumero = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Usuário");

        jPanel1.setBackground(new java.awt.Color(52, 175, 35));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel2.setText("Número:");

        txtSeuNome.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N

        txtSeuNumero.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        txtSeuNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeuNumeroActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setAlignmentY(0.0F);
        btnEntrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Lucida Console", 0, 11)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(new javax.swing.border.MatteBorder(null));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSeuNome, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(txtSeuNumero)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSeuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSeuNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (!txtSeuNome.getText().isEmpty() && !txtSeuNumero.getText().isEmpty()) {

            if (txtSeuNumero.getText().charAt(0) == '9'
                    && Integer.parseInt(txtSeuNumero.getText().substring(1, 9)) >= 10000000
                    && Integer.parseInt(txtSeuNumero.getText().substring(1, 9)) <= 99999999) {

                WhatsApp whats = new WhatsApp();
                
                whats.setNomeUser(txtSeuNome.getText());
                whats.setTelUser(txtSeuNumero.getText());
                
                JFGUI abrir = new JFGUI();
                
                abrir.setWhats(whats);

                abrir.setLblSeuNome(whats.getNomeUser());
                abrir.setVisible(true);
                this.setVisible(false);

            } else {

                txtSeuNumero.setText("Número inválido!");
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSeuNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeuNumeroActionPerformed

        if (!txtSeuNome.getText().isEmpty() && !txtSeuNumero.getText().isEmpty()) {

            if (txtSeuNumero.getText().charAt(0) == '9'
                    && Integer.parseInt(txtSeuNumero.getText().substring(1, 9)) >= 10000000
                    && Integer.parseInt(txtSeuNumero.getText().substring(1, 9)) <= 99999999) {

                WhatsApp whats = new WhatsApp();
                whats.setNomeUser(txtSeuNome.getText());
                whats.setTelUser(txtSeuNumero.getText());
                
                JFGUI abrir = new JFGUI();
                
                abrir.setWhats(whats);

                abrir.setLblSeuNome(whats.getNomeUser());
                abrir.setVisible(true);
                this.setVisible(false);

            } else {

                txtSeuNumero.setText("Número inválido!");
            }
        }
    }//GEN-LAST:event_txtSeuNumeroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSeuNome;
    private javax.swing.JTextField txtSeuNumero;
    // End of variables declaration//GEN-END:variables
}
