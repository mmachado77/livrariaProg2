package biblioteca;

public class Livro {
		String titulo, editora, categoria;
		double valor;
		int ano;
	
	public Livro (String titulo, String editora, String categoria, int ano, double valor) {
		this.titulo = titulo;
		this.editora = editora;
		this.categoria = categoria;
		this.ano = ano;
		this.valor = valor;
}
void info() {
		System.out.println("Título/Editora: " + this.titulo + "/" + this.editora);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Ano: " + this.ano);
		System.out.println("Valor: R$ " + this.valor);
}

void pCategoria() {
	System.out.println("- " + this.categoria + ";\n");
}

void novoValor(double novoValor) {
	this.valor = novoValor;
}


}
