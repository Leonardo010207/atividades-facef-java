public class TestaSmartTv {
    public void main(String[] args) {
        SmartTv s1 = new SmartTv();
        s1.setVolume(50);
        s1.diminuirVolume(10);
        s1.aumentarVolume(5);
        System.out.println("Volume de s1:" + s1.getVolume());
        s1.setConectadaInternet(true);
        s1.abrirYoutube();

        SmartTv s2 = new SmartTv("Samsung", "Qled de 45 polegadas", 0);
        s2.abrirYoutube();
        s2.diminuirVolume(30);
        System.out.println("Marca de s2: " + s2.getMarca());

        SmartTv s3 = new SmartTv("LG", "WideScreen", -30);
        s3.abrirYoutube();
    }
}
