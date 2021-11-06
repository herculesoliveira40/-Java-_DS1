package lib;

public class Instrutores extends Curso {
    private int id_instrutores;
    private String nome;
    private String email;
    private int valor_hora;
    private String certificados;

    public Instrutores() {

    }

    public int getId_instrutores() {
        return id_instrutores;
    }

    public void setId_instrutores(int id_instrutores) {
        this.id_instrutores = id_instrutores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }

    public String getCertificados() {
        return certificados;
    }

    public void setCertificados(String certificados) {
        this.certificados = certificados;
    }



}
