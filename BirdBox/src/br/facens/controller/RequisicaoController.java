
package br.facens.controller;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Requisicao;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequisicaoController {
    public int insert(int id_funcionario, String texto) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (id_funcionario != -1 && texto != null) {
            Requisicao req = new Requisicao(id_funcionario, texto);
            req.cadastrarRequisicao(req);
        }
        return linhasGravadas;
    }
    
    
    /*public int update(String nome, String descricao, double valor, int quantidade, int codigo) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (codigo != -1 && nome != null && descricao != null && valor != 0 && quantidade != -1) {
           Materiais mat = new Materiais(codigo, nome, descricao, valor, quantidade);
           mat.updateMaterial(mat);
        }
        return linhasAfetadas;
    }*/

    public int delete(int id) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (id != -1) {
            Requisicao req = new Requisicao(id);
            req.excluirRequisicao(req);
        }
        return linhasAfetadas;
    }

    public ArrayList<Requisicao> findAll() throws DAOexception, SQLException {
        return new Requisicao().findAll();
    }
}
