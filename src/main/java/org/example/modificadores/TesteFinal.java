package org.example.modificadores;

public class TesteFinal {

    final static Conta contaFinal = new Conta(250.00);

    public static void main(String[] args) {
        contaFinal.setSaldo(500.0);
        System.out.println(contaFinal.getSaldo());
    }

}
