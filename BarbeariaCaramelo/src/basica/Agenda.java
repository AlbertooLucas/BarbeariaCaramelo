package basica;

import java.util.Date;
import java.util.Objects;

public class Agenda {
    private int numero;
    private String servico;
    private Date data;
    private String hora;
    private Boolean ativo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Agenda(int numero, String servico, Date data, String hora , Boolean ativo){
        this.numero = numero;
        this.servico = servico;
        this.data = data;
        this.hora = hora;
        this.ativo = ativo;

    }
    public void agendarHorario(Date data, String hora){

    }
    public void consultarHorario(){

    }
    public void cancelarHorario(){}
    @Override
    public int hashCode() {
        return Objects.hash(ativo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return  false;
        Agenda other = (Agenda) obj;
        return ativo = other.ativo;

    }

    @Override
    public String toString() {
        return "Agenda [ Ativo = "+ ativo + ", Numero = "+ numero + ", Servico "+ servico + ", Data = " + data+", Hora = " + hora + "]";
    }
}
