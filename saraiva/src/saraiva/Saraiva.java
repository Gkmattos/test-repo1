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
public class Saraiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOLivroException{
        {
		LivroDAO test =  new LivroDAODerby();
                List<Livro> Livro = test.buscarTodos();
                System.out.print(Livro);
                    
	}
    }
    
}
