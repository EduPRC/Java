
package exercicio03poo;


public class filmes_lanc extends filmes{
    
    @Override
    public void alugar(int qtd_dias, float valor) {
        if (qtd_dias > 4){
            System.out.println("Nao e possivel alugar esse filme por 5 dias ou mais");
           
        } else {
            
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
}
