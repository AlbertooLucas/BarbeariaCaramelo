package basica;

// Classe Basica, inicial
public class Barbearia {
    private String nome;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Barbearia(){

    }
    public Barbearia(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco =endereco;
    }
}
