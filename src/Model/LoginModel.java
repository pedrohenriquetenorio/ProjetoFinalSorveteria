/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pedro
 */
public class LoginModel {
    private String nomeLogin;

    public LoginModel() {
    }

    public LoginModel(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    @Override
    public String toString() {
        return "LoginModel{" + "nomeLogin=" + nomeLogin + '}';
    }
    
    
}
