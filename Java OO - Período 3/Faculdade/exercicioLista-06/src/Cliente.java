import java.util.ArrayList;

public class Cliente {
    String cpf;
    String nome;
    String telefone;

    ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void addPedidos(){
        this.pedidos.add(pedido);
    }
}
