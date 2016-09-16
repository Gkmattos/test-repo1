/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saraiva;

/**
 *
 * @author 11104974
 */
public class DAOLivroException extends Exception{

    public DAOLivroException(String falha, Exception e) {
        throw new UnsupportedOperationException("Não funcionou!",e);
    }
     
    
}
