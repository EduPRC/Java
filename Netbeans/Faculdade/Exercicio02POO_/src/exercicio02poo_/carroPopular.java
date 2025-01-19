
package exercicio02poo_;

import java.util.Scanner;


public class carroPopular extends carro{
    float desconto = 0;
    Scanner ler = new Scanner(System.in);
    
    public void valorAtualizado(float valor) {
        System.out.println("Escreva o desconto: ");
        desconto = ler.nextFloat();
        valor = valor - desconto;
        System.out.println("O valor atualizado é " + valor);
    }
}
