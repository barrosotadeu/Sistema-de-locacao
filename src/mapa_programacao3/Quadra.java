package mapa_programacao3;

import java.util.Scanner;

public class Quadra {
	private int nome;
	private String tipoDaQuadra;
	private int valorMinuto;
	
	public Quadra() {		
		
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public String getTipoDaQuadra() {
		return tipoDaQuadra;
	}

	public void setTipoDaQuadra(String tipoDaQuadra) {
		this.tipoDaQuadra = tipoDaQuadra;
	}

	public int getValorMinuto() {
		return valorMinuto;
	}

	public void setValorMinuto(int valorMinuto) {
		this.valorMinuto = valorMinuto;
	}
	
	public void cadastraQuadra() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o codigo da quadra: ");
		this.nome = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o tipo da quadra: ");
		this.tipoDaQuadra = teclado.nextLine();
		System.out.println("Informe o valor do minuto da quadra: ");
		this.valorMinuto = teclado.nextInt();
		
		
	}
	
	
}
