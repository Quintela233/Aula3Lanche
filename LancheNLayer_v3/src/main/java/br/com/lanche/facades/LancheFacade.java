package br.com.lanche.facades;

import br.com.lanche.applications.LancheApplication;
import br.com.lanche.models.Lanche;

import java.io.IOException;
import java.util.List;

public class LancheFacade {
    private final LancheApplication lancheApplication;

    public LancheFacade(LancheApplication lancheApplication) {
        this.lancheApplication = lancheApplication;
    }

    public List<Lanche> buscarTodos() throws IOException {
        return this.lancheApplication.buscarTodos();
    }

    public Lanche buscarPorId(int id) throws IOException {
        return this.lancheApplication.buscarPorId(id);
    }

    public void adicionar(Lanche lanche) throws IOException {
        this.lancheApplication.adicionar(lanche);
    }

    public void excluir(int id) throws IOException {
        this.lancheApplication.excluir(id);
    }

    public void atualizar(int id, Lanche lanche) throws IOException {
        this.lancheApplication.atualizar(id, lanche);
    }

    public double calcularTotal(Lanche lanche, int quantidade) {
        return this.lancheApplication.calcularTotal(lanche, quantidade);
    }
}
