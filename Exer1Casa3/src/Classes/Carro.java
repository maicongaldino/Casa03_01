package Classes;

import java.util.InputMismatchException;

public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;

    public Carro(){}

    public Carro(String placa, int numChassi)
    {
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        if ("ERRO !!!" . equals(letrasPlaca))
        {
            return letrasPlaca;
        }
        else
        {
            return letrasPlaca + numerosPlaca;
        }
    }
    public void setPlaca(String placa) {
        if (placa == null)
        {
            throw new NullPointerException("O valor da placa não pode ser nulo.");
        }
        else
        {
            if (placa.length() != 7)
            {
                throw new InputMismatchException("A placa deve ter 7 caracteres.");
            }
            else
            {
                if (!placa.matches("[A-Z]{3}\\d{4}"))
                {
                    throw new InputMismatchException("A placa deve ser composta por 3 letras e 4 números.");
                }
                else
                {
                    this.letrasPlaca = placa.substring(0, 3);
                    this.numerosPlaca = Integer.parseInt(placa.substring(3));
                }
            }
        }
    }
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    void acelerar() {
        velocidadeAtual++;
    }
    void acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++)
        {
            acelerar();
        }
    }
    boolean frear() {
        return false;
    }
}