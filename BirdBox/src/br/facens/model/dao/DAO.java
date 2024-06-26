
package br.facens.model.dao;
import br.facens.model.dao.exception.DAOexception;
import java.util.List;
public interface DAO<T> {
    int insert(T a) throws DAOexception;

    int update(T entidade) throws DAOexception;

    int delete(T entidade) throws DAOexception;

    List<T> findAll() throws DAOexception;

    T findOne(T entidade) throws DAOexception;
}
