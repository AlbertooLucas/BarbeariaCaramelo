package cadastro;

import basica.Cliente;
import repositorio.RepositorioCliente;

import java.util.List;

public class CadastroCliente {
    private RepositorioCliente repositorioCliente;

    public CadastroCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public RepositorioCliente getRepositorioCliente() {
        return repositorioCliente;
    }

    public void setRepositorioCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }
    public void adicionarCliente(Cliente c){
        repositorioCliente.adicionarCliente(c);
    }
    public Cliente procurarClienteNome(String nome){
        return  repositorioCliente.procurarClienteNome(nome);

    }
    public Cliente procurarClienteCpf(String cpf){
        return repositorioCliente.procurarClienteCpf(cpf);
    }
    public List<Cliente> listarClientes(){
        return repositorioCliente.listarClientes();
    }
    public void atualizarCliente(Cliente c){
        repositorioCliente.atualizarCliente(c);
    }
}
