package org.example.abstratas;

public abstract class Conta {

    private Double saldo;

    public abstract void imprimirExtrato();


    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
