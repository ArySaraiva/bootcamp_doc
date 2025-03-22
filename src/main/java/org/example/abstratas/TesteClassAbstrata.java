package org.example.abstratas;

public class TesteClassAbstrata {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(200.0);

        cc.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(15.0);
        cp.imprimirExtrato();
    }
}
