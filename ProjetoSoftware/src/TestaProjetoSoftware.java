public class TestaProjetoSoftware {
    public void main(String[] args) {
        Programador p1 = new Programador(123, "Leonardo", "Java");
        Programador p2 = new Programador(345, "Marcio", "Javascript");
        Programador p3 = new Programador(336, "Caio", "Python");

        Projeto proj1 = new Projeto(134, "ProjetoSoftware");

        proj1.agregarProgramador(p1);
        proj1.agregarProgramador(p2);
        proj1.agregarProgramador(p3);

        proj1.listarProgramadores();
    }
}
