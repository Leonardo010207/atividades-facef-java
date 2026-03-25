public class TestaVendasSupermercado {
    public void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz", 25.0);
        Produto p2 = new Produto(2, "Feijão", 10.0);

        Cliente cliente = new Cliente(1, "João");

        Venda venda = new Venda(1, cliente);

        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 3, p2);

        System.out.println(venda.toString());

        venda = null;

        System.out.println("Produto ainda existe: " + p1.getNome());
        System.out.println("Cliente ainda existe: " + cliente.getNome());
    }
}