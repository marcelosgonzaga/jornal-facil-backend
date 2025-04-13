package redeinova.jornalfacil.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redeinova.jornalfacil.models.Cliente;
import redeinova.jornalfacil.services.ClienteService;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Cliente> getByCodigo(@PathVariable String codigo){
        Optional<Cliente> cliente = clienteService.buscarPorCodigo(codigo);
        return cliente.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

}
