package Encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int qtEstoque;

    public Produto(String nome, double preco, int qtEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtEstoque = qtEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Valor inválido!");
            return;
        }
        this.preco = preco;
    }

    public void setQtEstoque(int qtEstoque) {
        if(preco < 0){
            System.out.println("Valor inválido!");
            return;
        }
        this.qtEstoque = qtEstoque;
    }
}
