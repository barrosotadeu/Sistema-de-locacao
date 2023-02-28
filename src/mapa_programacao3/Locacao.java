package mapa_programacao3;

import java.util.Scanner;

public class Locacao {
	private Locatario locatario = new Locatario();
	private Quadra quadra = new Quadra();
	private int tempoMinuto;
	private char necessitaEquipamento;
	
	public Locacao() {
		
	}
	
	public void cadastrarLocacao() {
		this.quadra.cadastraQuadra();
		this.locatario.cadastrarLocatario();
		this.locatario.verificarMaioridade();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o tempo da locacao em minutos: ");
		this.tempoMinuto = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe se havera necessidade de equipamentos especiais(S - sim, N - não");
		this.necessitaEquipamento =  teclado.nextLine().charAt(0);
		
		this.calcularLocacao();
		this.mostraResumoLocacao();
	}
	
	private double calcularLocacao() {
		if(this.tempoMinuto > 120) {
			int desconto = (int) (this.quadra.getValorMinuto() * 0.1);
			int valorDoMinutoComDesconto = this.quadra.getValorMinuto() - desconto;
			this.quadra.setValorMinuto(valorDoMinutoComDesconto);
		}
		
		double valorDaLocacao = this.tempoMinuto * this.quadra.getValorMinuto();
		
		if(this.necessitaEquipamento == 's') {
			valorDaLocacao += 50;
		}
		
		return valorDaLocacao;
		
	}
	
	public void mostraResumoLocacao() {
		System.out.println("Locatario");
		System.out.println("Nome: " + this.locatario.getNome());
		System.out.println("CPF: " + this.locatario.getCpf());
		System.out.println("Telefone: " + this.locatario.getTelefone());
		System.out.println("Ano de nascimento: " + this.locatario.getAnoNascimento());
		System.out.println("Quadra");
		System.out.println("Nome da quadra: " + this.quadra.getTipoDaQuadra() + " " + this.quadra.getNome());
		System.out.println("Tipo: " + this.quadra.getTipoDaQuadra());
		System.out.println("Valor do minuto: " + this.quadra.getValorMinuto());
		System.out.println("Locacao");
		System.out.println("Tempo em minutos: " + this.tempoMinuto);
		System.out.println("Necessita equipamento: " + this.necessitaEquipamento);
		System.out.println("Valor calculado: " + this.calcularLocacao());
	}
}
