package br.com.lanche.repositories;

import br.com.lanche.interfaces.LancheRepository;
import br.com.lanche.models.Lanche;

import java.util.ArrayList;
import java.util.List;

public class LancheRepositoryFirebase implements LancheRepository {
    private List<Lanche> lanches = new ArrayList<>();

    public List<Lanche> buscarTodos() {
        return null;
    }

    public Lanche buscarPorId(int id) {
        return null;
    }

    public void adicionar(Lanche lanche) {
        // Adicionar no firebase
    }

    public void excluir(int id) {
        // Exlcuir no firabase
    }

    public void atualizar(int id, Lanche lanche) {
        // Firebase
    }
}
