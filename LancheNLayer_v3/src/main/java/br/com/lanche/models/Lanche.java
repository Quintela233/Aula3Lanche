package br.com.lanche.models;

public class Lanche {
    private int id;
    private String nome;
    private double preco;
    private String caminhoImagem;

    public Lanche(int id, String nome, double preco, String caminhoImagem) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.caminhoImagem = caminhoImagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public double calcularLanche(int quantidade) {
        return this.preco * quantidade;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                "Imagens: " + caminhoImagem;
    }
}
