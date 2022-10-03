package fachada;

import basica.Agenda;
import basica.Cliente;
import basica.Filial;
import cadastro.CadastroCliente;
import cadastro.CadastroFilial;
import cadastro.CadastroHorario;
import cadastro.CadastroRegistroServico;
import repositorio.*;

import java.util.List;

public class BarbeariaFachada {
    private CadastroFilial cadastroFilial;
    private CadastroCliente cadastroCliente;
    private CadastroHorario cadastroHorario;
    private CadastroRegistroServico cadastroRegistroServico;

    private static BarbeariaFachada instancia;

    public static BarbeariaFachada getInstancia(){
        if(instancia == null)
            BarbeariaFachada.instancia = new BarbeariaFachada();
        return instancia;
    }

    private BarbeariaFachada (){
        this.cadastroFilial = new CadastroFilial(new RepositorioFilialArrayList());
        this.cadastroCliente = new CadastroCliente(new RepositorioClienteArrayList());
        this.cadastroHorario = new CadastroHorario(new RepositorioAgendaArrayList());
        this.cadastroRegistroServico = new CadastroRegistroServico(new RepositorioRegistroServicoArrayList());
    }
    public void setCadastroFilial(Filial f){
        cadastroFilial.cadastrarFilial(f);
    }
    public Filial procurarFilialNumero(int numero){
        return cadastroFilial.procurarFilialNumero(numero);
    }
    public void removerFilial(Filial f){
        cadastroFilial.removerFilial(f);
    }
    public void atualizarFilial(Filial f){
        cadastroFilial.atualizarFilial(f);
    }
    public List<Filial> listarFiliais(){
        return cadastroFilial.listarFiliais();
    }
    public RepositorioCliente getRepositorioCliente(){
        return cadastroCliente.getRepositorioCliente();
    }
    public void adicionarcliente(Cliente c){
        cadastroCliente.adicionarCliente(c);
    }
    public Cliente procurarClienteNome(String nome){
        return cadastroCliente.procurarClienteNome(nome);
    }
    public Cliente procurarClienteCpf(String cpf){
        return cadastroCliente.procurarClienteCpf(cpf);
    }
    public List<Cliente> listarClientes(){
        return cadastroCliente.listarClientes();
    }
    public void atualizarCliente(Cliente c){
        cadastroCliente.atualizarCliente(c);
    }
    public void Agenda agendarHorario(Agenda a){
        cadastroHorario.agendarHorario(a);
    }


}
