import java.util.ArrayList;

public class TestaDesenvolvedor {

    public void exibir(Desenvolvedor camaleao) { // Polimorfismo
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bônus " + camaleao.calcularBonus());
    }

    public void main(String[] args) {
        Junior jr1 = new Junior("Fulano", "Java", 4000f, "Beltrano");
        exibir(jr1);

        Pleno pl1 = new Pleno("Beltrano", "Java", 6000f, 5);
        exibir(pl1);

        Senior sr1 = new Senior("Ciclano", "Java", 8000f, 2000f);
        exibir(sr1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<Desenvolvedor>();
        empresa.add(jr1);
        empresa.add(pl1);
        empresa.add(sr1);
    }
}
