/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pedro
 */

    //OK 
  @Table (name = "compra")
  @Entity
public class CompraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cod_compra", length = 45, nullable = false)
    private int codCompra;
    
    @Column(name = "data_compra", length = 45, nullable = false)
    @Temporal(TemporalType.DATE) // recebe o tipo data mais a hora
    private Date dataCompra;
   
    @Column(name = "valor_compra", length = 45, nullable = false)
    private double valorCompra;
   
    @Column (name = "quantidade_compra", length = 45, nullable = false)
    private int quantidadeCompra;

    // Compra -> Fornecedor
    @ManyToOne
    @JoinColumn (name = "fornecedor_cod_fornecedor") // se der erro é isso aq // caso der erro tentar colocar cod_fornecedor
    private FornecedorModel fornecedor; // isto é um atributo com o nome fornecedor
    // Compra - > Produto
    @ManyToOne
    @JoinColumn (name = "produto_cod_produto") // se der erro é isso aq // caso der erro tentar colocar cod_produto
    private ProdutoModel produto ;
    // Compra -> Funcionario
    @ManyToOne 
    @JoinColumn (name = "funcionario_cod_funcionario") // se der erro é isso aq // caso der erro tentar colocar cod_funcionario
    private FuncionarioModel funcionario;

    public CompraModel() {
    
    }

    public CompraModel(int codCompra, Date dataCompra, double valorCompra, int quantidadeCompra, FornecedorModel fornecedor, ProdutoModel produto, FuncionarioModel funcionario) {
        this.codCompra = codCompra;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.quantidadeCompra = quantidadeCompra;
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.funcionario = funcionario;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQuantidadeCompra() {
        return quantidadeCompra;
    }

    public void setQuantidadeCompra(int quantidadeCompra) {
        this.quantidadeCompra = quantidadeCompra;
    }

    public FornecedorModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "CompraModel{" + "codCompra=" + codCompra + ", dataCompra=" + dataCompra + ", valorCompra=" + valorCompra + ", quantidadeCompra=" + quantidadeCompra + ", fornecedor=" + fornecedor + ", produto=" + produto + ", funcionario=" + funcionario + '}';
    }
    
    
    
    
    
}
