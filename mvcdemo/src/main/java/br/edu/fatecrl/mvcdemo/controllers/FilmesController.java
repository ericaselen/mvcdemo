package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Filmes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes") //definir como vai ser a URL
public class FilmesController {
    private static final List<Filmes> filmes = new ArrayList<Filmes>();

    public FilmesController(){ //Simulando um banco de dados
        filmes.add(new Filmes("Divertidamente", "Animação", 8.0));
        filmes.add(new Filmes("De Olhos Bem Fechados", "Suspense", 9.0));
        filmes.add(new Filmes("Vovózona", "Comédia", 5.0));
        filmes.add(new Filmes("Os Vingadroes", "Ficção", 7.0));
    }

    @GetMapping //método padrão da URL (vai executar isso)
    public String getFilmes(Model model){
        model.addAttribute("filmes", filmes);
        return "filmes";
    }
}
