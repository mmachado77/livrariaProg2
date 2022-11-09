package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Livro> biblioteca = new ArrayList<>();
		menu(biblioteca);
	}


public static void menu(ArrayList<Livro> biblioteca) {
	Scanner teclado = new Scanner (System.in);
	int input;
	input = 69;
		while(input!=0) {
			System.out.println("\nEscolha uma opção: \n 1 - Cadastrar novo livro. \n 2 - Listar livros."
					+ "\n 3 - Buscar livro por nome. \n 4 - Buscar livro por categoria. \n 5 - Buscar livro por preço."
					+ "\n 9 - Gerar banco de dados fictício. \n 0 - Encerrar atividades.");
			input = teclado.nextInt();
				if (input==1) {
					cadastroLivro(biblioteca);
				}
				if (input==2) {
					listarLivros(biblioteca);
				}
				if (input==3) {
					buscaNome(biblioteca);
				}
				if (input==4) {
					buscaCategoria(biblioteca);
				}
				if(input==9) {
					criarBiblioteca(biblioteca);
				}
		}
	}
public static void criarBiblioteca(ArrayList<Livro> biblioteca) {
	biblioteca.add(new Livro("A revolução dos bichos", "Companhia das Letras", "Ficção", 2007, 9.9));
	biblioteca.add(new Livro("É assim que começa", "Galera", "Romance", 2019, 49.9));
	biblioteca.add(new Livro("Box Trilogia O Senhor dos Anéis", "HarperCollins", "Fantasia", 2022, 89.9));
	biblioteca.add(new Livro("O homem mais rico da Babilônia", "HarperCollins", "Clássico", 2017, 17.99));
	biblioteca.add(new Livro("1984", "Companhia das Letras", "Ficção", 2009, 9.30));
	biblioteca.add(new Livro("Kit Estilhaça-me: A série completa", "Universo dos Livros", "Ficção", 2020, 89.98));
	biblioteca.add(new Livro("Imperfeitos", "Faro Editorial", "Romance", 2022, 22.40));
	biblioteca.add(new Livro("Verity", "Galera", "Romance", 2020, 33.24));
	biblioteca.add(new Livro("Os segredos da mente milionária", "Editora Sextante", "Finanças", 2006, 33.70));
	biblioteca.add(new Livro("Mais esperto que o Diabo: O mistério revelado da liberdade e do sucesso", "Citadel", "Finanças", 2014, 22.50));
}

public static void cadastroLivro(ArrayList<Livro> biblioteca) {
	Scanner tCadastro = new Scanner (System.in);
	String titulo, editora, categoria;
	int ano;
	double valor;
	System.out.println("Digite o nome do Livro:");
	tCadastro.reset();
	titulo = tCadastro.nextLine();
	System.out.println("Digite o nome da editora:");
	tCadastro.reset();
	editora = tCadastro.nextLine();
	System.out.println("Digite a categoria:");
	tCadastro.reset();
	categoria = tCadastro.nextLine();
	System.out.println("Digite o ano da publicação:");
	tCadastro.reset();
	ano = tCadastro.nextInt();
	System.out.println("Digite o valor:");
	tCadastro.reset();
	valor = tCadastro.nextDouble();
	biblioteca.add(new Livro(titulo, editora, categoria, ano, valor));
}

public static void listarLivros(ArrayList<Livro> biblioteca) {
		for (int i=0; i<biblioteca.size(); i++) {
			Livro index = biblioteca.get(i);
			index.info();
			System.out.print("\n");
		}
}

public static void buscaNome(ArrayList<Livro> biblioteca) {
	Scanner tTitulo = new Scanner(System.in);
	System.out.println("Digite o termo que deseja utilizar para a busca:");
	String termo;
	tTitulo.reset();
	termo = tTitulo.nextLine();
		for (int i=0; i<biblioteca.size(); i++) {
			Livro index = biblioteca.get(i);
				if(index.titulo.contains(termo)) {
					index.info();
				}
		}
}

public static void buscaCategoria(ArrayList<Livro> biblioteca) {
	boolean check = true;
	String bCategoria;
	System.out.println("Escolha uma categoria:");
		for (int i=0; i<biblioteca.size(); i++) {	
			Livro index = biblioteca.get(i);
			bCategoria = index.categoria;
				for (int k=0; k<biblioteca.size(); k++) {
					if(index.categoria==bCategoria) {
						
					}
				}
				if(check==true) {
					System.out.println("teste");
					index.pCategoria();
				}
		}
}

}
