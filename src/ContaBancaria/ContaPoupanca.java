package ContaBancaria;

import Exception.SaldoInsuficienteException;
import Person.Titular;

public class ContaPoupanca extends Conta implements IsOpen {

    public ContaPoupanca(Titular titular, int numero, int cagencia) {
        super(titular, numero, cagencia);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.getSaldo()) {
            throw new SaldoInsuficienteException();
        } else {
            this.setSaldo(-valor);
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(valor);
    }

    public void transferir(double valor, ContaPoupanca favorecido) {
        this.sacar(valor);
        favorecido.depositar(valor);
    }

    @Override
    public boolean IsOpen() {
        if (this.isStatus()) {
            return true;
        }
        return false;

    }

}
