package basica;

public class Cliente extends Pessoa {
    private String login;
    private String password;
    private Cliente() {
        super();
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    public Cliente(String nome, String cpf,   String login, String password) {
        super(nome, cpf);
        this.login = login;
        this.password = password;
    }







}
