package ContaBancaria;

import Person.*;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Titular titular;

    public Conta(Titular titular, int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    abstract public void sacar(double valor);

    abstract public void depositar(double valor);

    public void transferir(double valor, Conta favorecido){
        
    }
}
