public class TestaComputadorComponente {
    public void main(String[] args) {

        // Criando computador (já cria o processador junto)
        Computador pc = new Computador(
                1,
                "Dell",
                "Intel",
                "i7",
                3.5
        );

        System.out.println(pc.toString());
    }
}