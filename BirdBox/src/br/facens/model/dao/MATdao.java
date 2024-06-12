
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Materiais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MATdao implements DAO<Materiais>{

     private Connection conn;

    public MATdao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    public int insert(Materiais a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String iQuery = "INSERT INTO materiais (codigo,nome,descricao,valor,quantidade) VALUES (?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setInt(1, a.getCodigo());
            st.setString(2, a.getNome());
            st.setString(3, a.getDescricao());
            st.setDouble(4, a.getValor());
            st.setInt(5, a.getQuantidade());

            linhasGravadas = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado");
        } catch (SQLException e) {
            if (e.getSQLState().equals("23505") || e.getSQLState().equals("23000")) {
                int resultado = JOptionPane.showConfirmDialog(null, "Material já cadastrado, deseja atualizar?", "Erro", JOptionPane.ERROR_MESSAGE);
                if(resultado == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Atualizado");
                    return update(a);
                }
                else return 0;
            }
            System.out.println("sim" + e.getSQLState());
        }
        return linhasGravadas;
    }

    @Override
    public int update(Materiais entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String uQuery = "UPDATE materiais SET  nome = ?, descricao = ?, valor = ?, quantidade = ? "
                    + "where codigo = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getDescricao());
            st.setDouble(3, entidade.getValor());
            st.setInt(4, entidade.getQuantidade());
            st.setInt(5, entidade.getCodigo());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar atualizar entidade Material. SQLSTATE: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public int delete(Materiais entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from materiais WHERE codigo = ? ";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setInt(1, entidade.getCodigo());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade Material SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<Materiais> findAll() throws DAOexception {
        ArrayList<Materiais> funcs = null;
        PreparedStatement st = null;

        try {
            String query = "SELECT * FROM Materiais";
            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                funcs = new ArrayList<Materiais>();

                while (res.next()) {

                    Materiais mat = new Materiais();

                    mat.setCodigo(Integer.parseInt(res.getString("codigo")));
                    mat.setNome(res.getString("nome"));
                    mat.setDescricao(res.getString("descricao"));
                    mat.setValor(Double.parseDouble(res.getString("valor")));
                    mat.setQuantidade(Integer.parseInt(res.getString("quantidade")));

                    funcs.add(mat);

                }
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos os Materiais: " + ex.getMessage());
        }

        return funcs;
    }

    @Override
    public Materiais findOne(Materiais entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
    public ArrayList<Materiais> consultaMaterial(String nome) throws DAOexception {
        ArrayList<Materiais> material = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM materiais WHERE nome LIKE '%" + nome + "%' order by nome";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                material = new ArrayList<>();
                while (res.next()) {
                    Materiais materiais = new Materiais();
                    materiais.setCodigo(res.getInt("Codigo"));
                    materiais.setNome(res.getString("Nome"));
                    materiais.setDescricao(res.getString("Descricao"));
                    materiais.setValor(res.getDouble("Valor"));
                    materiais.setQuantidade(res.getInt("Quantidade"));
                    material.add(materiais);

                }
            }
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar achar curso : SQLState : " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                throw new DAOexception("Erro ao tentar fechar curso : SQLState : " + e.getSQLState());
            }
        }
        return material;
    }
    
    
}
