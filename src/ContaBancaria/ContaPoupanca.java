package ContaBancaria;

import Person.Titular;

public class ContaPoupanca extends Conta implements IsOpen {

    public ContaPoupanca(Titular titular, int numero, int cagencia) {
        super(titular, numero, cagencia);
    }

    public void sacar(double valor) {

    }

    public void depositar(double valor) {

    }
    
    public void transferir(double valor, ContaPoupanca favorecido){
        
    }

    @Override
    public boolean IsOpen() {
        if (this.isStatus()) {
            return true;
        }
        return false;

    }

}
