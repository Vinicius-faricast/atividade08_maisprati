package Encapsulamento;

public class ProdutoDesconto extends Produto{
    private double valorPromocional;

    public ProdutoDesconto(String nome, double preco, int qtEstoque) {
        super(nome, preco, qtEstoque);
        double valorPromocional = 0;
    }

    public double getValorPromocional() {
        return valorPromocional;
    }

    private void setValorPromocional(double valorPromocional) {
        this.valorPromocional = valorPromocional;
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 50){
            System.out.println("Esse valor de desconto não pode ser aplicado");
            return;
        }

        double valueDiscont = this.getPreco() * (porcentagem / 100);
        this.setValorPromocional(this.getPreco() - valueDiscont);
        return;
    }
}
