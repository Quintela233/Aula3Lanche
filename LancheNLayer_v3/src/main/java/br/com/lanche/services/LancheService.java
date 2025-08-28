package br.com.lanche.services;

import br.com.lanche.models.Lanche;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class LancheService {
    private static final String PASTA_IMAGENS = "produto_imagens/";

    public String salvarImagem(Lanche lanche) throws IOException, IOException {
        String caminhoImagem = lanche.getCaminhoImagem();

        Files.createDirectories(Paths.get(PASTA_IMAGENS));

        String nomeArquivo = Paths.get(caminhoImagem).getFileName().toString();

        Path destino = Paths.get(PASTA_IMAGENS + nomeArquivo);

        Files.copy(Paths.get(caminhoImagem), destino, StandardCopyOption.REPLACE_EXISTING);

        return destino.toString();
    }
}
