
package com.br.controle;


public class controle_pedido {
    public void informacao(int op, String cor){
        switch (op) {
            case 1:
                System.out.println("Fusion - 130 mil reais - cor: "+ cor);
                break;
            case 2:
                System.out.println("Corola - 140 mil reais - cor: "+ cor);
                break;
            case 3:
                System.out.println("Honda Civic - 150 mil reais - cor: "+ cor);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
