package br.unifor.natanbarber.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.natanbarber.model.Cliente;
import br.unifor.natanbarber.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ControladorCliente {

    private ClienteService service;

    public ControladorCliente(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.listarClientes();
    }

    @GetMapping("/{cpf}")
    public Cliente pegarDetalhesCliente(@PathVariable String cpf) {
        return service.pegarDetalhesCliente(cpf);
    }

    @PostMapping
    public void adicionarCliente(@RequestBody Cliente cliente) {
        service.adicionarCliente(cliente);
    }

    @DeleteMapping("/{cpf}")
    public void removerCliente(@PathVariable String cpf) {
        service.removerCliente(cpf);
    }
    
}