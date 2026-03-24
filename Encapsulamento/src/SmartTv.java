public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv() {

    }

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume); //para não perder o encapsulamento
        this.conectadaInternet = false;
    }


    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("volume inválido");
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        if (marca.length() <= 30) {
            this.marca = marca;
        } else System.out.println("Modelo inválido");
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        //todo modelo tem que iniciar com a letra maiuscula
        char primeiro = modelo.charAt(0);
        //this.modelo = modelo.substring(0, 1).toUpperCase();
        boolean resp = Character.isUpperCase(primeiro);
        if (resp) {
            this.modelo = modelo;
        } else System.out.println("Modelo inválido");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public boolean isConectadaInternet() {
        return this.conectadaInternet;
    }

    // abrir youtube
    public void abrirYoutube() {
        // conectar-se na internet
        if (this.conectadaInternet) {
            System.out.println("Abrindo o youtube");
        } else {
            System.out.println("Youtube não pode ser aberto, estamos sem internet");
        }
    }

    //aumentar o volume em x
    public void aumentarVolume(int x) {
        this.setVolume(this.volume + x);
    }

    //diminuir volume em x
    public void diminuirVolume(int x) {
        this.setVolume(this.volume - x);
    }

    private boolean conectaInternet() {
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP do roteador...");
        // 50% de chance de conectar e 50% de chance de não conectar
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5) {
            System.out.println("Conectou na internet");
            return true;
        } else {
            System.out.println("Problema na conexão");
            return false;
        }
    }
}