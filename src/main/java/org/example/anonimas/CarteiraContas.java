package org.example.anonimas;

public class CarteiraContas {

    Conta contaCorrente = new Conta() {

        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta corrente");
        }
    };

    Conta contaPoupanca = new Conta(){
        @Override
        public void imprimeTipoConta() {
            System.out.println("Conta poupanca");
        }
    };




}
