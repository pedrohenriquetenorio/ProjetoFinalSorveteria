/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Table (name = "login")
@Entity 
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_login", nullable = false)    
    private int idLogin;
    
    @Column (name = "nome_login", length = 40, nullable = false)
    private String nomeLogin;
    
    @OneToOne
    @JoinColumn(name = "funcionario_cod_funcionario")
    private FuncionarioModel funcionario;

    public LoginModel() {
    }

    public LoginModel(int idLogin, String nomeLogin, FuncionarioModel funcionario) {
        this.idLogin = idLogin;
        this.nomeLogin = nomeLogin;
        this.funcionario = funcionario;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }


    @Override
    public String toString() {
        return "LoginModel{" + "idLogin=" + idLogin + ", nomeLogin=" + nomeLogin + '}';
    }
    
    
}
