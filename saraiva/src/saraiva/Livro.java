/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saraiva;

/**
 *
 * @author Gabriel Mattos e Marina Barros
 */
public class Livro {
    
    private String titulo;
    private int valor;
    private String descricao;
    private int avaliacao;
    private String url; 
    

    public Livro(String titulo, int valor, String descricao, int avaliacao, String url) {
        this.titulo = titulo;
        this.valor = valor;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

   
    
}