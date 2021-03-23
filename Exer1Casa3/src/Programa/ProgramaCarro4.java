package Programa;

import Classes.Carro;
import Classes.Motorista;

public class ProgramaCarro4 {
    public static void main(String[] args) {
        Carro car = new Carro("ABC1234", 123456);
        Motorista mot = new Motorista(car);

        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());

        System.out.println("ACELERANDO O CARRO...");

        for (int i = 0; i <= 10; i++)
        {
            mot.acelerar(i);
        }

        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());

        System.out.println("ACELERANDO O CARRO ATÉ 50 KM/h...");
        mot.acelerar(50);

        System.out.println("Velocidade do carro: " + car.getVelocidadeAtual());
    }
}