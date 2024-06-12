
package br.facens.controller;

import br.facens.model.dao.exception.DAOexception;
import java.sql.SQLException;
import br.facens.model.entity.Administradores;

public class ADMController {
     public boolean verificalogin(String email, String senha) throws DAOexception, SQLException {
        if (email.isBlank() == false && email.isEmpty() == false) {
            Administradores adm = new Administradores(email, senha);
            
            if(adm.logarAdm(adm)==true){
                return true;
            }
        }
        return false;
    }
}
