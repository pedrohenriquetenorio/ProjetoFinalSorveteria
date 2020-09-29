/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pedro
 */

@Table (name = "produto")
@Entity
public class ProdutoModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "cod_produto", length = 45, nullable = false)
private int codProduto;

@Column(name = "tipo_produto", length = 45, nullable = false)
private String tipoProduto;
  
@Column(name = "preco_produto", length = 45, nullable = false)
private String precoProduto;
   
@Column(name = "quantidade_produto", length = 45, nullable = false)
private String quantidadeProduto;

//Produto -> Compra       
@OneToMany(mappedBy = "produto")
private List<CompraModel> compra;

//Produto -> Funcionario
@ManyToOne
@JoinColumn(name = "funcionario_cod_funcionario", nullable = false) // 
private FuncionarioModel funcionario;
// não sei se tem que mapear as duas classes, Venda - Aluno são ManyToMany

public ProdutoModel() {

}

    public ProdutoModel(int codProduto, String tipoProduto, String precoProduto, String quantidadeProduto, List<CompraModel> compra, FuncionarioModel funcionario) {
        this.codProduto = codProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.compra = compra;
        this.funcionario = funcionario;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public List<CompraModel> getCompra() {
        return compra;
    }

    public void setCompra(List<CompraModel> compra) {
        this.compra = compra;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" + "codProduto=" + codProduto + ", tipoProduto=" + tipoProduto + ", precoProduto=" + precoProduto + ", quantidadeProduto=" + quantidadeProduto + ", compra=" + compra + ", funcionario=" + funcionario + '}';
    }


    
    
}