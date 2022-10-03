package repositorio;

import basica.Cliente;

import java.util.List;

public interface RepositorioCliente {
    void adicionarCliente( Cliente c);


    Cliente procurarClienteNome(String nome);

    Cliente procurarClienteCpf(String cpf);

    List<Cliente> listarClientes();

    void atualizarCliente(Cliente c);
}
