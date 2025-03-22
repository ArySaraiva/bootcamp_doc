package org.example.interfaces;

public class ContaCorrente implements Conta{

    private Double saldo = 0.0;
    private final Double taxaOperacao = 0.60;

    @Override
    public Double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor - taxaOperacao;

    }
}
