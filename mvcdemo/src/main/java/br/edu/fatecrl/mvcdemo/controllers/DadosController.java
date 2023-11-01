package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class DadosController {
    private static final List<Filmes> filmes = new ArrayList<Filmes>();

    public DadosController(){ //Simulando um banco de dados
        filmes.add(new Filmes("Divertidamente", "Animação", 8.0));
        filmes.add(new Filmes("De Olhos Bem Fechados", "Suspense", 9.0));
        filmes.add(new Filmes("Vovózona", "Comédia", 5.0));
        filmes.add(new Filmes("Os Vingadroes", "Ficção", 7.0));
    }

    @GetMapping
    public List<Filmes> getFilmes() {
        return filmes;
    }
}
