package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(250.0);
        cc.sacar(150.0);
        System.out.println("Conta corrente "+cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1500.0);
        cp.sacar(1200.0);
        System.out.println("conta poupança " + cp.getSaldo());
    }
}
