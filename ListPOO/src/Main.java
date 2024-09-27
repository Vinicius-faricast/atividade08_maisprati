import Encapsulamento.Produto;
import Encapsulamento.ProdutoDesconto;
import Heranca.Desenvolvedor;
import Heranca.Gerente;
import Polimorfismo.Trasnportes.Bicicleta;
import Polimorfismo.Trasnportes.Carro;
import Polimorfismo.Trasnportes.Trem;

public class Main {
    public static void main(String[] args) {
// Descomento o trecho do código para executar o exercicio 01
//        Produto produto = new Produto("Arroz", 4.99,10);
//        System.out.println(produto.getNome());
//        System.out.println(produto.getPreco());
//        System.out.println(produto.getQtEstoque());
//
//        produto.setNome("Arroz São João");
//        produto.setPreco(5.25);
//        produto.setQtEstoque(9);
//
//        System.out.println(produto.getNome());
//        System.out.println(produto.getPreco());
//        System.out.println(produto.getQtEstoque());

// Descomento o trecho do código para executar o exercicio 02
//        ProdutoDesconto arroz = new ProdutoDesconto("Arroz", 10, 5);
//
//        arroz.aplicarDesconto(10);
//        System.out.println(arroz.getValorPromocional());

// Descomente o trecho do código para executar o exercicio 03
//        Gerente fulano = new Gerente("Fulano", 4000);
//        System.out.println("O salario do gerente " + fulano.getName() + " com o bonus foi para: " + fulano.calcBonus());
//
//        Desenvolvedor cicrano = new Desenvolvedor("Cicrano", 5000);
//        System.out.println("O salario do desenvolvedor " + cicrano.getName() + " com o bonus foi para: " + cicrano.calcBonus());
//
//        fulano.trabalhar();
//        cicrano.trabalhar();

//        Descomente o trecho do códio para executar o exercicio 03
        Carro carro = new Carro();
        Trem trem = new Trem();
        Bicicleta bicicleta = new Bicicleta();

        carro.acelerar();
        carro.frear();

        trem.acelerar();
        trem.frear();

        bicicleta.acelerar();
        bicicleta.frear();
    }
}