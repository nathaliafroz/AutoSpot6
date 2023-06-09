/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import com.sun.glass.events.KeyEvent;
import negocio.Veiculo;
import persistencia.ControlaVeiculo;
import java.time.LocalTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author S.I
 */
public class Cadastro extends javax.swing.JInternalFrame {

    ControlaVeiculo cv = new ControlaVeiculo();
    
    public Cadastro() {
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

        jPanel1 = new javax.swing.JPanel();
        lblVeiculo = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField() {
            @Override
            protected javax.swing.text.Document createDefaultModel() {
                return new javax.swing.text.PlainDocument() {
                    @Override
                    public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws javax.swing.text.BadLocationException {
                        super.insertString(offs, str.toUpperCase(), a);
                    }
                };
            }
        };
        txtSaida = new javax.swing.JFormattedTextField();
        txtEntrada = new javax.swing.JFormattedTextField();
        bntCadastrar = new javax.swing.JButton();
        lblPlaca1 = new javax.swing.JLabel();
        cbVeiculo = new javax.swing.JComboBox<>();
        lblVaga = new javax.swing.JLabel();
        txtVaga = new javax.swing.JTextField();
        bntVerTodos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Veículo");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblVeiculo.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 24)); // NOI18N
        lblVeiculo.setText("VEICULO:");

        lblEntrada.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 24)); // NOI18N
        lblEntrada.setText("ENTRADA:");

        lblSaida.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 24)); // NOI18N
        lblSaida.setText("SAIDA:");

        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        try {
            txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaidaKeyPressed(evt);
            }
        });

        try {
            txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntradaKeyPressed(evt);
            }
        });

        bntCadastrar.setText("CADASTRAR");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        lblPlaca1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 24)); // NOI18N
        lblPlaca1.setText("PLACA:");

        cbVeiculo.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 18)); // NOI18N
        cbVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARRO", "MOTO" }));

        lblVaga.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 24)); // NOI18N
        lblVaga.setText("VAGA:");

        bntVerTodos.setText("Ver Todos");
        bntVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVerTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVeiculo)
                            .addComponent(lblVaga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbVeiculo, 0, 148, Short.MAX_VALUE)
                            .addComponent(txtVaga)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(328, 328, 328))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(bntVerTodos)
                .addGap(40, 40, 40)
                .addComponent(bntCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntVerTodos)
                    .addComponent(bntCadastrar))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
     //LIMITE DE CARACTERES ACEITOS:   
    int maxCharacters = 7; // Define o número máximo de caracteres permitidos
    if (txtPlaca.getText().length() >= maxCharacters) {
        evt.consume(); // Impede que o caractere seja inserido
    }
    
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyPressed
        // TODO add your handling code here:
        
        // clicar enter e passar para proximo campo
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEntrada.requestFocus();            //informação de qual campo ele vai parar quando clicar no enter
        }
    }//GEN-LAST:event_txtPlacaKeyPressed

    private void txtEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyPressed
        // TODO add your handling code here:
        // clicar enter e passar para proximo campo
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtSaida.requestFocus();            //informação de qual campo ele vai parar quando clicar no enter
        }
    }//GEN-LAST:event_txtEntradaKeyPressed

    private void txtSaidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaidaKeyPressed
        // TODO add your handling code here:
        // clicar enter e passar para proximo campo
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            bntCadastrar.requestFocus();            //informação de qual campo ele vai parar quando clicar no enter
        }
    }//GEN-LAST:event_txtSaidaKeyPressed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        // TODO add your handling code here:
        Veiculo veiculo = new Veiculo();
        
        veiculo.setPlaca(txtPlaca.getText());
        //CODIGO DE TESTE:
        veiculo.setVaga(txtVaga.getText());
        veiculo.setTipo((String)cbVeiculo.getSelectedItem());
        
        
        
        //codigo NOVO calculo de horas
        
        Object entradaValue = txtEntrada.getValue();
        Object saidaValue = txtSaida.getValue();

if (entradaValue != null && saidaValue != null) {
    String entradaStr = entradaValue.toString();
    String saidaStr = saidaValue.toString();

    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    LocalTime entrada = LocalTime.parse(entradaStr, formatter);
    LocalTime saida = LocalTime.parse(saidaStr, formatter);
    
 Duration duracao;
if (saida.isBefore(entrada)) {
    // Ajusta a saída para considerar a passagem da meia-noite
    duracao = Duration.between(entrada, LocalTime.MAX).plus(Duration.between(LocalTime.MIN, saida));
} else {
    duracao = Duration.between(entrada, saida);
}

long horasEstacionado = duracao.toMinutes();
veiculo.setHorasEstacionado(horasEstacionado);

// para ver se enviar a hora de entrada e saida para o jtable

         veiculo.setEntrada(entrada);
         veiculo.setSaida(saida);
        



    
}
        
        //-------------------------
        if(cv.salvar(veiculo)){
            JOptionPane.showMessageDialog(null,"Veiculo cadastrado com sucesso.");
            txtPlaca.setText("");
            txtVaga.setText("");
            //novo
            txtEntrada.setValue("");
            txtSaida.setValue("");
            txtVaga.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar veículo.");
        }
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void bntVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVerTodosActionPerformed
        // TODO add your handling code here:
        DlgMostraVeiculos dlg = new DlgMostraVeiculos(null, true, cv);
        dlg.setVisible(true);
        
    }//GEN-LAST:event_bntVerTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton bntVerTodos;
    private javax.swing.JComboBox<String> cbVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JLabel lblVaga;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JFormattedTextField txtSaida;
    private javax.swing.JTextField txtVaga;
    // End of variables declaration//GEN-END:variables
}
