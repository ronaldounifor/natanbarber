package br.unifor.natanbarber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.unifor.natanbarber.model.Livro;

@RestController
@RequestMapping("/livros")
public class ControladorLivro {
    
    private final RestTemplate restTemplate;

    @Autowired
    public ControladorLivro(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public void adicionarLivro(@RequestBody Livro livro) {
        try {
            restTemplate.postForObject("https://cadastro-livros.onrender.com/biblioteca/cadastrar_livro/", livro, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
