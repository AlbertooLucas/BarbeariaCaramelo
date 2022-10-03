package repositorio;

import basica.Filial;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Locale.filter;

public class RepositorioFilialArrayList implements  RepositorioFilial {
    private List<Filial> filiais;

    public RepositorioFilialArrayList(){
        this.filiais = new ArrayList<Filial>();
    }

    public void cadastrarFilial(Filial a){
        this.filiais.add(a);
    }



    public Filial procurarFilialNumero(int numero){
        return this.filiais.stream()
                .filter(filial -> Objects.equals(filial.getNumero(), numero))
                .findAny()
                .orElse(other:null);
    }

    public void removerFilial(Filial a){
        this.filiais.remove(a);
    }

    public void atualizarFilial(Filial a){
        this.filiais.remove(a);
        this.filiais.add(a);
    }

    @Override
    public List<Filial> listarFilial() {
        return null;
    }

    public List<Filial> listarFiliais(){
        return this.filiais;
    }


}
