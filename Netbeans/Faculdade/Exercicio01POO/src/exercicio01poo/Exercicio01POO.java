
package exercicio01poo;

import java.util.Scanner;


public class Exercicio01POO {

    
    public static void main(String[] args) {
        calcula_salario calc = new calcula_salario();
        
        String nome, telefone;
        float salario;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = ler.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = ler.nextLine();
        System.out.println("Digite o salario: ");
        salario = ler.nextFloat();
        
        calc.calcula(salario);
    }
    
}
