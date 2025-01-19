
package exercicio02poo_;


public class carroLuxo extends carro{
    float imposto;
    
    public void calculo_imposto(float valor){
        imposto = valor * 0.05f;
        System.out.println("Imposto " + imposto);
        float valor1 = valor - imposto;
        System.out.println("Valor apos o imposto " + valor1);
    }
}
