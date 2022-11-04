package ContaBancaria;

import Person.Titular;
import Exception.*;

public class ContaCorrente extends Conta implements ChangeStatus{
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

    
    public void transferir(double valor, ContaCorrente favorecido) {
        this.sacar((valor + taxa));
        favorecido.depositar(valor);

    }
    @Override
    public boolean IsOpen() {
        if (this.isStatus()) {
            return true;
        }
        return false;

    }

    @Override
    public void CloseAccount() {
        if (this.IsOpen()) {
            if (this.getSaldo() > 0) {
                System.out.println("There is still money on the account");
            } else {
                this.setSaldo(0.0);
                this.setNumero(0);
                this.setAgencia(0);
                this.setTitular(null);
                this.setSaldo(0.0);
                this.setStatus(false);
            }
        } else {
            System.out.println("Already Closed");
        }
    }

}
