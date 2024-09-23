package Heranca;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String name, double salary){
        super(name, salary);
    }

    public double calcBonus(){
        return this.salary + (this.salary * 0.1);
    }

    @Override
    public void trabalhar(){
        System.out.println("Desenvolvedor está codando");
    }
}
