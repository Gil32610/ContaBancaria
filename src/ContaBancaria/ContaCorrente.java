package ContaBancaria;

import Person.Titular;

public class ContaCorrente extends Conta{
    private double limite;
    private double taxa;

    public ContaCorrente(Titular titular, int numero, int agencia) {
        super(null, numero, agencia);
    }

    public void sacar(double valor) {

    }

    public void depositar(double valor) {

    }

}
