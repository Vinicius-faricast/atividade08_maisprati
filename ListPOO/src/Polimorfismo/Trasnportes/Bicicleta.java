package Polimorfismo.Trasnportes;

public class Bicicleta implements IMeioTransporte{
    public void acelerar(){
        System.out.println("A bicicleta está acelerando");
    }

    public void frear(){
        System.out.println("O bicicleta está freando");
    }
}
