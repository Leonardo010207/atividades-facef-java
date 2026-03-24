public class TestaJogoBasquete {
    public void main(String[] args){
        JogoBasquete j1 = new JogoBasquete("LAKERS", "SESI FRANCA");
        j1.registrarPonto("casa", 3);
        j1.registrarPonto("visitante", 2);
        j1.registrarPonto("casa", 2);
        j1.registrarPonto("casa", 2);
        j1.registrarPonto("visitante", 3);
        j1.registrarPonto("casa", 3);
        j1.registrarPonto("casa", 1);
        j1.registrarPonto("visitante", 3);
        j1.registrarPonto("casa", 2);
        j1.proximoQuarto();
        j1.registrarPonto("visitante", 3);
        j1.registrarPonto("visitante", 2);
        j1.registrarPonto("casa", 2);
        j1.registrarPonto("visitante", 1);
        j1.proximoQuarto();

        System.out.println(j1);
    }
}

