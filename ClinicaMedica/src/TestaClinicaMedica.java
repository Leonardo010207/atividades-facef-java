import java.time.LocalDateTime;

public class TestaClinicaMedica {
    public void main(String[] args) {
        Medico med1 = new Medico("Gastro", "Leandro", 123);
        Paciente pac1 = new Paciente(154, "Marcio", "34654200");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 10, 40);
        Consulta con1 = new Consulta(data, 150f, med1, pac1);

        System.out.println(con1.toString());
    }
}
