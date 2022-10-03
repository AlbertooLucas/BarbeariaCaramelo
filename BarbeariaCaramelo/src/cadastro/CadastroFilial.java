package cadastro;

import basica.Filial;
import repositorio.RepositorioFilial;

import java.util.List;

public class CadastroFilial {
    private RepositorioFilial repositorioFilial;

    public CadastroFilial(RepositorioFilial repositorioFilial){
        this.repositorioFilial = repositorioFilial;
    }
    public void cadastrarFilial(Filial a){
        repositorioFilial.cadastrarFilial(a);
    }
    public Filial procurarFilialNumero(int numero){
        return repositorioFilial.procurarFilialNumero(numero);
    }
    public void removerFilial(Filial a){
        repositorioFilial.removerFilial(a);
    }
    public void atualizarFilial(Filial a){
        repositorioFilial.atualizarFilial(a);
    }
    public List<Filial> listarFiliais(){
        return  repositorioFilial.listarFilial();
    }
}
