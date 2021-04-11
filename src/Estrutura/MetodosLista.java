package Estrutura;

public class MetodosLista {
    Lista Primeiro;
    Lista Ultimo;
    int Tamanho = 0;

    public MetodosLista() {
        Primeiro = null;
        Ultimo = Primeiro;
    }

    public void adiciona(String Nome, String Descricao) {
        if (Primeiro == null) {
            Primeiro = new Lista();
            Ultimo = Primeiro;
            Lista novaLista = new Lista();
            novaLista.setNome(Nome);
            novaLista.setDescricao(Descricao);
            novaLista.setProximo(null);
            Ultimo.setProximo(novaLista);
            Ultimo = novaLista;
            Tamanho++;
        } else {
            Lista novaLista = new Lista();
            novaLista.setNome(Nome);
            novaLista.setDescricao(Descricao);
            novaLista.setProximo(null);
            Ultimo.setProximo(novaLista);
            Ultimo = novaLista;
            Tamanho++;
        }

    }

    public void imprime() {
        Lista Percorre = Primeiro.getProximo();
        while (Percorre != null) {
            System.err.println("Nome = " +  Percorre.getNome());
            System.err.println("Descrição = " +  Percorre.getDescricao() + "\n");


            Percorre = Percorre.getProximo();
        }
    }

    public void remove(String nomeRemover) {
        Lista Remove = Primeiro.getProximo();
        Lista Sentinela = Primeiro;
        if (Primeiro != null) {
            while (Remove != null) {
                if (Remove.getNome().equals(nomeRemover)) {
                    if (Remove.getProximo() == null) {
                        Ultimo = Sentinela;
                        Ultimo.setProximo(null);
                        Remove = null;
                        Tamanho--;
                        break;
                    } else {
                        Sentinela.setProximo(Remove.getProximo());
                        Remove = null;
                        Tamanho--;
                        break;
                    }

                }
                Remove = Remove.getProximo();
                Sentinela = Sentinela.getProximo();
            }

            System.gc();
        }
    }

    public void busca(String Nome){
        Lista Percorre = Primeiro.getProximo();
        boolean encontrou = false;
        while(Percorre != null){
            if(Percorre.getNome().equals(Nome)){
                System.out.println("Nome : " + Percorre.getNome());
                System.out.println("Descrição: " + Percorre.getDescricao());
                encontrou = true;
                break;
            }Percorre = Percorre.getProximo();

        }
        if (encontrou != true){
            System.out.println("Nome não encontrada");
        }
    }
}