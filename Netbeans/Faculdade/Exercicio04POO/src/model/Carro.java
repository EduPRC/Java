
package model;


public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private float km;
    private int status;


    public String getModelo() {
        return modelo;
    }

   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    public int getAno() {
        return ano;
    }

    
    public void setAno(int ano) {
        this.ano = ano;
    }

 
    public float getKm() {
        return km;
    }

  
    public void setKm(float km) {
        this.km = km;
    }

   
    public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public void listaCarro(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getModelo());
        System.out.println("Km: " + getKm());
        if(getStatus()==1){
            System.out.println("Status: Disponivel \n");
        } else {
            System.out.println("Status: Não disponivel \n");
        }
    }
    
    public void listaCarroDisponivel(){
        if(getStatus()==1){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getModelo());
        System.out.println("Km: " + getKm());
               if(getStatus()==1){
                System.out.println("Status: Disponivel \n");
            } else {
                System.out.println("Status: Não disponivel \n");
            }
        }
    }
    
    public void listaCarroIndisponivel(){
        if(getStatus()==2){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getModelo());
        System.out.println("Km: " + getKm());
            if(getStatus()==1){
                System.out.println("Status: Disponive \nl");
            } else {
                System.out.println("Status: Não disponivel \n");
            }
        }
    }
}

  