import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestaBiblioteca {
    public void main(String[] args) {
        Leitor lei1 = new Leitor(123, "Leonardo");
        Livro liv1 = new Livro(153, "O Pequeno Principe", "Antoine de Saint-Exupéry");

        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucaoPrevista = LocalDateTime.of(2026,4,12,12,0);

        Emprestimo emp1 = new Emprestimo(dataEmprestimo, dataDevolucaoPrevista, lei1, liv1);

        System.out.println(emp1.toString());
    }
}
