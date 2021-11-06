package lib;

public class Matriculas extends Turmas{
    private int id_matricula;
    private int turmas_fk;
    private int alunos_fk;
    private String data_matriculas;

    public Matriculas() {
    }

    public int getTurmas_fk() {
        return turmas_fk;
    }

    public void setTurmas_fk(int turmas_id) {
        this.turmas_fk = turmas_id;
    }

    public int getAlunos_fk() {
        return alunos_fk;
    }

    public void setAlunos_fk(int alunos_id) {
        this.alunos_fk = alunos_id;
    }

    public String getData_matriculas() {
        return data_matriculas;
    }

    public void setData_matriculas(String data_matriculas) {
        this.data_matriculas = data_matriculas;
    }

}
