import java.util.ArrayList;

public class TestaAcademico {
    public void main(String[] args) {
        Aluno a1 = new Aluno(123, "Leonardo", "35469", "SI");
        Aluno a2 = new Aluno(126, "Marcio", "47572", "Engenharia de Software");

        Disciplina d1 = new Disciplina(10, "Paradigmas da Programação", "Prof. Daniel");

        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        d1.criarAvaliacao(1, "Prova semestral");

        Avaliacao provaSemestral = d1.buscarAvaliacao(1);

        provaSemestral.adicionarQuestao(1, "Explique o conceito de herança em POO", 3.0f);
        provaSemestral.adicionarQuestao(2, "Qual a diferença entre agragação e composição", 3.5f);
        provaSemestral.adicionarQuestao(3, "Implemente uma classe abstrata com um método polimorfo", 3.5f);

        System.out.println(d1);
    }
}
