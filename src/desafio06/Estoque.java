package desafio06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estoque {

    HashMap<String, Integer> estoque = new HashMap<>();

    public void adicionarProduto(String nome, Integer quantidade){
        int atual = estoque.getOrDefault(nome, 0);
        estoque.put(nome, atual + quantidade);
    }

    public void removerProduto(String nome){
        estoque.remove(nome);
    }

    public void consultarQuantidade(String nome){
        if (estoque.containsKey(nome)){
            System.out.println(nome + ": " + estoque.get(nome));
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void listarTodos(){
        for(Map.Entry<String, Integer> entry : estoque.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public ArrayList<String> produtosComEstoqueBaixo(int limite){
        ArrayList<String> resultado = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : estoque.entrySet()){
            if (entry.getValue() < limite){
                resultado.add(entry.getKey());
            }
        }
        return resultado;
    }
}