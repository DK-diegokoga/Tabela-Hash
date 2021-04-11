package Estrutura;

public class Lista {
    private String Nome;
    private Lista Proximo;
    private String Descricao;

    public Lista(){        
    }

    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public Lista getProximo(){
        return Proximo;
    }
    public void setProximo(Lista Proximo){
        this.Proximo = Proximo;  
    }

    public String getDescricao(){
        return Descricao;
    }
    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }
}
