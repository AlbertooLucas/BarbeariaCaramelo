package cadastro;

import basica.RegistroServico;
import repositorio.RepositorioRegistroServico;

import java.util.List;

public class CadastroRegistroServico {
    private RepositorioRegistroServico repositorioRegistroServico;

    public CadastroRegistroServico(RepositorioRegistroServico repositorioRegistroServico){
        this.repositorioRegistroServico = repositorioRegistroServico;
    }
    public void adicionarRegistroServico(RegistroServico r){
        repositorioRegistroServico.adicionarRegistroServico(r);
    }
    public List<RegistroServico> listarRegistroServicos(RegistroServico r){
        return  repositorioRegistroServico.listarRegistroServicos(r);
    }
}
