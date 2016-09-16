/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saraiva;

import java.util.List;

/**
 *
 * @author Gabriel Mattos e Marina Barros
 */
public interface LivroDAO {
    
	List<Livro> buscarTodos() throws DAOLivroException;
        

}
    
    
    
    

