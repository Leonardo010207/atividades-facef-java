public class Checkout {
    public void main(String[] args) {
        Pagamento camaleao;

        camaleao = new CartaoCredito();
        camaleao.autorizar(700); //polimorfismo
        camaleao.exibirComprovante(); //polimorfismo

        camaleao = new Pix();
        camaleao.autorizar(300); //polimorfismo
        camaleao.exibirComprovante(); //polimorfismo
    }
}
