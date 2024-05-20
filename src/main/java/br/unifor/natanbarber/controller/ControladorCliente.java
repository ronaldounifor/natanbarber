package br.unifor.natanbarber.controller;

import java.util.ArrayList;
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

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public ControladorCliente(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clientes;
    }

    @GetMapping("/{cpf}")
    public Cliente pegarDetalhesCliente(@PathVariable String cpf) {
        Cliente clienteDesejado = null;
        for (Cliente cliente : clientes)
            if(cpf.equals(cliente.getCpf())) { clienteDesejado = cliente; break; }

        return clienteDesejado;
    }

    @PostMapping
    public void adicionarCliente(@RequestBody Cliente cliente) {
        clientes.add(cliente);
    }

    @DeleteMapping("/{cpf}")
    public void removerCliente(@PathVariable String cpf) {
        Cliente clienteRemovido = pegarDetalhesCliente(cpf);
        clientes.remove(clienteRemovido);
    }
    
}