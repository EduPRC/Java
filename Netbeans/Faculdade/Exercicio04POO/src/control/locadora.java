
package control;

import java.util.ArrayList;
import java.util.Scanner;
import model.Carro;


public class locadora {
    ArrayList<Carro> acervo = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    
    public void inserirCarro(Carro exemplar){
        acervo.add(exemplar);
        System.out.println("Emprestimo feito \n");
    }
    
    public void listarCarros(){
        if(acervo.isEmpty()){
            System.out.println("Acervo vazio!!! \n");
        } else {
            for (Carro carro : acervo) {
                carro.listaCarro();
            }
        }
    }
    
    public void listarCarrosDisponiveis(){
        if(acervo.isEmpty()){
            System.out.println("Acervo vazio!!! \n");
        } else {
            for (Carro carro : acervo) {
                carro.listaCarroDisponivel();
            }
        }
    }
    
    public void listarCarrosIndisponiveis(){
        if(acervo.isEmpty()){
            System.out.println("Acervo vazio!!!");
        } else {
            for (Carro carro : acervo) {
                carro.listaCarroIndisponivel();
            }
        }
    }
    
    public void devolverCarro(){
        if(acervo.isEmpty()){
            System.out.println("Acervo vazio!!!");
        } else {
            System.out.println("Insira o indice: ");
            acervo.remove(ler.nextInt());
        }
    }
}
