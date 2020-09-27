/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;




import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pedro
 */
@Table (name = "venda")
@Entity
public class VendaModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "cod_venda", nullable = false)
    private int codVenda; 
    
    @Column (name = "valor_total", nullable = false)
    private double valorTotal;
    
    
    //@OneToMany(mappedBy = "pagamento")
    //private List<PagamentoModel> pagamentos;
    // mapeamento de muitos pra muitos
    
    @ManyToOne
    @JoinColumn(name = "caixa_cod_caixa")
    private CaixaModel caixa;
            
    @ManyToMany        
    @JoinTable( name = "produto_has_venda", 
                joinColumns = @JoinColumn(name = "venda_cod_venda"), 
                inverseJoinColumns = @JoinColumn(name = "produto_cod_produto"))
    private List<ProdutoModel> produtos;

    public VendaModel() {
    }

    public VendaModel(int codVenda, double valorTotal, CaixaModel caixa, List<ProdutoModel> produtos) {
        this.codVenda = codVenda;
        this.valorTotal = valorTotal;
        this.caixa = caixa;
        this.produtos = produtos;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public CaixaModel getCaixa() {
        return caixa;
    }

    public void setCaixa(CaixaModel caixa) {
        this.caixa = caixa;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "VendaModel{" + "codVenda=" + codVenda + ", valorTotal=" + valorTotal + ", caixa=" + caixa + ", produtos=" + produtos + '}';
    }

    
    
   
    
}

