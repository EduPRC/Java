package aula05poo;

import java.util.Scanner;


public class Aula05POO {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        filho filhoa = new filho();
        filhob sfilho = new filhob();
        filhoa.calculaSalario(10000, "joao");
        sfilho.calculaSalario(10000, "maria");
    }
    
}
