
package aula02poo;

import java.util.Scanner;


public class Calculadora {//classe
   float conta; //atributo
     
   // metodos
   public void soma(float valor1, float valor2){     
       conta = valor1 + valor2;
       System.out.println("O resultado da soma é " + conta);
       
   }
   
   public void subtracao(float valor1, float valor2){
       conta = valor1 - valor2;
       System.out.println("O resultado da subtração é " + conta);
       
   }
   
   public void multiplicacao(float valor1, float valor2){
       conta = valor1 * valor2;
       System.out.println("O resultado da multiplicação é " + conta);
       
   }
   
   public void divisao(float valor1, float valor2){
       conta = valor1 / valor2;
       System.out.println("O resultado da divisão é " + conta);
       
   }
}
