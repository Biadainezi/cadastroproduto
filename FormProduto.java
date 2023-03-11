package com.aula.produto;
import java.awt.*;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class FormProduto extends Frame implements ActionListener {
	protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
	protected Button btnCadastrar, bSair;
	protected TextField tfNome, tfQuantidade, tfValor;
	protected Label lNome, lQuantidade, lValor;
	Produto produtoUm = new Produto();

	public FormProduto() {
		Dimension dQuadro = new Dimension(450, 230);
		Dimension dRotulo = new Dimension(70, 25);
		Dimension dCaixaTexto = new Dimension(180, 25);
		Dimension dBotao = new Dimension(130, 25);
		
		setTitle("Formulario Cadastro de Produto");
		setResizable(false);
		setSize(dQuadro);
		setLocation(250, 280);
		setLayout(null);
		
		lNome = new Label("Nome: ");
		lNome.setSize(dRotulo);
		lNome.setLocation(25, 50);
		tfNome = new TextField();
		tfNome.setSize(dCaixaTexto);
		tfNome.setLocation(100, 50);
		
		lQuantidade = new Label("Quantidade: ");
		lQuantidade.setSize(dRotulo);
		lQuantidade.setLocation(25, 90);
		tfQuantidade = new TextField();
		tfQuantidade.setSize(dCaixaTexto);
		tfQuantidade.setLocation(100, 90);
		
		lValor = new Label("Valor: ");
		lValor.setSize(dRotulo);
		lValor.setLocation(25, 125);
		tfValor = new TextField();
		tfValor.setSize(dCaixaTexto);
		tfValor.setLocation(100, 125);
		
		
		btnCadastrar = new Button("Cadastrar Produto");
		btnCadastrar.setSize(dBotao);
		btnCadastrar.setLocation(25, 160);
		btnCadastrar.addActionListener(this);
		
		bSair = new Button("Sair");
		bSair = new Button("Sair");
		bSair.setSize(dBotao);
		bSair.setLocation(140, 160);
		bSair.addActionListener(this);
		
		add(lNome);
		add(lQuantidade);
		add(lValor);
		add(tfNome);
		add(tfQuantidade);
		add(tfValor);
		add(btnCadastrar);
		add(bSair);
	}

	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnCadastrar) {
			produtoUm.setNome(tfNome.getText());
			produtoUm.setQuantidade(BigDecimal.valueOf(Double.valueOf(tfQuantidade.getText())));
			produtoUm.setValor(BigDecimal.valueOf(Double.valueOf(tfQuantidade.getText())));
			
			System.out.println("Produto:" + produtoUm.getNome() + " cadastrado!");
			
			JOptionPane.showMessageDialog(null, produtoUm.exibirProduto(), "Dados Produto",
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (evento.getSource() == bSair) {
			System.out.println("Fim do Aplicativo. Obrigado!");
			System.exit(0);
		}
	}
}