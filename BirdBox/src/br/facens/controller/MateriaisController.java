
package br.facens.controller;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Materiais;
import java.sql.SQLException;
import java.util.ArrayList;

public class MateriaisController {
    public int insert(int codigo, String nome, String descricao, double valor, int quantidade) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (codigo != -1 && nome != null && descricao != null && valor != 0 && quantidade != -1) {
            Materiais mat = new Materiais(codigo, nome, descricao, valor, quantidade);
            mat.cadastrarMaterial(mat);
        }
        return linhasGravadas;
    }
    
    
    public int update(String nome, String descricao, double valor, int quantidade, int codigo) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (codigo != -1 && nome != null && descricao != null && valor != 0 && quantidade != -1) {
           Materiais mat = new Materiais(codigo, nome, descricao, valor, quantidade);
           mat.updateMaterial(mat);
        }
        return linhasAfetadas;
    }

    public int delete(int codigo) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (codigo != -1) {
            Materiais mat = new Materiais(codigo);
            mat.excluirMaterial(mat);
        }
        return linhasAfetadas;
    }

    public ArrayList<Materiais> findAll() throws DAOexception, SQLException {
        return new Materiais().findAll();
    }
    public ArrayList<Materiais> consultaMaterial(String nome) throws DAOexception, SQLException {
        return new Materiais().consultaMaterial(nome);
    }
}
