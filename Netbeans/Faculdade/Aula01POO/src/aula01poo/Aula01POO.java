
package aula01poo;

import java.util.Scanner;


public class Aula01POO {

  
    public static void main(String[] args) {
        //Cria uma instancia da scanner (leitura de dados)
        Scanner ler = new Scanner(System.in);
        // cria objeto veiculo
        ClasseCarro veiculo = new ClasseCarro();
        
        System.out.println("Informe o nome do veiculo: ");
        veiculo.nome = ler.nextLine();
        
        System.out.println("Informe o ano de fabricação do veiculo: ");
        veiculo.ano_fabricacao = ler.nextInt();
        ler.nextLine();
        System.out.println("Informe a marca do veiculo: ");
        veiculo.marca = ler.nextLine();
        
        System.out.println("Informe o modelo do veiculo: ");
        veiculo.modelo = ler.nextLine();
        
        System.out.println("Informe o valor do veiculo: ");
        veiculo.valor = ler.nextFloat();
        
        System.out.println("O carro de nome: " + veiculo.nome);
        System.out.println("Com a marca: " + veiculo.marca);
        System.out.print("Está...");
        
        //métodos
        veiculo.acelerar();
    }
    
}
