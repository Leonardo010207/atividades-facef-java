public interface Autenticavel {
    void validarAcesso(String senha);
}

interface DispositivoLigavel {
    void ligar();
    void desligar();
}

interface SensorTemperatura {
    double lerTemperatura();
}