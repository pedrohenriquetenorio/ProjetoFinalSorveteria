/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

@Table (name = "fornecedor")
@Entity
public class FornecedorModel  implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "cod_fornecedor", length = 45, nullable = false)
private int codFornecedor;

//@Column (name = "nome", length = 45, nullable = false)
//private String nome;

@Column (name = "email", length = 50, nullable = false)
private String email;

@Column (name = "telefone", length = 20, nullable = false)
private String telefone;

@Column(name = "cnpj", length = 15, nullable = false )
private String cnpj;
    
@Column(name = "nome_fantasia", length = 45, nullable = false)
private String nomeFantasia;

 //Fornecedor -> Compra

@OneToMany(mappedBy = "fornecedor")
private Collection<CompraModel> compraModelCollection;

public FornecedorModel() {
}

    public FornecedorModel(int codFornecedor, String email, String telefone, String cnpj, String nomeFantasia, Collection<CompraModel> compraModelCollection) {
        this.codFornecedor = codFornecedor;
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.compraModelCollection = compraModelCollection;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Collection<CompraModel> getCompraModelCollection() {
        return compraModelCollection;
    }

    public void setCompraModelCollection(Collection<CompraModel> compraModelCollection) {
        this.compraModelCollection = compraModelCollection;
    }

    @Override
    public String toString() {
        return "FornecedorModel{" + "codFornecedor=" + codFornecedor + ", email=" + email + ", telefone=" + telefone + ", cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", compraModelCollection=" + compraModelCollection + '}';
    }


    
    





}



