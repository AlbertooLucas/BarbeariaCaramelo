package repositorio;

import basica.Agenda;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAgendaArrayList implements  RepositorioAgenda{
    private List<Agenda> horarios;

    public RepositorioAgendaArrayList(){
        this.horarios = new ArrayList<Agenda>();
    }
    @Override
    public void agendarHorario(Agenda a){
        this.horarios.add(a);
    }
    @Override
    public void cancelarHorario(Agenda a){
        this.horarios.remove(a);
    }

    @Override
    public Agenda consultarHorario(boolean ativo){
        for(Agenda a: this.horarios){
            if(a.getAtivo().equals(ativo))
                return a;
        }
        return null;
    }
    @Override
    public List<Agenda> listarHorarios(){
        return this.horarios;
    }
}
