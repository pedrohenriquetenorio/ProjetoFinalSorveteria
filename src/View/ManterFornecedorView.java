/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.FornecedorDAO;
import Model.DAO.FuncionarioDAO;
import Model.FornecedorModel;
import Model.FuncionarioModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author pedro
 */
public class ManterFornecedorView extends javax.swing.JFrame {

    /**
     * Creates new form ManterFornecedor
     * 
     * 
     * 
     */
    
    public ManterFornecedorView() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFornecedorCNPJ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFornecedorNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedorTabela = new javax.swing.JTable();
        jButtonFornecedorPesquisar = new javax.swing.JButton();
        jTextFieldPesquisaFornecedor = new javax.swing.JTextField();
        jButtonFornecedorSalvar = new javax.swing.JButton();
        jButtonFornecedorAlterar = new javax.swing.JButton();
        jButtonFornecedorExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFornecedorTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFornecedorEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigoFornecedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CNPJ");

        jTextFieldFornecedorCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorCNPJActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jTextFieldFornecedorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorNomeActionPerformed(evt);
            }
        });

        jTableFornecedorTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CNPJ", "Nome", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFornecedorTabela);
        if (jTableFornecedorTabela.getColumnModel().getColumnCount() > 0) {
            jTableFornecedorTabela.getColumnModel().getColumn(0).setMinWidth(40);
            jTableFornecedorTabela.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableFornecedorTabela.getColumnModel().getColumn(4).setMinWidth(60);
            jTableFornecedorTabela.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jButtonFornecedorPesquisar.setText("Pesquisar");
        jButtonFornecedorPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorPesquisarActionPerformed(evt);
            }
        });

        jButtonFornecedorSalvar.setText("Salvar");
        jButtonFornecedorSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorSalvarActionPerformed(evt);
            }
        });

        jButtonFornecedorAlterar.setText("Alterar");
        jButtonFornecedorAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorAlterarActionPerformed(evt);
            }
        });

        jButtonFornecedorExcluir.setText("Excluir");
        jButtonFornecedorExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        jLabel6.setText("Email");

        jLabel3.setText("Código");

        jTextFieldCodigoFornecedor.setEnabled(false);
        jTextFieldCodigoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoFornecedorActionPerformed(evt);
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
                        .addComponent(jButtonFornecedorSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFornecedorAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFornecedorExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonFornecedorPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1))
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldFornecedorCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldFornecedorTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                    .addComponent(jTextFieldFornecedorNome)
                                    .addComponent(jTextFieldFornecedorEmail)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFornecedorCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFornecedorTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFornecedorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFornecedorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFornecedorPesquisar)
                    .addComponent(jTextFieldPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFornecedorSalvar)
                    .addComponent(jButtonFornecedorAlterar)
                    .addComponent(jButtonFornecedorExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void jTextFieldFornecedorCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorCNPJActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldFornecedorCNPJActionPerformed

    private void jTextFieldFornecedorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorNomeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldFornecedorNomeActionPerformed

    private void jButtonFornecedorSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorSalvarActionPerformed
        // variaveis onde serão atribuidos os valores do objeto 
        String cnpj, nome, telefone, email, codigo; 
        
        FornecedorModel ObjetoFornecedor = new FornecedorModel();
        
        //valores que serão salvo no banco de dados,  
        ObjetoFornecedor.setCnpj(jTextFieldFornecedorCNPJ.getText().trim());
        ObjetoFornecedor.setNomeFantasia(jTextFieldFornecedorNome.getText().trim());
        ObjetoFornecedor.setTelefone (jTextFieldFornecedorTelefone.getText().trim());
        ObjetoFornecedor.setEmail(jTextFieldFornecedorEmail.getText().trim());
 
        //Verificação de objeto 
        System.out.println(ObjetoFornecedor+"DENTRO DA VIEW");
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.Salvar(ObjetoFornecedor);
        
        // Atribui valores vazios 
        jTextFieldCodigoFornecedor.setText("");
        jTextFieldFornecedorCNPJ.setText("");
        jTextFieldFornecedorEmail.setText("");
        jTextFieldFornecedorNome.setText("");
        jTextFieldFornecedorTelefone.setText("");
        // coloca o cursor no CNPJ
        jTextFieldFornecedorCNPJ.requestFocus();
        
        // processo de adicionar na jTable
        DefaultTableModel val = (DefaultTableModel)jTableFornecedorTabela.getModel();
        
        codigo = Integer.toString(ObjetoFornecedor.getCodFornecedor());
        cnpj = ObjetoFornecedor.getCnpj();
        nome = ObjetoFornecedor.getNomeFantasia();
        email = ObjetoFornecedor.getEmail();
        telefone = ObjetoFornecedor.getTelefone();
        
        //adiciona na jTable os valores 
        val.addRow(new String[] {codigo,cnpj, nome, email, telefone});
       
    }//GEN-LAST:event_jButtonFornecedorSalvarActionPerformed

    private void jButtonFornecedorPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorPesquisarActionPerformed
        // TODO add your handling code here:
        int valorId;
       
        FornecedorModel fornecedor = new FornecedorModel();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        
        //valor = Integer.parseInt(jTextIdFuncionario.getText());
        
        valorId = Integer.parseInt(jTextFieldPesquisaFornecedor.getText()); 
        fornecedor = fornecedorDAO.Buscar(valorId);
        
        //*teste de retorno*
        System.out.println("Teste de parametro : "+valorId);
        
