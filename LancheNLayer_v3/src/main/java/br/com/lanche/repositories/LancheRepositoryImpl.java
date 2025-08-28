package br.com.lanche.repositories;

import br.com.lanche.interfaces.LancheRepository;
import br.com.lanche.models.Lanche;

import java.util.ArrayList;
import java.util.List;

public class LancheRepositoryImpl implements LancheRepository {
    private List<Lanche> lanches = new ArrayList<>();

    public List<Lanche> buscarTodos() {
        return lanches;
    }

    public Lanche buscarPorId(int id) {
        return lanches
                .stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public void excluir(int id) {
        this.lanches.removeIf(l -> l.getId() == id);
    }

    public void atualizar(int id, Lanche lanche) {
        Lanche lancheInMemory = buscarPorId(id);

        lancheInMemory.setNome(lanche.getNome());
        lancheInMemory.setPreco(lanche.getPreco());
        lancheInMemory.setCaminhoImagem(lanche.getCaminhoImagem());
    }
}
