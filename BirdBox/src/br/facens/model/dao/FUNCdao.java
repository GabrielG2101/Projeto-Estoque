
package br.facens.model.dao;

import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FUNCdao implements DaoFunc{

     private Connection conn;

    public FUNCdao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    
    public boolean verificaLoginFunc(Funcionarios func) throws DAOexception {
         try {
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from funcionarios where email = '" + func.getEmail() + "' and id = '" + func.getId() + "'");
            if (resultado.next()) {
                String usuarioTemp = resultado.getString("email");
                int senhaTemp = Integer.parseInt(resultado.getString("id"));

                if (senhaTemp == func.getId()) {
                    return true;                
                }
            }
            return false;
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar logar funcionario na FuncDao : SQLState : " + ex.getSQLState());
        }

    }

    @Override
    public int insert(Funcionarios a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String iQuery = "INSERT INTO funcionarios (id,nome,email,datanascimento,cargo) VALUES (?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setInt(1, a.getId());
            st.setString(2, a.getNome());
            st.setString(3, a.getEmail());
            st.setString(4, a.getDatanascimento());
            st.setString(5, a.getCargo());

            linhasGravadas = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastrado");
        } catch (SQLException e) {
            if (e.getSQLState().equals("23505") || e.getSQLState().equals("23000")) {
                int resultado = JOptionPane.showConfirmDialog(null, "Funcionário já cadastrado, deseja atualizar?", "Erro", JOptionPane.ERROR_MESSAGE);

                if(resultado == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Atualizado");
                    return update(a);
                }
                else return 0;
            }
            System.out.println("sim" + e.getMessage());
        }
        return linhasGravadas;
    }

    @Override
    public int update(Funcionarios entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String uQuery = "UPDATE funcionarios SET  nome = ?, email = ?, datanascimento = ?, cargo = ? "
                    + "where id = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getEmail());
            st.setString(3, entidade.getDatanascimento());
            st.setString(4, entidade.getCargo());
            st.setInt(5, entidade.getId());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar atualizar entidade Funcionario. SQLSTATE: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public int delete(Funcionarios entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from funcionarios WHERE id = ? ";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setInt(1, entidade.getId());

            linhasAfetadas = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário Removido!");

        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23000")) {
                JOptionPane.showMessageDialog(null, "O Funcionário tem requisições pendentes!", "Erro", JOptionPane.ERROR_MESSAGE);
                return linhasAfetadas;
            }
            throw new DAOexception("Erro ao tentar deletar entidade Funcionario SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<Funcionarios> findAll() throws DAOexception {
        ArrayList<Funcionarios> funcs = null;
        PreparedStatement st = null;

        try {
            String query = "SELECT * FROM funcionarios";
            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                funcs = new ArrayList<>();

                while (res.next()) {

                    Funcionarios func = new Funcionarios();

                    func.setId(Integer.parseInt(res.getString("id")));
                    func.setNome(res.getString("nome"));
                    func.setEmail(res.getString("email"));
                    func.setDatanascimento(res.getString("datanascimento"));
                    func.setCargo(res.getString("cargo"));

                    funcs.add(func);

                }
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos Funcionairos: " + ex.getMessage());
        }

        return funcs;
    }

    @Override
    public Funcionarios findOne(Funcionarios entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
