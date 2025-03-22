package org.example.abstratas;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimir saldo da conta corrente: R$ " + getSaldo()+".");
    }
}
