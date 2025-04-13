package redeinova.jornalfacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import redeinova.jornalfacil.models.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCodigo(String codigo);

}
