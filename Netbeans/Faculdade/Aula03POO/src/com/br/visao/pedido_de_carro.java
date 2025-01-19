
package com.br.visao;

import com.br.controle.controle_pedido;
import com.br.modelo.modelo_pedido;
import java.util.Scanner;


public class pedido_de_carro {
    
    public static void menu(){
        Scanner ler = new Scanner (System.in);
        modelo_pedido mod = new modelo_pedido();
        controle_pedido control = new controle_pedido();
        int op;
        String cor;
        System.out.println("Menu de opções:");
        System.out.println("[1] Fusion");
        System.out.println("[2] Corola");
        System.out.println("[3] Honda Civic");
        System.out.println("Informe a opção desejada");
        op = ler.nextInt();
        System.out.println("Informe a cor do carro:");
        cor = ler.next();
        mod.setCor(cor);
        mod.setOpcao(op);
        control.informacao(mod.getOpcao(), mod.getCor());
        
    }
}
