public class TestaArCondicionado {
    public void main(String[] args) {
        ArCondicionado a1 = new ArCondicionado(
                "samsung",
                "WindFree",
                20
        );

        a1.ativarTurbo();
        System.out.println(a1);
    }
}
