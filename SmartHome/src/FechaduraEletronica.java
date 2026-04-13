public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta = "1234";
    private boolean destravada = false;

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso CONCEDIDO! Fechadura destrancada.");
            destravada = true;
        } else {
            System.out.println("Acesso NEGADO! Senha incorreta.");
            destravada = false;
        }
    }

    @Override
    public void ligar() {
        if (destravada) {
            System.out.println("Fechadura eletrônica DESTRAVADA!");
        } else {
            System.out.println("Precisa validar acesso primeiro!");
        }
    }

    @Override
    public void desligar() {
        destravada = false;
        System.out.println("Fechadura eletrônica TRAVADA!");
    }

    public boolean estaDestravada() {
        return destravada;
    }
}