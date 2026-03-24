public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public double mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        if (this.plano == "Básico") {
            this.mensalidade = 25.90;
        } else if (this.plano == "Premium") {
            this.mensalidade = 45.90;
        } else if (this.plano == "Família") {
            this.mensalidade = 60.90;
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + this.ultimoFilmeAssistido);
        } else System.out.println("É preciso pagar a fatura para assistir ao filme");
    }

    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada com sucesso");
    }

    public String toString() {
        String status;
        if (!this.ativo) {
            status = "Suspenso";
        } else {
            status = "Ativo";
        }

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido;
    }
}