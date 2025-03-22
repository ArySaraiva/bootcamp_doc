package org.example.modificadores;
import lombok.Lombok;

public class Conta {

    private  Double saldo;

    public Conta(){};

    public Conta(double saldo){
      this.saldo=saldo;
    };

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
