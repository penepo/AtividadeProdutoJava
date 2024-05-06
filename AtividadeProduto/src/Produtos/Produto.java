package Produtos;

import javax.swing.JOptionPane;

public class Produto {
	private int id;
	private String descricao;
	private float quantidade;
	private float preco;

	public Produto(int id, String descricao, float quantidade, float preco) {
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getId() {
		return id; 
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void work() {
		JOptionPane.showMessageDialog(null, "Realizando trabalho com o produto" + descricao);
	}

}
