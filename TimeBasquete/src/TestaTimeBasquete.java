public class TestaTimeBasquete {
    public void main(String[] args) {
        Atleta atl1 = new Atleta(123, "Leonardo", "Armador");
        Atleta atl2 = new Atleta(764, "Caio", "Pivõ");

        Time tim1 = new Time(456, "Franca Basquete", "Helinho");

        tim1.contratarAtleta(atl1);
        tim1.contratarAtleta(atl2);

        System.out.println(tim1);

        System.out.println("==Time será removido==");

        tim1 = null;

        System.out.println("O atleta ainda existe");
        System.out.println(atl1.getNome() + " - " + atl1.getPosicao());
        System.out.println(atl2.getNome() + " - " + atl2.getPosicao());
    }
}
