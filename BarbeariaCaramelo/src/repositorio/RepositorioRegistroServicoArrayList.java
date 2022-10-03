package repositorio;

import basica.RegistroServico;

import java.util.ArrayList;
import java.util.List;

public class RepositorioRegistroServicoArrayList implements RepositorioRegistroServico {
    private List<RegistroServico> registros;

    public RepositorioRegistroServicoArrayList(){
        this.registros = new ArrayList<RegistroServico>();
    }
    @Override
    public void adicionarRegistroServico(RegistroServico r){
        this.registros.add(r);
    }
    @Override
    public List<RegistroServico> listarRegistroServicos(RegistroServico r){
        return this.registros.stream()
                .filter(registro -> registro.getServico().equals(r) )
                .toList();
    }
}
