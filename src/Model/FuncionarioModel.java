/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.NaturalId;

/**
 *
 * @author pedro
 */

@Table (name = "funcionario")
@Entity
public class FuncionarioModel {
   
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "cod_Funcionario", nullable = false)
private int codFuncionario;

@Column (name = "cpf", length = 45, nullable = false)
private String cpf;

@Column (name = "nome", length = 45, nullable = false)
private String nome; 

@Column (name = "endereco", length = 45, nullable = false)
private String endereco;

@Column (name = "email", length = 45, nullable = false)
private String email;

@Column (name = "telefone", length = 45, nullable = false)
private String telefone;

@Column (name = "senha", length = 45, nullable = false)
private String senha;

@Column (name = "cargo", length = 45, nullable = false)
private String cargo;

//Funcionario -> Compra
@OneToMany(mappedBy = "funcionario")
private List<CompraModel> compras;

//Funcionario -> Caixa
@OneToMany(mappedBy = "funcionario")
private List<CaixaModel> caixas;

//Funcionario -> Produto
@OneToMany(mappedBy = "funcionario")
private List<ProdutoModel> produtos;

public FuncionarioModel() {

}

    public FuncionarioModel(int codFuncionario, String cpf, String nome, String endereco, String email, String telefone, String senha, String cargo, List<CompraModel> compras, List<CaixaModel> caixas, List<ProdutoModel> produtos) {
        this.codFuncionario = codFuncionario;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.cargo = cargo;
        this.compras = compras;
        this.caixas = caixas;
        this.produtos = produtos;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<CompraModel> getCompras() {
        return compras;
    }

    public void setCompras(List<CompraModel> compras) {
        this.compras = compras;
    }

    public List<CaixaModel> getCaixas() {
        return caixas;
    }

    public void setCaixas(List<CaixaModel> caixas) {
        this.caixas = caixas;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "FuncionarioModel{" + "codFuncionario=" + codFuncionario + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha + ", cargo=" + cargo + ", compras=" + compras + ", caixas=" + caixas + ", produtos=" + produtos + '}';
    }

    




}
