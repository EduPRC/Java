
package exercicio03poo;

import java.util.Scanner;


public class filmes {
    Scanner ler = new Scanner(System.in);
    String nome, duracao, genero;
    
    public void alugar(int qtd_dias, float valor) {
        System.out.println("Escreva o nome do filme: ");
        nome = ler.nextLine();
        System.out.println("Escreva a duracao do filme: ");
        duracao = ler.nextLine();
        System.out.println("Escreva o genero do filme: ");
        genero = ler.nextLine();
        
        valor = qtd_dias * valor;
        System.out.println("Filme: " + nome + "\n"+ "Duracao: " + duracao + "\n"+ "Genero: " + genero + "\n" + "O valor para alugar esse filme por " + qtd_dias + "dia/s e de " + valor);
    }
}
