
package br.facens.controller;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Funcionarios;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionariosController {
    public boolean verificalogin(String email, int senha) throws DAOexception, SQLException {
        if (email.isBlank() == false && email.isEmpty() == false) {
            Funcionarios func = new Funcionarios(email, senha);
            
            if(func.logarFunc(func)==true){
                return true;
            }
        }
        return false;
    }
    
    public int insert(int id, String nome, String email, String datanascimento, String cargo) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (id != -1 && nome != null && email != null && datanascimento != null && cargo != null) {
            Funcionarios func = new Funcionarios(id, nome, email, datanascimento, cargo);
            func.cadastrarFuncionario(func);
        }
        return linhasGravadas;
    }
    
    
    public int update(String nome, String email, String datanascimento, String cargo, int id) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (id != -1 && nome != null && email != null && datanascimento != null && cargo != null) {
           Funcionarios func = new Funcionarios(id, nome, email, datanascimento, cargo);
           func.updateFuncionario(func);
        }
        return linhasAfetadas;
    }

    public int delete(int id) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (id != -1) {
            Funcionarios func = new Funcionarios(id);
            func.excluirFuncionario(func);
        }
        return linhasAfetadas;
    }

    public ArrayList<Funcionarios> findAll() throws DAOexception, SQLException {
        return new Funcionarios().findAll();
    }
}
