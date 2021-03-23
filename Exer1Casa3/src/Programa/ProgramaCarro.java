package Programa;

import java.util.InputMismatchException;

import Classes.Carro;

public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        try 
        {
            carro.setPlaca("ABC1234");
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Programa encerrando...");
            return;
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("O programa continuará com a placa ABC1234.");
            carro.setPlaca("ABC1234");
        }
        
        carro.setNumChassi(1234567);

        System.out.println("Placa do carro cadastrado: " + carro.getPlaca());
        System.out.println("Número de chassi cadastrado: " + carro.getNumChassi());
    }
}