
package aula02poo;

import java.util.Scanner;


public class Aula02POO {

   
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        float valor1, valor2;
        //cria objeto para leitura de dados
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor 1");
        valor1 = ler.nextFloat();
        System.out.println("Informe o valor 2");
        valor2 = ler.nextFloat();
        
        calc.divisao(valor1, valor2);
    }
    
}
