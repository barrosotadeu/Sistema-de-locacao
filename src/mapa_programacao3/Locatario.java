package mapa_programacao3;

import java.time.LocalDate;
import java.util.Scanner;

public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;
    
    public Locatario(){
        
    }
    
    
    
    public void cadastrarLocatario(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do locatario: ");
        this.nome = teclado.nextLine();
        System.out.println("Informe o cpf do locatario: ");
        this.cpf = teclado.nextLine();
        System.out.println("Informe o telefone do locatario: ");
        this.telefone = teclado.nextLine();
        System.out.println("Informe o ano de nascimento do locatario: ");
        this.anoNascimento = teclado.nextInt();
        
       
        
        
    }
    
    public void verificarMaioridade() {
    	int anoAtual = LocalDate.now().getYear();
    	if(anoAtual - this.anoNascimento <= 18) {
    		System.out.println("Locatario e menor de idade!");
    		System.exit(0);
    	}
    	
    }



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public int getAnoNascimento() {
		return anoNascimento;
	}



	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
    
    
}

