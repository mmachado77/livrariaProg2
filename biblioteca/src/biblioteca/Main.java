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
	biblioteca.add(new Livro("É assim que começa", "Galera", "Ficção", 2022, 50));
	biblioteca.add(new Livro("É assim que começa 2", "Galera", "Romance", 2022, 50));
	biblioteca.add(new Livro("É assim que começa 3", "Galera", "Ficção", 2022, 50));
	biblioteca.add(new Livro("É assim que começa 4", "Galera", "Romance", 2022, 50));
	biblioteca.add(new Livro("É assim que começa 4", "Galera", "Terror", 2022, 50));
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
	System.out.println("Digite o termo que deseja utilizar para a busca:");
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
