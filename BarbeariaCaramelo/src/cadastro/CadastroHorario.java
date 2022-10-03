package cadastro;

import basica.Agenda;
import repositorio.RepositorioAgenda;

import java.util.List;

//Serviria basicamente para controle de agendamento de horarios.
public class CadastroHorario {
    private RepositorioAgenda repositorioAgenda;

    public void agendarHorario(Agenda a){
        if(repositorioAgenda.consultarHorario(a.getAtivo()) == null);
            repositorioAgenda.agendarHorario(a);
    }
    public Agenda consultarHorario(boolean ativo){
        return repositorioAgenda.consultarHorario(ativo);
    }
    public List<Agenda> listarHorarios(){
        return repositorioAgenda.listarHorarios();
    }
    public CadastroHorario(RepositorioAgenda repositorioAgenda){
        this.repositorioAgenda = repositorioAgenda;
    }
}
