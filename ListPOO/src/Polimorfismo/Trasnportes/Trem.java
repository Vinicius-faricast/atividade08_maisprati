package Polimorfismo.Trasnportes;

public class Trem implements IMeioTransporte{
    public void acelerar(){
        System.out.println("O Trem está acelerando");
    }

    public void frear(){
        System.out.println("O Trem está freando");
    }
}
