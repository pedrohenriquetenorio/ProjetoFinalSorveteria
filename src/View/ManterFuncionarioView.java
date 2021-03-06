/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.text.BadLocationException;
//import javax.swing.text.PlainDocument;
import View.AlterarFuncionarioView;
import Model.DAO.FuncionarioDAO;
import Model.FuncionarioModel;
//import java.text.ParseException;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
//import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author pedro
 */
public class ManterFuncionarioView extends javax.swing.JFrame {

    private List<FuncionarioModel> listaDeFuncionario;
    /**
     * Creates new form ManterFuncionarioView
     */
    private FuncionarioDAO funcionarioDAO;

    public ManterFuncionarioView() {
        initComponents();

        // Inicializa as validações de letras e numeros
        
        //Apenas Letras
        jTextFieldFuncionarioNome.setDocument(new ApenasLetras());
        jTextFieldFuncionarioPesquisar.setDocument(new ApenasLetras());
        
        //Limite de Caracteres 
        jTextFieldFuncionarioEmail.setDocument(new Limite(50));
        jTextFieldFuncionarioEndereco.setDocument(new Limite(80));
        
        jTextFieldFuncionarioSenha.setDocument(new Limite(20));
        

    }
    
    public void limpaTabela(){
    
             jTextFieldFuncionarioCPF.setText("");
            jTextFieldFuncionarioNome.setText("");
            jTextFieldFuncionarioEmail.setText("");
            jTextFieldFuncionarioEndereco.setText("");
            jTextFieldFuncionarioSenha.setText("");
            jTextFieldFuncionarioTelefone.setText("");
            
            jTextFieldFuncionarioCPF.requestFocus();
        
    }

    public final class ApenasLetras extends PlainDocument {

