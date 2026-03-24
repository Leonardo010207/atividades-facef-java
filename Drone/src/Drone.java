public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    private void setCodigo(String c) {
        this.codigo = c;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setAltura(float a) {
        if (a >= 0 && a < 120) {
            this.altura = a;
        } else System.out.println("Altura inválida!!");
    }

    public float getAltura() {
        return this.altura;
    }

    public void setBateria(int b) {
        if (b > 0 && b < 100) {
            this.bateria = b;
        } else System.out.println("Bateria inválida!!");
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public boolean getEmVoo() {
        return this.emVoo;
    }

    public void decolar() {
        if (this.bateria > 20) {
            if (testarMotores()) {
                this.setEmVoo(true);
                this.setAltura(2);
            } else System.out.println("Falha nos motores!!");
        } else System.out.println("Bateria baixa!!");
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando o GPS...");
        int randomico = (int) (Math.random() * 10);
        boolean status;

        if (randomico < 8) {
            status = true;
        } else status = false;

        return status;
    }

    public void subir(float x) {
        if (this.emVoo) {
            this.setAltura(this.altura += x);
        }
    }

    public void descer(float x) {
        if (this.emVoo) {
            this.setAltura(this.altura -= x);
        }
    }
}
