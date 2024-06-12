
package br.facens.model.entity;

import br.facens.model.dao.FUNCdao;
import br.facens.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.ArrayList;

public class Funcionarios {
    private int id;
    private String nome;
    private String email;
    private String datanascimento;
    private String cargo;

    
    public Funcionarios(int id, String nome, String email, String datanascimento, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.datanascimento = datanascimento;
        this.cargo = cargo;
    }

    public Funcionarios() {
        
    }
    
    public Funcionarios(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public Funcionarios(int id) {
    this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public boolean logarFunc(Funcionarios func) throws SQLException, DAOexception {
         return new FUNCdao().verificaLoginFunc(func);
     }

    public int cadastrarFuncionario(Funcionarios func) throws SQLException, DAOexception {
        return new FUNCdao().insert(func);
    }
    
     public int updateFuncionario(Funcionarios func) throws DAOexception, SQLException {
        return new FUNCdao().update(func);
    }
    
    public int excluirFuncionario(Funcionarios func)throws SQLException, DAOexception{
        return new FUNCdao().delete(func);
    }
    
   public ArrayList<Funcionarios> findAll() throws DAOexception, SQLException {
       return new FUNCdao().findAll();
    }
    
    
}
