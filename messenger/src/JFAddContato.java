
import java.util.Vector;

public class JFAddContato extends javax.swing.JFrame {

    JFGUI gui;

    public JFAddContato(JFGUI gui) {
        initComponents();
        this.gui = gui;
    }

    private JFAddContato() {
    }

    private boolean isTelefoneValid() {

        return txtNumContato.getText().charAt(0) == '9'
                && Integer.parseInt(txtNumContato.getText().substring(1, 9)) >= 10000000
                && Integer.parseInt(txtNumContato.getText().substring(1, 9)) <= 99999999
                && !txtNumContato.equals(gui.whats.getTelUser());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeContato = new javax.swing.JTextField();
        txtNumContato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Contato");

        txtNomeContato.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        txtNumContato.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        txtNumContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumContatoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel5.setText("Número");

        btnCancelar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumContato, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(txtNomeContato)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Conversa conv = new Conversa();
        conv.setTelefone(txtNumContato.getText());
        conv.setContato(txtNomeContato.getText());

        gui.whats.conv.add(conv);

        Vector<String> vect = new Vector();

        for (int i = 0; i < gui.whats.conv.size(); i++) {

            vect.add(gui.whats.conv.get(i).getContato());
        }

        vect.add(txtNomeContato.getText());
        gui.getListContatos().setListData(vect);
        this.setVisible(false);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNumContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumContatoActionPerformed

        Conversa conv = new Conversa();
        conv.setTelefone(txtNumContato.getText());
        conv.setContato(txtNomeContato.getText());

        gui.whats.conv.add(conv);

        Vector<String> vect = new Vector();

        for (int i = 0; i < gui.whats.conv.size(); i++) {

            vect.add(gui.whats.conv.get(i).getContato());
        }
        
        gui.getListContatos().setListData(vect);
        this.setVisible(false);
    }//GEN-LAST:event_txtNumContatoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtNumContato;
    // End of variables declaration//GEN-END:variables
}
