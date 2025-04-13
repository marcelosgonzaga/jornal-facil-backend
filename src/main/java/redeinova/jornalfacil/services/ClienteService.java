package redeinova.jornalfacil.services;

import org.springframework.stereotype.Service;
import redeinova.jornalfacil.models.Cliente;
import redeinova.jornalfacil.repositories.ClienteRepository;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Optional<Cliente>buscarPorCodigo(String codigo){
        return clienteRepository.findByCodigo(codigo);
    }
}
