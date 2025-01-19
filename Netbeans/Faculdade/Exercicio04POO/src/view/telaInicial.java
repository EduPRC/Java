
package view;

import control.locadora;
import java.util.Scanner;
import model.Carro;


public class telaInicial {
    int op = 1;
    Scanner ler = new Scanner(System.in);
    locadora loca = new locadora();
    
    public void menu(){
        while(op != 0){
            System.out.println("Locadora de veiculos");
            System.out.println("[1] Fazer emprestimo");
            System.out.println("[2] Listar carros");
            System.out.println("[3] Listar carros disponiveis");
            System.out.println("[4] Listar carros indisponiveis");
            System.out.println("[5] Devolver carro");
            System.out.println("[0] Sair");
            System.out.println("Insira a opcao desejada:");
            op = ler.nextInt();
            ler.nextLine();
            if(op==1){
                Carro car = new Carro();
                System.out.println("Insira a marca: ");
                car.setMarca(ler.nextLine());
                System.out.println("Insira o modelo: ");
                car.setModelo(ler.nextLine());
                System.out.println("Insira o ano: ");
                car.setAno(ler.nextInt());
                System.out.println("Insira o km: ");
                car.setKm(ler.nextInt());
                System.out.println("O carro esta disponivel [1] nao esta [2]: ");
                car.setStatus(ler.nextInt());
                loca.inserirCarro(car);
            }
            if(op==2){
                loca.listarCarros();
            }
            if(op==3){
                loca.listarCarrosDisponiveis();
            }
            if(op==4){
                loca.listarCarrosIndisponiveis();
            }
            if(op==5){
                loca.devolverCarro();
            }
        }
    }
}
