package Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro5 {
    public static void main(String[] args) {
        Carro car = new Carro("ABC1234", 456789123);
        Motorista mot = new Motorista(car);

        System.out.println("PASSAGEIRO: Motorista, acelera o carro até 100 Km/h !!!");
        System.out.println("MOTORISTA: Ok ! Vamos lá !");
        mot.acelerar(100);

        System.out.printf("Velocidade do carro: %s Km/h", car.getVelocidadeAtual());
    }
}