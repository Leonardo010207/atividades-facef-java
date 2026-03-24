public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {

    }

    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.setTemperatura(temperatura);
        this.ligado = false;
    }

    public void isLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setTemperatura(int t) {
        if(t >= 16 && t <= 30) {
            this.temperatura = t;
        } else System.out.println("Temperatura fora da faixa");
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setMarca(String m) {
        if(m.length() >= 3) {
            this.marca = m;
        } else System.out.println("A marca deve ter pelo menos 3 caracteres");
    }

    public String getMarca() {
        return this.marca;
    }

    public void ativarTurbo() {
        if(verificarCompressor()) {
            setTemperatura(16);
        } else System.out.println("Estamos com problemas!!");
    }

    private boolean verificarCompressor() {
        boolean status;
        int randomico = (int) (Math.random() * 10);

        if( randomico > 5 ) {
            status = true;
        } else status = false;

        return status;
    }

    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura +
                "\nLigado: " + ligado;
    }

}