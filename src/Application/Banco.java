package Application;

import java.util.Scanner;
import Person.Titular;
import ContaBancaria.*;
import Exception.*;

public class Banco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Titular titular;
        String email, nome, address;
        ContaCorrente cc;
        ContaPoupanca cp;
        int agencia, numero;
        double valor;
        System.out.println("Informe o nome: ");
        nome = s.nextLine();
        System.out.println("Informe o email: ");
        email = s.nextLine();
        System.out.println("Informe o endereço: ");
        address = s.nextLine();

        titular = new Titular(nome, email, address);

        System.out.println("Informe o número da conta");
        numero = Integer.parseInt(s.nextLine());
        System.out.println("Informe a agência");
        agencia = Integer.parseInt(s.nextLine());

        int op;
        System.out.println("Informe o tipo de conta: ");
        System.out.println("1 - Corrente\n" + "2 - Poupança");
        op = Integer.parseInt(s.nextLine());
        if (op == 1) {
            cc = new ContaCorrente(titular, numero, agencia);
        } else if (op == 2) {
            cp = new ContaPoupanca(titular, numero, agencia);
        }

        do {
            options();
            op = Integer.parseInt(s.nextLine());
           
        } while (op != 4);

    }

    public static void options() {
        System.out.println("1 - depositar\n" + "2 - sacar\n"
                + "3 - fechar conta\n" + "4 - Sair");
    }

    public static void actions(int op, Conta conta){
        Scanner s = new Scanner (System.in);
        double valor;
        switch (op) {
            case 1:
            System.out.println("Informe o valor:");
            valor = Double.parseDouble(s.nextLine());
            conta.depositar(valor);
                break;
            case 2:
            System.out.println("Informe o valor: ");
            valor = Double.parseDouble(s.nextLine());
            conta.sacar(valor);
                break;
            case 3:
            conta.CloseAccount();
                break;
            case 4:
                break;
            default:
                break;

        }
    }
}
