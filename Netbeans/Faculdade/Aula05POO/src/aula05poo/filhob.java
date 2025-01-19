
package aula05poo;

public class filhob extends pai{
    
    String agradecimento = "Obrigado!";
    float bonus = 500;
    
    @Override
    public void calculaSalario(float salario, String nome){
       desconto = salario * 0.10f;
       salariofinal = salario - desconto;
       System.out.println("O funcionario de nome " + nome);
       System.out.println("Recebe salario de " + salario);
       System.out.println("É descontado " + desconto);
       System.out.println("O salario final é " + (salariofinal + bonus));
       System.out.println(agradecimento);
   }
}
