package repositorio;

import basica.Agenda;

import java.util.List;

public interface RepositorioAgenda {
    public void agendarHorario(Agenda a);
    public Agenda consultarHorario(boolean ativo);
    public void cancelarHorario(Agenda a);
    public List<Agenda> listarHorarios();

}
