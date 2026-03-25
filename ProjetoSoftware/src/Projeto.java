import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.id = id;
        this.programadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramador() {
        return programadores;
    }

    public void setProgramador(ArrayList<Programador> programador) {
        this.programadores = programador;
    }

    public void agregarProgramador( Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        System.out.println("Programadores no projeto");
        for(Programador p : programadores) {
            System.out.println("- " + p.getNome());
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programador=" + programadores +
                '}';
    }
}
