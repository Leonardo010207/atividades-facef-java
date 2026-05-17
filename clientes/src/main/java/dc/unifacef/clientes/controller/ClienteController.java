package dc.unifacef.clientes.controller;

import dc.unifacef.clientes.model.Cliente;
import dc.unifacef.clientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> Listar() {
        List<Cliente> lista = clienteService.listar();
        return ResponseEntity.ok(lista); // 200 OK + lista no corpo
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente novo = clienteService.criar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo); // 201 Created
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarPorId(id);

        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        boolean removido = clienteService.remover(id);

        if(removido) {
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente clienteAtualizado) {

        Cliente atualizado = clienteService.atualizar(id, clienteAtualizado);

        if(atualizado != null) {
            return ResponseEntity.ok(atualizado); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
