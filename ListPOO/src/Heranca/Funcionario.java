package Heranca;

public class Funcionario {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void trabalhar(){
        System.out.println("Funcionario trabalhando");
    }
}
