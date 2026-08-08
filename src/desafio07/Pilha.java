package desafio07;

import java.util.ArrayList;
import java.util.List;

public class Pilha <T>{

    private List<T> conteudo = new ArrayList<>();

    public void push(T item){
        conteudo.add(item);
    }

    public T pop(){
        if (conteudo.isEmpty()){
            throw new RuntimeException("A Pilha está vazia");
        }
      return conteudo.remove(conteudo.size() - 1);
    }

    public T peek(){
        if (conteudo.isEmpty()) {
            throw new RuntimeException("A Pilha está vazia");
        }
        return conteudo.get(conteudo.size() - 1);
    }

    public boolean isEmpty() {
        return conteudo.isEmpty();
    }

    public int tamanho(){
       return conteudo.size();
    }

    public void exibir(){
        for (int i = 0; i < conteudo.size(); i++) {
            System.out.println(conteudo.get(i));
        }
    }


}


