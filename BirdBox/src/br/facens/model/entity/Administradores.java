
package br.facens.model.entity;

import br.facens.model.dao.ADMdao;
import br.facens.model.dao.exception.DAOexception;
import java.sql.SQLException;


public class Administradores {
    private String email;
    private String senha;

    public Administradores(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public Administradores(){
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public boolean logarAdm(Administradores adm) throws SQLException, DAOexception {
         return new ADMdao().verificaLoginADM(adm);
     }
}
