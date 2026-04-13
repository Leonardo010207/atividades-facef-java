public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado = false;
    private double temperaturaAtual = 22.0; // Temperatura padrão

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("🌡️ Termostato LIGADO!");
        System.out.println("Começando a monitorar a temperatura...");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("🌡️ Termostato DESLIGADO!");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            // Simula variação de temperatura
            temperaturaAtual += (Math.random() - 0.5) * 2; // Varia entre -1 e +1
            temperaturaAtual = Math.round(temperaturaAtual * 10.0) / 10.0; // Arredonda
            System.out.println("📊 Lendo temperatura: " + temperaturaAtual + "°C");
            return temperaturaAtual;
        } else {
            System.out.println("⚠️ Termostato desligado! Não é possível ler temperatura.");
            return -1;
        }
    }

    // Método auxiliar
    public boolean estaLigado() {
        return ligado;
    }
}