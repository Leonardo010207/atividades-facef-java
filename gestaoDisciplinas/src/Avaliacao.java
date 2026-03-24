import java.util.ArrayList;

public class Avaliacao {
    private String id, nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.questoes = new ArrayList<>();
    }

    public Avaliacao(String id, String nome, ArrayList<Questao> questoes) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        this.questoes.add(q);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", questoes=" + questoes +
                '}';
    }
}
