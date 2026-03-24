public class TestaCarro {
    public void main(String[] args) {
        // instanciar o primeiro objeto
        Carro obj1 = new Carro(
                "Fiat",
                "Un0",
                0,
                false
        );
        obj1.ligar();
        obj1.acelerar(40);
        obj1.frear(20);

        //instanciar o segundo objeto
        Carro obj2 = new Carro(
                "Volkswagen.",
                "Jetta.",
                0,
                false
        );
        obj2.ligar();
        obj2.acelerar(100);
        obj2.frear(120);
        System.out.println(obj2.toString());


        //ou encerrar...
        obj2.desligar();
    }
}
