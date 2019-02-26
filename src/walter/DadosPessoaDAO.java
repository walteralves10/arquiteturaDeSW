package walter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosPessoaDAO {
    
    public void insertPessoa(DadosPessoaBEAN pessoa){
        String sql = "INSERT INTO dados_pessoa (nomepessoa, idadepessoa, sexopessoa) VALUES (?,?,?)";
        MySQLDAO.executeQuery(sql, pessoa.getNome(), pessoa.getIdade(), pessoa.getSexo());
    }
    
    public void updatePessoa(DadosPessoaBEAN pessoa){
        String sql = "UPDATE dados_pessoa SET nomepessoa=?, idadepessoa=?, sexopessoa=? WHERE idpessoa=?";
        MySQLDAO.executeQuery(sql, pessoa.getNome(), pessoa.getIdade(), pessoa.getSexo(), pessoa.getId());
    }
    
    public void deletePessoa(DadosPessoaBEAN pessoa){
        String sql = "DELETE FROM dados_pessoa WHERE idpessoa=?";
        MySQLDAO.executeQuery(sql, pessoa.getId());
    }
    
    public ArrayList<DadosPessoaBEAN> findAllPessoas(DadosPessoaBEAN pessoa){
        return listaPessoas("SELECT * FROM dados_pessoa WHERE idpessoa=?", pessoa);
    }
    
    private ArrayList<DadosPessoaBEAN> listaPessoas(String sql, DadosPessoaBEAN pessoa){
        ArrayList<DadosPessoaBEAN> lista = new ArrayList<DadosPessoaBEAN>();
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(sql, pessoa.getId());
        try {
            while(rs.next()){
                lista.add(new DadosPessoaBEAN(rs.getString("nomepessoa"), rs.getInt("idadepessoa"), rs.getString("sexopessoa")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
}
