/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01poo;

/**
 *
 * @author Aluno
 */
public class calcula_salario {
    float resultado, porcentagem;
    
    public void calcula(float salario){
        porcentagem = (float) (salario * 0.05);
        resultado = salario - porcentagem;
        System.out.println("O salario com o desconto é: " + resultado + "e o desconto" + porcentagem);
    }
}
