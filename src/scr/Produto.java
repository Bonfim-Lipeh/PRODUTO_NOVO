package scr;

//Não estava conseguindo compilar o localdate e vi no chatgpt que precisava colocar esse import

import java.time.LocalDate;


public class Produto {
	
	private String nome;
	private double precoc;
	private double precov;
	private LocalDate dataf; //Método de segurança
	private LocalDate datav;
	
	//Construtor base apenas para declara-los
	public Produto(String nome, double precoc, double precov, LocalDate dataf, LocalDate datav) {
		
		this.nome = nome;
		this.precoc = precoc;
		this.precov = precov;
		this.dataf = dataf;
		this.datav = datav;
	}
	
	//Construtor recebe apenas preço de custo, preço de venda e da data de fabricação || usado para add contagem de meses   na data de fabricação
	public Produto(String nome, double precoc, double precov, LocalDate datafv) {
		
		this.nome = nome;
		this.precoc = precoc;
		this.precov = precov;
		this.dataf = dataf;
		this.datav = dataf.plusMonths(1);// plusmonths está adicionado no LocalDate apropriado justamente para contagem de meses
		
	}

//Construtor recebe apenas nome e preço de custo || usado para add preço de venda e data de fabriação
	public Produto(String nome, double precoc) {

		this.nome = nome;
		this.precoc = precoc;
		this.precov = precoc + precoc / 10; //adicionando os 10% ao preço de custo para adquirir o preço de venda;
		this.dataf = LocalDate.now();
		this.datav = dataf.plusMonths(1);
		
}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrecov(){
		return precov;
	}
	
	public  double getPrecoc() {
		return precoc;
	}
	
	public LocalDate getDataf() {
		return dataf;
	}
	
	public LocalDate getDatav() {
		return datav;
	}

public class Main {
	
    public static void main(String[] args) {
    	
        // Criando um produto com todos os atributos
        Produto p1 = new Produto("Smartphone", 1500, 2000, LocalDate.of(2023, 11, 15), LocalDate.of(2024, 1, 15));
    
    System.out.println("Informações dos produtos:");

    // Imprimindo informações detalhadas do produto 1 
    System.out.println("\nInformações detalhadas do produto 1:");
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Preço de Custo: R$" + p1.getPrecoc());
    System.out.println("Preço de Venda: R$" + p1.getPrecov());
    System.out.println("Data de Fabricação: " + p1.getDataf());
    System.out.println("Data de Validade: " + p1.getDatav());
    }  
}
}