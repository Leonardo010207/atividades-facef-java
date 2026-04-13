public class TestaSmartHome {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CASA INTELIGENTE ===\n");

        FechaduraEletronica fechadura = new FechaduraEletronica();
        TermostatoSmart termostato = new TermostatoSmart();

        System.out.println("\n--- TESTANDO FECHADURA ELETRÔNICA ---");

        System.out.println("\n1. Tentando abrir sem validar:");
        fechadura.ligar();

        System.out.println("\n2. Tentando com senha incorreta:");
        fechadura.validarAcesso("0000");

        System.out.println("\n3. Validando com senha correta:");
        fechadura.validarAcesso("1234");

        System.out.println("\n4. Abrindo a fechadura:");
        fechadura.ligar();

        System.out.println("\n5. Fechando a fechadura:");
        fechadura.desligar();

        System.out.println("\n\n--- TESTANDO TERMOSTATO SMART ---");

        System.out.println("\n1. Tentando ler temperatura (desligado):");
        termostato.lerTemperatura();

        System.out.println("\n2. Ligando o termostato:");
        termostato.ligar();

        System.out.println("\n3. Lendo temperatura (5 vezes):");
        for (int i = 0; i < 5; i++) {
            double temp = termostato.lerTemperatura();
            if (temp < 20) {
                System.out.println("Muito frio!");
            } else if (temp > 25) {
                System.out.println("Muito quente!");
            } else {
                System.out.println("Temperatura confortável!");
            }
        }

        System.out.println("\n4. Desligando o termostato:");
        termostato.desligar();

        System.out.println("\n5. Tentando ler após desligar:");
        termostato.lerTemperatura();
    }
}