        @Override
        public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
                throws BadLocationException {

            super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);// ACEITA SOMENTE LETRAS
            jTextFieldFuncionarioNome.setDocument(new Limite(50));
            jTextFieldFuncionarioPesquisar.setDocument(new Limite(50));
        }

    }
    
   public final class Limite extends PlainDocument {

    private final int limite;

  public Limite(int limite) {
    this.limite = limite;
  }

  @Override
  public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limite) {
      super.insertString(offs, str, a);
    }
  }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarioTabela = new javax.swing.JTable();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldFuncionarioPesquisar = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldFuncionarioCPF = new javax.swing.JFormattedTextField();
        jComboBoxFuncionarioCargo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFuncionarioNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFuncionarioEmail = new javax.swing.JTextField();
        jTextFieldFuncionarioTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFuncionarioSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFuncionarioEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Funcionário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableFuncionarioTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Email", "Senha", "Cargo", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarioTabela);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Cadastrar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquisar Nome");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            jTextFieldFuncionarioCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldFuncionarioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFuncionarioCPFActionPerformed(evt);
            }
        });

        jComboBoxFuncionarioCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Administrador" }));

        jLabel8.setText("Cargo");

        jLabel1.setText("CPF");

        jTextFieldFuncionarioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFuncionarioNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel6.setText("Email");

        try {
            jTextFieldFuncionarioTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Telefone");

        jTextFieldFuncionarioSenha.setText(" ");

        jLabel3.setText("Senha");

        jTextFieldFuncionarioEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFuncionarioEnderecoActionPerformed(evt);
            }
        });

        jLabel7.setText("Endereço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldFuncionarioSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFuncionarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldFuncionarioEndereco)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldFuncionarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFuncionarioCargo, 0, 223, Short.MAX_VALUE))
                            .addComponent(jTextFieldFuncionarioEmail)
                            .addComponent(jTextFieldFuncionarioNome))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxFuncionarioCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFuncionarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldFuncionarioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionarioTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFuncionarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionarioEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFuncionarioPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(197, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFuncionarioPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jButtonSalvar.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFuncionarioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFuncionarioNomeActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextFieldFuncionarioNomeActionPerformed

    private void atualizaTabelaFuncionario(List<FuncionarioModel> funcionarios) {

        DefaultTableModel val = (DefaultTableModel) jTableFuncionarioTabela.getModel();
        val.setNumRows(0); // excluir os registros que estão na JTable
        listaDeFuncionario = funcionarios;

        if (jTableFuncionarioTabela != null) {

            listaDeFuncionario.forEach((funcionario) -> {
                String codigo = Integer.toString(funcionario.getCodFuncionario());
                val.addRow(new Object[]{codigo, funcionario.getCpf(), funcionario.getNome(), funcionario.getEmail(), funcionario.getSenha(), funcionario.getCargo(), funcionario.getEndereco(), funcionario.getTelefone()});
            });
        }
    }


    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        String cpf, email, endereco, nome, senha, telefone, cargo, validacaoCPF;

        FuncionarioModel ObjetoFuncionario = new FuncionarioModel();
        FuncionarioDAO ObjetoFuncionarioDAO = new FuncionarioDAO();

        cargo = (String) jComboBoxFuncionarioCargo.getSelectedItem();
        ObjetoFuncionario.setCpf(jTextFieldFuncionarioCPF.getText());
        ObjetoFuncionario.setEmail(jTextFieldFuncionarioEmail.getText());
        ObjetoFuncionario.setEndereco(jTextFieldFuncionarioEndereco.getText());
        ObjetoFuncionario.setNome(jTextFieldFuncionarioNome.getText());
        ObjetoFuncionario.setSenha(jTextFieldFuncionarioSenha.getText());
        ObjetoFuncionario.setTelefone(jTextFieldFuncionarioTelefone.getText());
        ObjetoFuncionario.setCargo(cargo);

        //Validação de cadastro 
        validacaoCPF = ObjetoFuncionario.getCpf();
        
        //Passa o paremetro para verificar o cpf
        
       
        String botaoCadastro = "botaocadastro";
        String mensagem = tabelaDados(botaoCadastro);

        if (!"Usuario já cadastrado no sistema!".equals(mensagem)) {

            ObjetoFuncionarioDAO.salvarFuncionario(ObjetoFuncionario);

            // Atribui valores vazios 
            // jTextFieldCodFuncionario.setText("");
            limpaTabela();

            DefaultTableModel val = (DefaultTableModel) jTableFuncionarioTabela.getModel();

            String codigo = Integer.toString(ObjetoFuncionario.getCodFuncionario());
            cpf = ObjetoFuncionario.getCpf();
            nome = ObjetoFuncionario.getNome();
            email = ObjetoFuncionario.getEmail();
            telefone = ObjetoFuncionario.getTelefone();
            senha = ObjetoFuncionario.getSenha();
            endereco = ObjetoFuncionario.getEndereco();
            cargo = ObjetoFuncionario.getCargo();

            //adiciona na jTable os valores 
            val.addRow(new String[]{codigo, cpf, nome, email, senha, cargo, endereco, telefone});
        } else {

            JOptionPane.showMessageDialog(null, mensagem);
            limpaTabela();

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String botaopesquisa = "botaopesquisa";
        jTextFieldFuncionarioPesquisar.setText("");
        tabelaDados(botaopesquisa);

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private String tabelaDados(String pesquisa) {
        int tamanhos = jTableFuncionarioTabela.getRowCount();
        int i;

        //String dado = jTextFieldFuncionarioPesquisar.getText();
        // 
        if ("botaopesquisa".equals(pesquisa)) {
            for (i = 0; i < tamanhos; i++) {

                String retornaNome = (String) jTableFuncionarioTabela.getValueAt(i, 2);
                jTableFuncionarioTabela.setRowSelectionInterval(i, i);
                if (retornaNome.equals(jTextFieldFuncionarioPesquisar.getText())) {

                    return retornaNome;

                }
            }

        } else if ("botaocadastro".equals(pesquisa)) {
            for (i = 0; i < tamanhos; i++) {

                String retornaCpf = (String) jTableFuncionarioTabela.getValueAt(i, 1);
                if (retornaCpf.equals(jTextFieldFuncionarioCPF.getText())) {

                    retornaCpf = "Usuario já cadastrado no sistema!";
                    return retornaCpf;

                }
            }
        }
        return "nenhum dado";
    }

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        int item;
        String cpf, nome, email, senha, endereco, telefone, cargo, id;
        item = jTableFuncionarioTabela.getSelectedRow();

        if (item == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um campo na tabela");
        } else {

            AlterarFuncionarioView altera = new AlterarFuncionarioView();
            FuncionarioModel ObjetoFuncionario = new FuncionarioModel();

            // pegando valores de um item da tabela para fazer a alteração!
            id = (String) jTableFuncionarioTabela.getValueAt(item, 0);
            int inteiro = Integer.valueOf(id);
            cpf = (String) jTableFuncionarioTabela.getValueAt(item, 1);
            nome = (String) jTableFuncionarioTabela.getValueAt(item, 2);
            email = (String) jTableFuncionarioTabela.getValueAt(item, 3);
            senha = (String) jTableFuncionarioTabela.getValueAt(item, 4);
            cargo = (String) jTableFuncionarioTabela.getValueAt(item, 5);
            endereco = (String) jTableFuncionarioTabela.getValueAt(item, 6);
            telefone = (String) jTableFuncionarioTabela.getValueAt(item, 7);

            ObjetoFuncionario.setCpf(cpf);
            ObjetoFuncionario.setEmail(email);
            ObjetoFuncionario.setEndereco(endereco);
            ObjetoFuncionario.setNome(nome);
            ObjetoFuncionario.setSenha(senha);
            ObjetoFuncionario.setTelefone(telefone);
            //ObjetoFuncionario.setCargo(cargos);
            ObjetoFuncionario.setCargo(cargo);
            ObjetoFuncionario.setCodFuncionario(inteiro);

            altera.dadosFuncionario(id, cpf, nome, endereco, email, telefone, cargo, senha);

            altera.setVisible(true);
            dispose();

        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int valorInteiro;
        int variavel;
        DefaultTableModel val = (DefaultTableModel) jTableFuncionarioTabela.getModel();

        FuncionarioDAO excluirFuncionarioDAO = new FuncionarioDAO();

        variavel = jTableFuncionarioTabela.getSelectedRow();
        // pega o conteudo 
        String a = (String) jTableFuncionarioTabela.getValueAt(variavel, 0);

        // se retornar -1 quer dizer que esta vazio, e variavel é o campo
        if (variavel == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um campo na tabela");
        } else {
            valorInteiro = Integer.valueOf(a);

            try {
                //Remove linha do Banco    
                excluirFuncionarioDAO.excluirFuncionario(valorInteiro);
                //Remove linha da Tabela 
                val.removeRow(jTableFuncionarioTabela.getSelectedRow());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "não pode excluir este funcionário");
            } finally {
                JOptionPane.showMessageDialog(null, "Funcionário Excluido!");
            }

        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Preenche a tabela ao iniciar o FuncionarioView
        FuncionarioDAO a = new FuncionarioDAO();
        List<FuncionarioModel> b = a.findAll();
        atualizaTabelaFuncionario(b);
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldFuncionarioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFuncionarioCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFuncionarioCPFActionPerformed

    private void jTextFieldFuncionarioEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFuncionarioEnderecoActionPerformed

    }//GEN-LAST:event_jTextFieldFuncionarioEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(ManterFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterFuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxFuncionarioCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarioTabela;
    private javax.swing.JFormattedTextField jTextFieldFuncionarioCPF;
    private javax.swing.JTextField jTextFieldFuncionarioEmail;
    private javax.swing.JTextField jTextFieldFuncionarioEndereco;
    private javax.swing.JTextField jTextFieldFuncionarioNome;
    private javax.swing.JTextField jTextFieldFuncionarioPesquisar;
    private javax.swing.JTextField jTextFieldFuncionarioSenha;
    private javax.swing.JFormattedTextField jTextFieldFuncionarioTelefone;
    // End of variables declaration//GEN-END:variables
}
