
package br.facens.model.entity;

import br.facens.model.dao.REQdao;
import br.facens.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.ArrayList;

public class Requisicao {
    private int id;
    private int id_funcionario;
    private int id_adminitrador;
    private String texto_requisicao;
    private String status;

    public Requisicao(int id_funcionario, int id_adminitrador, String texto_requisicao, String status) {
        this.id_funcionario = id_funcionario;
        this.id_adminitrador = id_adminitrador;
        this.texto_requisicao = texto_requisicao;
        this.status = status;
    }

    public Requisicao() {
    }

    public Requisicao(int id) {
       this.id = id;
    }

    public Requisicao(int id_funcionario, String texto) {
       this.id_funcionario = id_funcionario;
       this.texto_requisicao = texto;
    }
    
    public int getId(){
        return id;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public int getId_adminitrador() {
        return id_adminitrador;
    }

    public String getTexto_requisicao() {
        return texto_requisicao;
    }

    public String getStatus() {
        return status;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public void setId_adminitrador(int id_adminitrador) {
        this.id_adminitrador = id_adminitrador;
    }

    public void setTexto_requisicao(String texto_requisicao) {
        this.texto_requisicao = texto_requisicao;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int cadastrarRequisicao(Requisicao req) throws SQLException, DAOexception {
        return new REQdao().insert(req);
    }
    
    /*public int updateMaterial(Materiais mat) throws DAOexception, SQLException {
        return new MATdao().update(mat);
    }*/
    
    public int excluirRequisicao(Requisicao req)throws SQLException, DAOexception{
        return new REQdao().delete(req);
    }
    
   public ArrayList<Requisicao> findAll() throws DAOexception, SQLException {
       return new REQdao().findAll();
    }
    
    
}
