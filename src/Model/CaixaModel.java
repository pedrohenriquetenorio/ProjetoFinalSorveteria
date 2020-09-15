/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import javax.persistence.ManyToOne;

/**
 *
 * @author pedro
 */

// OK 
@Table (name = "caixa")
@Entity
public class CaixaModel implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_caixa")
    @Id
    private int codCaixa;
    
    @Column(name = "data_abertura", length = 45, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAbertura;
    
    @Column(name = "data_fechamento" , length = 45, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFechamento;
    
    @Column(name = "valor_inicial", length = 45, nullable = false)
    private double valorInicial;
    
    @Column(name = "valor_total", length = 45, nullable = false)
    private double valorTotal;
    
    //Caixa -> Funcionario    
    @ManyToOne
    @JoinColumn(name="funcionario_cod_funcionario")
    private FuncionarioModel funcionario;
 
    //Caixa -> venda
    @OneToMany(mappedBy = "caixa")
    private List<VendaModel> vendas;
   
    public CaixaModel() {
        
    }
    
    public CaixaModel(int codCaixa, Date dataAbertura, Date dataFechamento, double valorInicial, double valorTotal, FuncionarioModel funcionario, List<VendaModel> vendas) {
        this.codCaixa = codCaixa;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.valorInicial = valorInicial;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.vendas = vendas;
    }

    public int getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(int codCaixa) {
        this.codCaixa = codCaixa;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    public List<VendaModel> getVendas() {
        return vendas;
    }

    public void setVendas(List<VendaModel> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "CaixaModel{" + "codCaixa=" + codCaixa + ", dataAbertura=" + dataAbertura + ", dataFechamento=" + dataFechamento + ", valorInicial=" + valorInicial + ", valorTotal=" + valorTotal + ", funcionario=" + funcionario + ", vendas=" + vendas + '}';
    }
    
    
    
}

    
