package br.unifor.natanbarber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifor.natanbarber.model.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String> {
    
}
