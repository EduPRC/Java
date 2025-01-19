
package control;

import java.util.ArrayList;
import model.livro;


public class biblioteca {
    //livro exemplar = new livro();
    ArrayList<livro> acervo = new ArrayList<>();
    
    public void inserirLivro(livro exemplar){
        acervo.add(exemplar);
        System.out.println("Livro cadastrado");
    }
    
   public void listarLivros() {
    if (acervo.isEmpty()) {
        System.out.println("Acervo vazio!!!");
    } else {
        for (livro livro : acervo) {
            livro.listaLivro(); 
        }
    }
}
   
   public void listarLivrosDisponivel() {
    if (acervo.isEmpty()) {
        System.out.println("Acervo vazio!!!");
    } else {
        for (livro livro : acervo) {
            livro.listaLivroDisponivel(); 
        }
    }
}
            
}
