
package model;


public class livro {
    private String nome;
    private String autor;
    private String editora;
    private String genero;
    private int numpg;
    private int edicao;
    private int status;

 
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getAutor() {
        return autor;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getEditora() {
        return editora;
    }

    
    public void setEditora(String editora) {
        this.editora = editora;
    }

    
    public int getNumpg() {
        return numpg;
    }

    
    public void setNumpg(int numpg) {
        this.numpg = numpg;
    }

    
    public int getEdicao() {
        return edicao;
    }

    
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public int getStatus() {
        return status;
    }

   
    public void setStatus(int status) {
        this.status = status;
    }
    
    public void listaLivro(){
        System.out.println("Titulo: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora: " + getEditora());
        System.out.println("Genero: " + getGenero());
        System.out.println("Numero de paginas: " + getNumpg());
        System.out.println("Edição: " + getEdicao());
        if(getStatus()==1){
            System.out.println("Status: Emprestado \n");
        }else {
            System.out.println("Status: Disponivel \n");
        }
        
    }
    
    public void listaLivroDisponivel(){
        if(getStatus()==2){
        System.out.println("Titulo: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora: " + getEditora());
        System.out.println("Genero: " + getGenero());
        System.out.println("Numero de paginas: " + getNumpg());
        System.out.println("Edição: " + getEdicao());
        if(getStatus()==1){
            System.out.println("Status: Emprestado \n");
        }else {
            System.out.println("Status: Disponivel \n");
        }
        
    }else {
            System.out.println("Não existem livros disponiveis");
    }
}
}