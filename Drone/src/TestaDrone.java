public class TestaDrone {
    public void main(String[] args) {
        Drone d1 = new Drone(
                "1234",
                0f,
                30,
                false
        );

        d1.decolar();
        System.out.println("Altura: " + d1.getAltura());
        System.out.println("Em voo? " + d1.getEmVoo());

        d1.subir(40f);
        System.out.println("Altura: " + d1.getAltura());
        d1.descer(15f);
        System.out.println("Altura: " + d1.getAltura());
    }
}
