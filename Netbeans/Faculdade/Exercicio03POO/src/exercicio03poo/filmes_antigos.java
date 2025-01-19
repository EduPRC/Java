
package exercicio03poo;

import java.util.Scanner;


public class filmes_antigos extends filmes {
    
    Scanner ler = new Scanner(System.in);
    float desconto;
    
    @Override
    public void alugar(int qtd_dias, float valor) {
        
        System.out.println("Escreva o nome do filme: ");
        nome = ler.nextLine();
        System.out.println("Escreva a duracao do filme: ");
        duracao = ler.nextLine();
        System.out.println("Escreva o genero do filme: ");
        genero = ler.nextLine();
        
        System.out.println("Digite o desconto: ");
        desconto = ler.nextFloat();
        
        valor = qtd_dias * valor;
        if (qtd_dias > 2) {
            valor =  valor - desconto;
        }
        System.out.println("Filme: " + nome + "\n"+ "Duracao: " + duracao + "\n"+ "Genero: " + genero + "\n" + "O valor para alugar esse filme por " + qtd_dias + "dia/s e de " + valor);
    }
}