//        String dados = (String) jTableFornecedorTabela.getValueAt(valorId, 0);
         
        //System.out.println(fornecedor.getCnpj());
        //valorId = Integer.parseInt(dados);
        
        String codigoString = Integer.toString(fornecedor.getCodFornecedor());
        jTextFieldCodigoFornecedor.setText(codigoString);
        jTextFieldFornecedorCNPJ.setText(fornecedor.getCnpj());
        jTextFieldFornecedorEmail.setText(fornecedor.getEmail());
        jTextFieldFornecedorNome.setText(fornecedor.getNomeFantasia());
        jTextFieldFornecedorTelefone.setText(fornecedor.getTelefone());
        
       
    }//GEN-LAST:event_jButtonFornecedorPesquisarActionPerformed

    private void jButtonFornecedorAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorAlterarActionPerformed
       
        
        
    }//GEN-LAST:event_jButtonFornecedorAlterarActionPerformed

    private void jButtonFornecedorExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorExcluirActionPerformed
      
        int variavel, variavel2;
        DefaultTableModel val = (DefaultTableModel)jTableFornecedorTabela.getModel();
        
         FornecedorDAO fornecedorDAO = new FornecedorDAO();
         FornecedorModel fornecedorModel = new FornecedorModel();
         
         variavel = jTableFornecedorTabela.getSelectedRow();
         
         // se retornar -1 quer dizer que esta vazio
         if(variavel == -1){
             JOptionPane.showMessageDialog(null, "Selecione um campo na tabela");
         }else{
            
             jTextFieldCodigoFornecedor.setText((String) jTableFornecedorTabela.getValueAt(variavel, 0));
             variavel2 = Integer.parseInt(jTextFieldCodigoFornecedor.getText());
             
             //remove linha da tabela 
             val.removeRow(jTableFornecedorTabela.getSelectedRow());
             // remove linha no banco de dados
             fornecedorDAO.excluir(variavel2);
             
             System.out.println(variavel);
         }
         
         //int codFuncionario = Integer.parseInt(jTextFieldFornecedorCNPJ.getText());
        
    }//GEN-LAST:event_jButtonFornecedorExcluirActionPerformed

    private void jTextFieldCodigoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFornecedorActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodigoFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(ManterFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterFornecedorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFornecedorAlterar;
    private javax.swing.JButton jButtonFornecedorExcluir;
    private javax.swing.JButton jButtonFornecedorPesquisar;
    private javax.swing.JButton jButtonFornecedorSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedorTabela;
    private javax.swing.JTextField jTextFieldCodigoFornecedor;
    private javax.swing.JTextField jTextFieldFornecedorCNPJ;
    private javax.swing.JTextField jTextFieldFornecedorEmail;
    private javax.swing.JTextField jTextFieldFornecedorNome;
    private javax.swing.JTextField jTextFieldFornecedorTelefone;
    private javax.swing.JTextField jTextFieldPesquisaFornecedor;
    // End of variables declaration//GEN-END:variables
}
