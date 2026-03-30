import java.util.ArrayList;

public class TestaVetorPolimorfico {
    public void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana", "Python", 2000, "Leonardo");
        devs[1] = new Pleno("Leonardo", "Java", 5000, 10);
        devs[2] = new Senior("Carlos", "Python", 8000, 2000);
        devs[3] = new Desenvolvedor("Daniel", "JavaScript", 12000);

        for(Desenvolvedor d : devs) {
            d.codar();

            System.out.println("Bônus: " + d.calcularBonus());

            System.out.println(d.toString());

            System.out.println("---------------------------");
        }
    }
}
