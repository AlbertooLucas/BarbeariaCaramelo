package basica;

import java.util.Date;

public class RegistroServico {
    private String servico;
    private Date data;
    private String hora;
    private float valor;

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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public RegistroServico(String servico, Date data, String hora, float valor){
        this.servico = servico;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
    }
    public RegistroServico(){
    }

}

