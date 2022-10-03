package basica;

import java.util.Objects;

public class Filial {
    private String nome;
    private  int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Filial(){

    }
    public Filial(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass());
            return false;
        //Filial other = (Filial) obj;
        //return numero == other.numero;

    }
}
