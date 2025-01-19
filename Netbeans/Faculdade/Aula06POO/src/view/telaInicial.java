
package view;

import control.biblioteca;
import java.util.Scanner;
import model.livro;


public class telaInicial {
    int op = 1;
    Scanner ler = new Scanner(System.in);
    biblioteca bibli = new biblioteca();
       
    public void menu(){
        while(op != 0) {
        System.out.println("Blibioteca");
        System.out.println("[1] Inserir livro");
        System.out.println("[2] Listar acervo");
        System.out.println("[3] Listar Disponiveis");
        System.out.println("[0] Sair");
        System.out.println("Insira opção desejada:");
        op = ler.nextInt();
        ler.nextLine();
        if(op==1){
            livro item = new livro();
            System.out.println("Insira o nome do livro: ");
            item.setNome(ler.nextLine());
            System.out.println("Insira o nome do autor");
            item.setAutor(ler.nextLine());
            System.out.println("Insira o nome da editora: ");
            item.setEditora(ler.nextLine());
            System.out.println("Insira o genero: ");
            item.setGenero(ler.nextLine());
            System.out.println("Insira o numero de paginas: ");
            item.setNumpg(ler.nextInt());
            System.out.println("Insira a edição do livro: ");
            item.setEdicao(ler.nextInt());
            System.out.println("O livro esta emprestado [1] sim [2] não");
            item.setStatus(ler.nextInt());
            bibli.inserirLivro(item);
        }
        if(op==2){
            bibli.listarLivros();
        }
        if(op==3){
            bibli.listarLivrosDisponivel();
        }
        
        }
    }
       
}
