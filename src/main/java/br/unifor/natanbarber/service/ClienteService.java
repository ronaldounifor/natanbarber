package br.unifor.natanbarber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.unifor.natanbarber.model.Cliente;
import br.unifor.natanbarber.repository.ClienteRepositorio;

@Service
public class ClienteService {
    private ClienteRepositorio repositorio;

    public ClienteService(ClienteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarCliente(Cliente cliente) {
        repositorio.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return repositorio.findAll();
    }

    public Cliente pegarDetalhesCliente(String cpf) {
        return repositorio.getReferenceById(cpf);
    }

    public void removerCliente(String cpf) {
        repositorio.delete(pegarDetalhesCliente(cpf));
    }
}
