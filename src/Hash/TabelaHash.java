package Hash;
import Estrutura.*;

public class TabelaHash {
    MetodosLista Vetor[];

    public TabelaHash(){
        Vetor = new MetodosLista[26];
        iniciaLista();
    }

    public void iniciaLista(){
        for(int i = 0; i < 26; i++){
            Vetor[i] = new MetodosLista();
        }
    }

    public int funcaoHash(String Nome){
        Nome = Nome.toLowerCase();
        int Posicao = Nome.charAt(0);
        
        return Posicao - 97;
    }

    public void adiciona(String Nome, String Descricao){
        Vetor[funcaoHash(Nome)].adiciona(Nome, Descricao);
    }

    public void excluir(String Nome){
        System.out.println("Itens nesse indice" + "\n");
        Vetor[funcaoHash(Nome)].imprime();
        Vetor[funcaoHash(Nome)].remove(Nome);
        System.out.println("Indice depois de excluir alguns itens" + "\n");
        Vetor[funcaoHash(Nome)].imprime();
    }

    public void buscar(String Nome){
        System.out.println("O nome encontrado foi: ");
        Vetor[funcaoHash(Nome)].busca(Nome);
        
    }

    public static void main(String[]args){
        TabelaHash teste = new TabelaHash();

        teste.adiciona("Ariel", "É uma sereia que se apaixona por um humano, ganha pernas e perde a voz.");
        teste.adiciona("Alice", "Garota que caiu em um lugar muito doido, pelo motivo de seguir um coelho com um relogio.");
        teste.adiciona("Zabuza", "Não pode ser, é ele o demonio do gás oculto.");
        teste.adiciona("Naruto", "O Naruto pode ser um pouco duro às vezes, talvez você não saiba disso, mas o Naruto também cresceu sem pai. Na verdade ele nunca conheceu nenhum de seus pais, e nunca teve nenhum amigo em nossa aldeia. Mesmo assim eu nunca vi ele chorar, ficar zangado ou se dar por vencido, ele está sempre disposto a melhorar, ele quer ser respeitado, é o sonho dele e o Naruto daria a vida por isso sem hesitar. Meu palpite é que ele se cansou de chorar e decidiu fazer alguma coisa a respeito!");


        teste.Vetor[0].imprime();
        teste.Vetor[13].imprime();
        
        teste.Vetor[25].imprime();

        teste.excluir("Ariel");
        teste.buscar("Zabuza");
        
     }
}
