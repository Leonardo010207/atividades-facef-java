public class TestaVeiculo {
    public void main(String[] args){
        Aviao av1 = new Aviao("Boeing", "737", 850, 12000);
        CarroEletrico car1 = new CarroEletrico("Tesla", "Model 3", 120, 150);

        av1.mover();
        av1.abastecer();

        car1.mover();
        car1.abastecer();

        Veiculo v;
        v = av1;
        v.mover();

        v = car1;
        v.mover();
    }
}
