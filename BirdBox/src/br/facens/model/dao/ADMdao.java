
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Administradores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class ADMdao implements DaoAdm{

     private Connection conn;

    public ADMdao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    
    @Override
    public boolean verificaLoginADM(Administradores adm) throws DAOexception {
         try {
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from administradores where email = '" + adm.getEmail() + "' and senha = '" + adm.getSenha() + "'");
            if (resultado.next()) {
                String usuarioTemp = resultado.getString("email");
                String senhaTemp = resultado.getString("senha");

                if (senhaTemp.equals(adm.getSenha())) {
                    return true;                
                }
            }
            return false;
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar logar Adm na ADMdao : SQLState : " + ex.getSQLState());
        }

    }

    @Override
    public int insert(Administradores a) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Administradores entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Administradores entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administradores> findAll() throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administradores findOne(Administradores entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
