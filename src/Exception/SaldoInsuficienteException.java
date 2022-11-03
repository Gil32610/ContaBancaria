package Exception;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(){
        super("Saldo insuficiente!");
    }
}
