package org.example.anonimas;

public class TestClasseAnonima {
    public static void main(String[] args) {
        CarteiraContas contas = new CarteiraContas();
        contas.contaCorrente.imprimeTipoConta();
        contas.contaPoupanca.imprimeTipoConta();
    }
}
