import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente) {
        this.cliente = cliente;
        this.id = id;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
