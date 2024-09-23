package Heranca;

public class Gerente extends Funcionario{

    public Gerente(String name, double salary) {
        super(name, salary);
    }

    public double calcBonus(){
        return this.salary + (this.salary * 0.2);
    }

    @Override
    public void trabalhar(){
        System.out.println("Gerente está fazendo a gestão do projeto");
    }
}
