package org.example.interfaces;

public class ContaPoupanca implements Conta{

    private Double saldo = 0.0;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }
}
