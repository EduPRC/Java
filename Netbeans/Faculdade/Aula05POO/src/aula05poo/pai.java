
package aula05poo;


public class pai {
    
    float desconto, salariofinal;
    
   public void calculaSalario(float salario, String nome){
       desconto = salario * 0.03f;
       salariofinal = salario - desconto;
       System.out.println("O funcionario de nome " + nome);
       System.out.println("Recebe salario de " + salario);
       System.out.println("É descontado " + desconto);
       System.out.println("O salario final é " + salariofinal);
               
   }
}
