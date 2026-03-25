public class TestaEdificioApartamento {
    public void main(String[] args) {
        Edificio ed1 = new Edificio("Residencial Sol", "Rua A, 123");

        ed1.construirApartamento(101, 1);
        ed1.construirApartamento(202, 2);
        ed1.construirApartamento(303, 3);

        System.out.println(ed1.toString());
    }
}