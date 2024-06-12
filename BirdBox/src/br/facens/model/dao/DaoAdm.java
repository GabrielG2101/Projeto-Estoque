
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Administradores;


public interface DaoAdm extends DAO<Administradores>{
    boolean verificaLoginADM(Administradores adm)throws DAOexception;
}
