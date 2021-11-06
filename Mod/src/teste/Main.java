package teste;

import lib.*;

public class Main {
    public static void main(String[] args) {

        Alunos al1 = new Alunos();
        al1.setNome("aluno 1");
        al1.setEmail("aluno1@teste.com");
        al1.setFone("75 98");
        al1.setCpf("40028922");
        al1.setData("2020-01-29");
        System.out.println(al1.getNome());
        System.out.println(al1.getEmail());
        System.out.println(al1.getFone());
        System.out.println(al1.getCpf());
        System.out.println(al1.getData());
        
        
        
        Turmas t = new Turmas();
        Matriculas m = new Matriculas();
        Curso c = new Curso();
        Instrutores inst = new Instrutores();




    }
}
