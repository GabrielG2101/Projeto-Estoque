
package br.facens.model.entity;

import br.facens.model.dao.MATdao;
import br.facens.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.ArrayList;

public class Materiais {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;

    public Materiais(int codigo, String nome, String descricao, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Materiais() {
    }

    public Materiais(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int cadastrarMaterial(Materiais mat) throws SQLException, DAOexception {
        return new MATdao().insert(mat);
    }
    
     public int updateMaterial(Materiais mat) throws DAOexception, SQLException {
        return new MATdao().update(mat);
    }
    
    public int excluirMaterial(Materiais mat)throws SQLException, DAOexception{
        return new MATdao().delete(mat);
    }
    
   public ArrayList<Materiais> findAll() throws DAOexception, SQLException {
       return new MATdao().findAll();
    }
    public ArrayList<Materiais> consultaMaterial(String nome) throws DAOexception, SQLException {
        return new MATdao().consultaMaterial(nome);
    }
}
