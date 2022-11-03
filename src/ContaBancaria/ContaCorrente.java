package ContaBancaria;

import Person.Titular;
import Exception.*;

public class ContaCorrente extends Conta implements IsOpen {
    private double limite;
    private double taxa;

    public ContaCorrente(Titular titular, int numero, int agencia) {
        super(null, numero, agencia);
        this.taxa = 10.00;
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

    @Override
    public void transferir(double valor, Conta favorecido) {
        this.setSaldo(-(valor + taxa));
        favorecido.depositar(valor);

    }

    public boolean IsOpen() {
        if (this.isStatus()) {
            return true;
        }
        return false;

    }

}
