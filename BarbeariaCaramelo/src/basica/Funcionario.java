package basica;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String cargo, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void reajustarSalario(float novoSalario){
        this.salario = novoSalario;
    }
}
