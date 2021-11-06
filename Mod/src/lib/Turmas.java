package lib;

public class Turmas extends Instrutores{
    private int id_turma;
    private int fk_instrutores;
    private int fk_curso;
    private String data_inicio;
    private String data_final;
    private int carga_horaria;

    public Turmas() {

    }

    public int getFk_instrutores() {
        return fk_instrutores;
    }

    public void setFk_instrutores(int id_instrutores) {
        this.fk_instrutores = id_instrutores;
    }

    public int getFk_curso() {
        return fk_curso;
    }

    public void setFk_curso(int id_curso) {
        this.fk_curso = id_curso;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

}
