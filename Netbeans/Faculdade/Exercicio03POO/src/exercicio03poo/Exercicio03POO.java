
package exercicio03poo;


public class Exercicio03POO {

    public static void main(String[] args) {
 
       filmes f = new filmes();
       
       f.alugar(4, 12.30f);
      
      filmes_antigos fa = new filmes_antigos();
      
      fa.alugar(4, 12.30f);
      
      filmes_lanc fl = new filmes_lanc();
      
      fl.alugar(5, 12.40f);
    }
    
}
