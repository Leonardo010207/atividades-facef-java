package dc.unifacef.clientes.services;

import dc.unifacef.clientes.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente criar(Cliente c) {
        c.setId(nextId++);
        clientes.add(c);
        return c;
    }

    public Cliente buscarPorId(Long id) {
        for(Cliente c : clientes) {
            if(c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean remover(Long id) {
        for(int i = 0; i < clientes.size();i++) {
            if(clientes.get(i).getId().equals(id)) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente atualizar(Long id, Cliente novo) {
        Cliente existente = buscarPorId(id);

        if(existente != null) {
            existente.setNome(novo.getNome());
            existente.setEmail(novo.getEmail());
            existente.setIdade(novo.getIdade());
            return existente;
        }
        return null;
    }
}
