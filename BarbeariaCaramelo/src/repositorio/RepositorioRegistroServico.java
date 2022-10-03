package repositorio;

import basica.RegistroServico;

import java.util.List;

public interface RepositorioRegistroServico {
    void adicionarRegistroServico(RegistroServico r);

    List<RegistroServico> listarRegistroServicos(RegistroServico r);
}
