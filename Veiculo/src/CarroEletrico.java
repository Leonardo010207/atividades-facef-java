public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico() {
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    public void abastecer() {
        System.out.println("Recarregando a bateria em posto de carga rápida");
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }
}
