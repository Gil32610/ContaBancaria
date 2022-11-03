package ContaBancaria;

import Person.*;

public abstract class Conta implements IsOpen {
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
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
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

    public boolean isOpen(ContaCorrente conta) {
        if (this.isStatus()) {
            return true;
        } else {
            return false;
        }

    }
}
