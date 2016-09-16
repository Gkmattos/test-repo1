/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saraiva;
    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 11104974
 */
public class LivroDAODerby implements LivroDAO{


    public List<Livro> buscarTodos() throws DAOLivroException {
        List<Livro> Livro = new ArrayList();
        String sql = "SELECT * FROM Livro";
        try (Connection conexao = BancoDadosSource.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet variavel = comando.executeQuery(sql)) {
                    while (variavel.next()) {
                        Livro f1 = new Livro(
                                variavel.getString("titulo"),
                                variavel.getInt("valor"),
                                variavel.getString("descricao"),
                                variavel.getInt("avaliacao"),
                                variavel.getString("url"));
                        Livro.add(f1);
                    }
                    return Livro;
                }
            }
        } catch (Exception e) {
            throw new DAOLivroException("Falha na busca", e);
        }
    }
    
    
}

