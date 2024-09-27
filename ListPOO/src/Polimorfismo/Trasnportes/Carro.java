package Polimorfismo.Trasnportes;

public class Carro implements IMeioTransporte{
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    public void frear(){
        System.out.println("O carro está freando");
    }
}
