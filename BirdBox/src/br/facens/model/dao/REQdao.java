
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Requisicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class REQdao implements DAO<Requisicao>{

     private Connection conn;

    public REQdao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

   public int insert(Requisicao a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String iQuery = "INSERT INTO requisicao (id_funcionario,id_administrador,texto_requisicao,status) VALUES (?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setInt(1, a.getId_funcionario());
            st.setInt(2, 1);
            st.setString(3, a.getTexto_requisicao());
            st.setInt(4, 3);

            linhasGravadas = st.executeUpdate();
        } catch (SQLException e) {
            if (e.getSQLState().equals("23505")) {
                JOptionPane.showMessageDialog(null, "Requisicao já cadastrada", "Erro", JOptionPane.ERROR_MESSAGE);

                return update(a);
            }
            System.out.println("sim" + e.getMessage());
        }
        return linhasGravadas;
    }


      
    @Override
    public int update(Requisicao entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Requisicao entidade) throws DAOexception {
         int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from requisicao WHERE id = ? ";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setInt(1, entidade.getId());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade requisicao SQLSTATE: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<Requisicao> findAll() throws DAOexception {
        ArrayList<Requisicao> reqs = null;
        PreparedStatement st = null;

        try {
            String query = "SELECT * FROM requisicao";
            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                reqs = new ArrayList<Requisicao>();

                while (res.next()) {

                    Requisicao mat = new Requisicao();

                    mat.setId(Integer.parseInt(res.getString("id")));
                    mat.setId_funcionario(Integer.parseInt(res.getString("id_funcionario")));
                    mat.setId_adminitrador(Integer.parseInt(res.getString("id_administrador")));
                    mat.setTexto_requisicao(res.getString("texto_requisicao"));
                    mat.setStatus(res.getString("status"));

                    reqs.add(mat);

                }
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos os Materiais: " + ex.getMessage());
        }

        return reqs;
    }

    @Override
    public Requisicao findOne(Requisicao entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
