
package exercicio02poo_;

import java.util.Scanner;


public class Exercicio02POO_ {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        carroPopular cp = new carroPopular();
        
        System.out.println("Escreva o ano: ");
        cp.ano = ler.next();
        System.out.println("Escreva o valor: ");
        cp.valor = ler.nextFloat();
        System.out.println("Escreva a marca: ");
        cp.marca = ler.next();
        
        cp.valorAtualizado(cp.valor);
        
        carroLuxo cl = new carroLuxo();
        
        System.out.println("Escreva o ano: ");
        cl.ano = ler.next();
        System.out.println("Escreva o valor: ");
        cl.valor = ler.nextFloat();
        System.out.println("Escreva a marca: ");
        cl.marca = ler.next();
        
        cl.calculo_imposto(cl.valor);
    }
    
}
