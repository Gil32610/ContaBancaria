package ContaBancaria;

import Person.*;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Titular titular;
    private boolean status;

    public Conta(Titular titular, int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.status = true;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void setSaldo(double valor) {
        this.saldo += valor;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    abstract public void sacar(double valor);

    abstract public void depositar(double valor);

    public void transferir(double valor, Conta favorecido) {
        this.saldo -= valor;
        favorecido.saldo += valor;
    }

    public Titular getTitular() {
        return this.titular;
    }

}
