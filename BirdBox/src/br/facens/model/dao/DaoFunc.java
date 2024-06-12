
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Funcionarios;


public interface DaoFunc extends DAO<Funcionarios>{
    boolean verificaLoginFunc(Funcionarios func)throws DAOexception;
}
