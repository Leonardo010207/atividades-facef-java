public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador() {
    }

    public Computador(int id, String marca, String marcaProc, String modeloProc, double frequenciaProc) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, frequenciaProc);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
