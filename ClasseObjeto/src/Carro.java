public class Carro {
    public String marca, modelo;
    public float velocidade;
    public boolean motor;

    public Carro(String marca, String modelo, float velocidade, boolean motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // ligar o carro
    public void ligar() {
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor ligado");
        }
    }

    // desligar o carro
    public void desligar() {
        if (this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor desligado");
        }
    }

    public void acelerar(float x) {
        if (this.motor) {
            this.velocidade += x;
            System.out.println("nova velocidade: " + this.velocidade);
        }
    }

    public void frear(float x) {
        if (this.motor && this.velocidade > x) {
            this.velocidade -= x;
            System.out.println("nova velocidade: " + this.velocidade);
        }

        System.out.println("Não foi possível frear");
    }

    public String toString() {
        // this representa o objeto que chama o método
        return "Marca: " + this.marca + " " +
                "Modelo: " + this.modelo + " " +
                "Velocidade :" + this.velocidade + " " +
                "Motor :" + this.motor;
    }
}
