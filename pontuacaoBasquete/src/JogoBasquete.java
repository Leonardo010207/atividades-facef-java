public class JogoBasquete {
    // Atributos
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    // Construtor
    public JogoBasquete(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Método para registrar pontos ( com validação do time e tipo )
    public void registrarPonto(String time, int tipo) {
        if (tipo < 1 || tipo > 3) {
            System.out.println("Pontuação inválida!!");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        } else {
            System.out.println("time inválido.");
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto += 1;
        } else System.out.println("Jogo encerrado");
    }

    public String toString() {
        return "placar atual: \n" +
                this.nomeTimeCasa + " " + this.pontosCasa +
                " x " +
                this.nomeTimeVisitante + " " + this.pontosVisitante +
                "\nPeriodo: " + this.periodoQuarto;
    }
}
