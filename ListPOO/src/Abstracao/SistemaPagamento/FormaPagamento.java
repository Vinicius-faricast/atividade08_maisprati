package Abstracao.SistemaPagamento;

abstract public class FormaPagamento {
    abstract void processarPagamento(double valor);
    abstract void validarPagamento();
}
