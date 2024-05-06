package Produtos;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ProdutoComDesconto extends Produto {
	private float desconto;

	public ProdutoComDesconto(int id, String descricao, float quantidade, float preco, float desconto) {
		super(id , descricao, quantidade, preco);
		this.desconto = desconto;
	}

	@Override
	public void work() {
		float precoComDesconto = getPreco() *(1 - desconto);
		JOptionPane.showMessageDialog(null, "Realizando trabalho com produto" + getDescricao() + "com desconto. Preço atualizado: R$" + precoComDesconto);
	}
}