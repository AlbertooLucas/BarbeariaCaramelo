package repositorio;

import basica.Filial;

import java.util.List;

public interface RepositorioFilial {
    void cadastrarFilial(Filial a);

    Filial procurarFilialNumero(int numero);

    Filial procurarFilialMunicipio(String municipio);

    void removerFilial(Filial a);
    void atualizarFilial(Filial a);

    List<Filial> listarFilial();
}
